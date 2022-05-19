//CODE_CHANGES = getGitChanges()
pipeline {
    agent any

    stages {
        stage ("build") {
           /*when {
                expression {
                    BRANCH_NAME == 'main' // && CODE_CHANGES == true
                }
            }*/
            steps {
                echo "building the application ..."
            }
        }

        stage ("testing") {
           /* when {
                expression {
                    BRANCH_NAME == "master"
                }
            }*/
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