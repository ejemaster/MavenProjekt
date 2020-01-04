node{
 def registryProjet='registry.hub.docker.com/ejemaster/mathprojet' 
 
 def IMAGE="${registryProjet}:image-${env.BUILD_ID}"
     
       stage ('Clone Projet'){
           
           git 'https://github.com/ejemaster/mathprojet.git'
       } 
      
       stage ('Build - Maven Package') {
           bat 'mvn package'
       }
       stage ('Projekt Clean') {
           bat 'mvn clean'
       }
      
       stage('Build - Junit Test Stage')
       {
           bat 'mvn test'
       }

 def  img = stage ('Build der Image -Docker Image') {
     docker.build("$IMAGE", ".")
 }
      stage('Test image') {
       

     bat "docker run  ejemaster/mathprojet"
        
    }
      stage('Push- Push der Image auf Dockerhub'){
          docker.withRegistry('https://registry.hub.docker.com', 'docker-hub'){
          img.push("${env.BUILD_ID}")
          img.push("latest")
          }
      }
    stage('Remove Unused docker image') {
     
        bat " docker rmi ejemaster/mathprojet"
      
    }
}
