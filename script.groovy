def buildApp() {
    echo 'buiding the application from groovy script...'
}

def testApp() {
    echo 'testing the application ...'
}

def deployApp() {
    echo "deploying the application ..."
    echo "Deploying with ${params.VERSION}"
}

return this 