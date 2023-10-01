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
                bat 'cp \'build/libs/hello.war\' \'C:\\Users\\gutos\\Documents\\Dev-Stuff\\tomcat\\apache-tomcat-10.1.13\\webapps\''
            }
        }
    }
}