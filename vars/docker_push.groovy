 def call(String Project, String ImageTag, String dockerhubuser){
  wtihCredentials([usernamePassword(credentialsId: 'docker-cred', passwordVariable: 'dockerHubPass',usernameVariables: 'dockerHubUser')])
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"

