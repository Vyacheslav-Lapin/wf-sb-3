FROM jboss/wildfly

RUN /opt/jboss/wildfly/bin/add-user.sh admin Password1! --silent

ADD ./target/wf-sb-3-0.0.1-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
