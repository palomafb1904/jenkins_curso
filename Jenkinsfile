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
node {
   checkout scm
   stage('Compile') {
      echo 'Comienza la compilacion'
      //withMaven(
      //   maven:'Maven defecto (3.6)'
      //){
         sh 'mvn compile'
      //}
      echo 'Compilado...' 
   }
   stage('Test') {
      echo 'Probando, probando...'
   }
   stage('Empaquetar') {
      echo 'Comienza la empaquetacion'
   }
}
