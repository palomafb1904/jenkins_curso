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
   stage('Compile') {
      echo 'Comienza la compilacion'
      mvn compile
      echo 'Compilado...' 
   }
   stage('Test') {
      echo 'Probando, probando...'
   }
   stage('Empaquetar') {
      echo 'Comienza la empaquetacion'
   }
}
