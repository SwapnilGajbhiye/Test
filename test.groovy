pipeline {
        agent any 
        stages {
          stage('Build') { 
            steps {
              echo 'Build Successfully Complete'
            }
          }
          stage('Test') { 
            steps {
              echo 'Test Successfully Complete'
            }
          }
          stage('Deploy') { 
            steps {
              echo 'Build Successfully Complete'
            }
          }
        }
      }