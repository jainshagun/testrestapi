pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		bat 'mvn docker:build'
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
		bat 'bat docker run -p 9999:8090 hello'
            }
    }
        stage('Test') {
            steps {
                echo 'Testing..'
	    }
        }
    }
}
