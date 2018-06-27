pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		bat 'mvn package'
            }
        }
	            stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        stage('Test') {
            steps {
                echo 'Testing..'
		bat 'java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App '
            }
        }
        }
    }
}
