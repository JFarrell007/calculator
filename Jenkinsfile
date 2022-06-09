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
//        stage("Build"){
//            steps {
//                sh 'mvn clean package'
//                //sh "mvn clean verify"
//            }
//        }
        node {
        stage("Build"){
            withMaven(maven: 'maven-3.8.5')
            //steps{
             //     sh "./mvnw clean package"
                script {
                    def mvnHome = tool "maven-3.8.5"
                    sh "'${mvnHome}/bin/mvn' clean package"
                }
            }
        }
    }
}
