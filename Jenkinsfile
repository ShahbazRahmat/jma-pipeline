//CODE_CHANGES = getGitChanges()
pipeline {
    agent any

    environment {
        hello = "test"
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
                withCredentials([
                    usernamePassword(credentials: 'github-vsi', usernameVariable: USER, passwordVariable: PWD)
                ]){
                    sh "some script ${USER} ${PWD}"
                }
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
                echo "Deploying with ${hello}"
                //sh "${GITHUB}"
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