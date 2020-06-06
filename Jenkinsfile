pipeline{
    agent any
    stages {
        stage ('Compile Stage') {

            steps {
                    bat 'mvn clean install'
            }
        }
        stage ('Test Stage') {

                steps {
                        bat 'mvn verify'
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