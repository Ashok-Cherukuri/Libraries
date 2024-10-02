def cDownload(repo)
{
  git "https://github.com/Ashok-Cherukuri/${repo}"
}
def cBuild()
{
  sh 'mvn package'
}
def cDeploy(jobname, ip, appname)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war   ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
