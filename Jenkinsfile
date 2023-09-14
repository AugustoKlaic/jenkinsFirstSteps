pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'gradle run'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                bat 'gradle test'
            }
        }
    }
}