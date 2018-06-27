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
                     bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.4:sonar'
                     }
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
