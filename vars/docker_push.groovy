def call(String Project, String ImageTag, String dockerhubuser){
  wtihCredentials([usernamePassword(credentialsId: 'docker-cred', passwordVariable: 'dockerHubPass',usernameVariables: 'dockerHubUser')])
    sh "docker login -u ${dockerHubuser} =p $[dockerHubPass}"

  }
  sh "docker push ${dockerhHubUser}/${Project}:${ImageTag}"
}
