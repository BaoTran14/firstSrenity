pipeline{
    agent any
    stages {
        stage ('Compile Stage') {

            steps {

                withMaven(maven: 'maven_3_6_1') {
                    sh 'mvn clean install'

                }

            }
        }
        stage ('Test Stage') {

                steps {

                    withMaven(maven: 'maven_3_6_1') {
                        sh 'mvn verify'

                    }

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