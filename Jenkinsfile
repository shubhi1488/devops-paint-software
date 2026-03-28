pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('Compile') {
            steps {
                echo '====== STAGE 1: Compiling Java Source Files ======'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo '====== STAGE 2: Running Unit Tests ======'
                bat 'mvn test'
            }
            post {
                always {
                    echo 'Test stage finished.'
                }
            }
        }

        stage('Package') {
            steps {
                echo '====== STAGE 3: Packaging into JAR ======'
                bat 'mvn package -DskipTests'
            }
        }

        stage('Archive') {
            steps {
                echo '====== STAGE 4: Archiving Build Artifact ======'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESS - paint-software.jar is ready!'
        }
        failure {
            echo 'BUILD FAILED - Check the console output above.'
        }
    }
}