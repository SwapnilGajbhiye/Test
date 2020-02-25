pipeline {
        agent any 
        stages {
          stage('Build') { 
            steps {
              print ("Build Succeed") 
            }
          }
          stage('Test') { 
            steps {
              print("")
            }
          }
          stage('Deploy') { 
            steps {
              // 
            }
          }
        }
      }