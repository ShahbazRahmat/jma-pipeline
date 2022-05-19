//CODE_CHANGES = getGitChanges()
pipeline {
    agent any

    environment {
        hello = "test"
        TEST = credentials('test')
    }

    parameters {
        string(name: 'VERSION', defaultValue: '', description: 'version to deploy on prod')
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
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
                /*withCredentials([
                    usernamePassword(credentialsId: 'TEST', usernameVariable: 'USER', passwordVariable: 'PWD')
                ]){
                    sh "some script $USER $PWD"
                }*/

                /*withCredentials([
                    usernamePassword(credentialsId: 'mycreds', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')
                    ]) {
                        sh 'cf login some.awesome.url -u $USERNAME -p $PASSWORD'

                    }*/
            }
        }

        stage ("testing") {
            when {
                expression {
                    //BRANCH_NAME == "master"
                    params.executeTests == true
                }
            }
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