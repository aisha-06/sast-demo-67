
pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                   mvn sonar:sonar -Dsonar.projectKey=SAST-Demo-67 -Dsonar.projectName=SAST-Demo-67
                }
            }
        }
    }
}
