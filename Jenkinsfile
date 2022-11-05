def gv

pipeline {
  
  agent any
    tools {
    nodejs "my-node" 
  }
    stages {
        stage("init") {
           steps {
               script {
                  gv = load "script.groovy"
                }
              }
            }
          
        stage("build application") {
          steps {
              script {
                 gv.buildAnsible()
                }
              }
            }  
        
        stage("build docker") {
          steps {
              script {
                 gv.buildDocker()
                }
              }
            }
      stage("push image") {
          steps {
              script {
                 gv.pushDockerhub()
                }
              }
            }
   }
}
