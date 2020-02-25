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
              print("Test Succeed")
            }
          }
          stage('Deploy') { 
            steps {
              print("Deployment Completed") 
            }
          }
        }
      }