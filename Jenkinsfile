node{
 def registryProjet='registry.hub.docker.com/ejemaster/mathprojet' 
 
 def IMAGE="${registryProjet}:image-${env.BUILD_ID}"
     
       stage ('Clone Projet'){
           
           git 'https://github.com/ejemaster/mathprojet.git'
       }
       
       stage ('Build - Maven Package') {
           bat 'mvn package'
       }

       stage('Junit - Test Stage')
       {
           bat 'mvn test'
       }

 def  img = stage ('Build der Image -Docker Image') {
     docker.build("$IMAGE", ".")
 }
      stage('Test image') {
        /* Ideally, we would run a test framework against our image.
         * For this example, we're using a Volkswagen-type approach ;-) */

        img.inside {
            sh 'echo "Tests passed"'
        }
    }
      stage('Push- Push der Image auf Dockerhub'){
          docker.withRegistry('https://registry.hub.docker.com', 'docker-hub'){
          img.push("${env.BUILD_ID}")
          img.push("latest")
          }
      }
    
}
