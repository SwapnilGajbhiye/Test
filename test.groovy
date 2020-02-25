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