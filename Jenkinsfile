/*pipeline {
   agent any
   stages {
      stage('Etapa 1') {
         steps {
           echo 'Hola mundo'
         }
      }
   }
}*/
node(master) {
   checkout scm
   stage('Compile') {
      echo 'Comienza la compilacion'
      withMaven(
         maven:'Maven Defecto (3.6)'
      ){
         sh 'mvn compile'
      }
      echo 'Compilado...' 
   }
   stage('Test') {
      echo 'Probando, probando...'
   }
   stage('Empaquetar') {
      echo 'Comienza la empaquetacion'
   }
}
