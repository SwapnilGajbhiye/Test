pipeline {
        agent any 
        stages {
          stage('Build') { 
            steps {
              print 
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