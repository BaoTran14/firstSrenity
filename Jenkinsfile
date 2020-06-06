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
    },
    node {
     // publish the Serenity report

        publishHTML(target: [
            reportName : 'Serenity',
            reportDir:   'target/site/serenity',
            reportFiles: 'index.html',
            keepAll:     true,
            alwaysLinkToLastBuild: true,
            allowMissing: false
        ])
    }
}