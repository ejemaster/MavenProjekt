node{
 def registryProjet='https://hub.docker.com/repository/docker/ejemaster/mathprojet' 
 
 def IMAGE="${registryProjet}:image-${env.BUILD_ID}"
     
       stage ('Clone Projet'){
           
           git 'https://github.com/ejemaster/MavenProjekt.git'
       }
       
       stage ('Build - Maven Package') {
           sh 'mvn package'
       }

       stage('Junit - Test Stage')
       {
           sh 'mvn test'
       }

 def  img = stage ('Build der Image -Docker Image') {
     docker.build("$IMAGE", ".")
 }
      stage('Test image') {
       

     sh "docker run  ejemaster/mathprojet"
        
    }
      stage('Push- Push der Image auf Dockerhub'){
          docker.withRegistry('https://registry.hub.docker.com', 'docker-hub'){
          img.push("${env.BUILD_ID}")
          img.push("latest")
          }
      }
    stage('Remove Unused docker image') {
     
        sh " docker rmi ejemaster/mathprojet"
      
    }
}
