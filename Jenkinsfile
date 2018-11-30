/*pipeline {
   agent any
   stages {
      stage('Compilar') {
         steps {
            echo 'Empezando la compilacion...'
            withMaven(
               maven:'Maven Defecto (3.6)'
            ){
               sh 'mvn compile'
            }
            echo 'Compilado...'
         }
      }
      stage('Test'){
         steps {
            echo 'Probando, probando...'
            withMaven(
               maven:'Maven Defecto (3.6)'
            ){
               sh 'mvn test'
            }
         }
      }
      stage('Empaquetar'){
         steps {
            echo 'Comienza la empaquetacion'
            withMaven(
               maven:'Maven Defecto (3.6)'
            ){
               sh 'mvn package'
            }
         }
      }
   }
   post{
      always {
         deleteDir()
      }
      failure {
         echo 'Fallando....'  
      }
      success {
         echo 'Exito!!!'  
      }
      changed {
         echo 'Cambioooooo'
      }
   }
}*/
/* con el with maven funcionando
node {
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
      withMaven(
         maven:'Maven Defecto (3.6)'
      ){
         sh 'mvn test'
      }
   }
   stage('Empaquetar') {
      echo 'Comienza la empaquetacion'
      withMaven(
         maven:'Maven Defecto (3.6)'
      ){
         sh 'mvn package'
      }
   }
}*/
/*node {
   checkout scm
   stage('Compile') {
      echo 'Comienza la compilacion'
      sh 'mvn compile'
      echo 'Compilado...' 
   }
   stage('Test') {
      echo 'Probando, probando...'
      sh 'mvn test'
      junit '** /*.xml'
   }
   stage('Empaquetar') {
      echo 'Comienza la empaquetacion'
      try{
         sh 'mvn package'
      }finally{
         echo 'Finally'
         //deleteDir()
      }
   }
}*/
/*El try se puede poner fuera de un stage y el stage dentro, o dentro de cada stage definir un try-catch. Importate hacer el throw*/
/*node {
    try {
        stage('Test') {
            sh 'echo "Ole ole"; exit 0'
        }
        echo 'Se ejecuta si exito'
    } catch (e) {
        echo 'Se ejecuta si fallo'
        throw e
    } finally {
        def currentResult = currentBuild.result ?: 'SUCCESS'
        if (currentResult == 'UNSTABLE') {
            echo 'Se ejecuta si unstable'
        }

        def previousResult = currentBuild.previousBuild?.result
        if (previousResult != null && previousResult != currentResult) {
            echo 'Se ejecuta si hay cambio de estado'
        }

        echo 'Se ejecuta siempre'
    }
}*/

node { 
    checkout scm
    stage('Compilar') {
	   echo "Comienza la compilacion..."
	   withMaven(
           maven:'Maven Test'			
	   ){
         sh 'mvn compile'
	   }
    }
    stage('Test') {
	   echo "Comienzan las pruebas..."
	   withMaven(
           maven:'Maven Test'			
	   ){
         sh 'mvn test'
	   }
    }
    stage('Empaquetar') {
	   echo "Comienza la empaquetacion..."
	   withMaven(
           maven:'Maven Test'			
	   ){
         sh 'mvn package'
	   }
    }
}
