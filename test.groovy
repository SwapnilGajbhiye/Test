pipeline {
        agent any 
        stages {
          stage('Build') { 
            steps {
              print ("Build ") 
            }
          }
          stage('Test') { 
            steps {
              // 
            }
          }
          stage('Deploy') { 
            steps {
              // 
            }
          }
        }
      }