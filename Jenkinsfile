pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		bat 'cd githubproject'
		bat 'mvn package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		bat 'java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App '
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
