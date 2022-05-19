pipeline {
    agent any

    stages {
        stage ("build") {
            steps {
                echo "building the application ..."
            }
        }

        stage ("testing") {
            steps {
                echo "testing the application ..."
            }
        }
        stage ("deployment") {
            steps {
                echo "deploying the application ..."
            }
        }
    }
    post {
        always {
            echo "Always statement"
        }
        success {
            echo "success statement"
        }
        failure {
            echo "Failure statement"
        }
    }
}