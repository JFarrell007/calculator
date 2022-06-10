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
                junit '*/build/test-results/*.xml'
                step([$class: 'JacocoPublisher'])
                //sh "mvn clean verify"
            }
        }
    }
  }

