#This is Dockerfile
#Version 1.0
#Author: Xiaobing Liu

#Base images
FROM tomcat

#Maintainer
MAINTAINER Xiaobing Liu "bjlxbliu@cn.ibm.com"

#Run
RUN mkdir /app
ADD struts/. /app
RUN cd /app
RUN mvn -clean package

#Add
ADD struts2.war /usr/local/tomcat/webapps

EXPOSE 8080

CMD ["/usr/local/tomcat/bin/catalina.sh","run"]

