 def call(String Project, String ImageTag, String dockerHubUser){
   withCredentials([usernamePassword(credentialsId: 'docker-cred', passwordVariable: 'dockerHubPass',usernameVariables: 'dockerHubUser')])
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerHubuser}/${Project}:${ImageTag}"

