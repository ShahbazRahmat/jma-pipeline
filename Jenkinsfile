//CODE_CHANGES = getGitChanges()
def gv

pipeline {
    agent any

    environment {
        hello = "test"
        //TEST = credentials('test')
    }

    parameters {
        string(name: 'VERSION', defaultValue: '', description: 'version to deploy on prod')
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }

    stages {
        stage ("init") {
            steps {
                gv = load "script.groovy"
            }
        }
        stage ("build") {
           /*when {
                expression {
                    "${BRANCH_NAME}" == 'main' // && CODE_CHANGES == true
                }
            }*/
            steps {
                script {
                    gv.buildApp()
                }
                //echo "building the application ..."
                /*withCredentials([
                    usernamePassword(credentialsId: 'TEST', usernameVariable: 'USER', passwordVariable: 'PWD')
                ]){
                    sh "some script $USER $PWD"
                }*/
            }
        }

        stage ("testing") {
            when {
                expression {
                    //BRANCH_NAME == "master"
                    params.executeTests
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage ("deployment") {
            steps {
                //echo "deploying the application ..."
                //echo "Deploying with ${params.VERSION}"
                //sh "${GITHUB}"
                script {
                    gv.deployApp()
                }
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