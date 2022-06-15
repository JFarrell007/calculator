pipeline {
    tools {
        maven 'maven-3.8.5'
        jdk 'JDK11'
    }
    
    agent any
    stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/JFarrell007/calculator.git', branch: 'main',
                credentialsId: '0c86d099-b471-4b73-bf11-9d97cca03baa'
            }
        }
        stage("Build"){
            steps {
                sh 'mvn clean package'
                //junit '*/build/test-results/*.xml'
                //step([$class: 'JacocoPublisher'])
                //sh "mvn clean verify"
            }
        }
        stage("Docker build"){
            steps {
                sh "docker build -t localhost:5000/calculator ."
            }
        }
        stage("Docker push"){
            steps {
                sh "docker push localhost:5000/calculator"
            }
        }
        stage("Deploy to staging"){
            steps {
                sh "docker run -d --rm -p 9090:8080 --name calcualtor localhost:5000/calculator"
            }
        }
        stage("Acceptance test"){
            steps {
                sleep 20
                sh "chmod +x acceptance_test.sh && ./acceptance_test.sh"
            }
        }              
    }
         post {
            always {
                sh "docker stop container"
            }
        }   
  }

