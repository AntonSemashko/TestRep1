pipeline {
    agent { label 'linux'}
    stages {
        stage('Example') {
            steps {
                withGroovy(tool:'3.0.8') {
                    sh 'groovy --version'
                }
            }
        }
    }
}