//CODE_CHANGES = getGitChanges()
pipeline {
    agent any

    environment {
        hellow = "test"
        GITHUB = credentials('github-vsi')
    }

    stages {
        stage ("build") {
           /*when {
                expression {
                    "${BRANCH_NAME}" == 'main' // && CODE_CHANGES == true
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
                echo "Deploying with ${GITHUB}"
                sh "${GITHUB}"
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