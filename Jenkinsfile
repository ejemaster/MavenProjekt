node{
 def registryProjet='registry.hub.docker.com/ejemaster/mathprojet' 
 
 def IMAGE="${registryProjet}:image-${env.BUILD_ID}"
     
       stage ('Build - clone Projet'){
           
           git 'https://github.com/ejemaster/mathprojet.git'
       }
       
       stage ('Build - Maven Package') {
           bat 'mvn package'
       }

       stage('Junit - Test Stage')
       {
           bat 'mvn test'
       }

 def  img = stage ('Build-Docker Image') {
     docker.build("$IMAGE", ".")
 }
      
      stage('Build- Push der Image auf Dockerhub'){
          docker.withRegistry('https://registry.hub.docker.com', 'docker-hub'){
          img.push("${env.BUILD_ID}")
          img.push("latest")
          }
      }
    
}
