def cDownload(repo)
{
  git "https://github.com/Ashok-Cherukuri/${repo}"
}
def cBuild()
{
  sh 'mvn package'
}
def cDeploy(ip, appname)
{
   deploy "adapters: [tomcat9(credentialsId: '42cca5b6-494f-4fda-b243-938b9a4f49e9', path: '', url: 'http://${ip}], contextPath:${appname}, war: '**/*.war'"
}
   
