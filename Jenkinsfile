pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		bat 'mvn package'
            }
	    post{
		always{
                     withSonarQubeEnv('sonarQube') {
                     // requires SonarQube Scanner for Maven 3.2+
                     bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
                     }
                }
	    }
        }
    stage('Deploy') {
            steps {
                echo 'Deploying....'
		bat 'java -jar target/RestAPI-0.0.1-SNAPSHOT.jar'
            }
    }
        stage('Test') {
            steps {
                echo 'Testing..'
	    }
        }
    }
}
