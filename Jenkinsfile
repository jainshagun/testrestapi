pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		bat 'mvn package'
            }
	post('SonarQube analysis') {
    // requires SonarQube Scanner 2.8+
    def scannerHome = tool 'SonarQube Scanner 2.7.1';
    withSonarQubeEnv('My SonarQube Server') {
      bat "${scannerHome}/bin/sonar-scanner"
    }
  }
        }
    stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
    }
        stage('Test') {
            steps {
                echo 'Testing..'
		bat 'java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App '
	    }
        }
    }
}
