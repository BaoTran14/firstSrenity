pipeline{
    agent any
    stages {
        stage ('Compile Stage') {

            steps {
                    sh 'mvn clean install'
            }
        }
        stage ('Test Stage') {

                steps {
                        sh 'mvn verify'
                }
            }

        stage('Deploy to Staging'){
            steps {
                    echo "Ok"
                }
        }

        stage ('Serenity Reports') {

            steps {
                echo "Ok"
            }
        }
    }
}