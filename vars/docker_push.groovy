def call(String Project, String ImageTag, String dockerhubuser){
  wtihCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass',usernameVariables: 'dockerhubuser')]){
    sh "docker login -u ${dockerHubuser} =p $[dockerhubpass}"

  }
  sh "docker push ${dockerhubuser}/${Project}:${Image.Tag}"
