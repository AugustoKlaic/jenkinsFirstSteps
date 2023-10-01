pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'gradle war'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                bat 'gradle test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'deploying'
                deploy adapters: [tomcat9(credentialsId: 'tomcat_credential',
                                            path: '',
                                            url: 'http://localhost:8080')],
                                            contextPath: '/hello',
                                            onFailure: false,
                                            war: 'build/libs/hello.war'
            }
        }
    }
}