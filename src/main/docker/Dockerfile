# 基础镜像使用java
FROM java:8
#作者
MAINTAINER ttheng88<xxxxx@qq.com>
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为docker-package-demo.jar
COPY  *.jar /docker-package-demo.jar
#指定JAVA环境
#ENV JAVA_OPTS=""
#运行Jar包
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /docker-package-demo.jar"]