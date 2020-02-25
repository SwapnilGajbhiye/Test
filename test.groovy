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
              print("Test Succeed")
            }
          }
          stage('Deploy') { 
            steps {
              print("Dep") 
            }
          }
        }
      }