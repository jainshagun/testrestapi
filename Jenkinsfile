pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		mvn -v
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
