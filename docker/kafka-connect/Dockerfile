FROM confluentinc/cp-kafka-connect:7.0.1

LABEL maintainer="giuseppe.liaci@gmail.com"

USER root
RUN yum install unzip -y

COPY jars/*.jar /etc/kafka-connect/jars

# confluentinc-kafka-connect-jdbc
ADD confluentinc-kafka-connect-jdbc-10.6.0.zip /tmp/confluentinc-kafka-connect-jdbc.zip
RUN unzip /tmp/confluentinc-kafka-connect-jdbc.zip -d /usr/share/java && rm /tmp/confluentinc-kafka-connect-jdbc.zip