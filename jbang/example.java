//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 21+
//DEPS io.quarkus.platform:quarkus-bom:3.23.2@pom
//DEPS io.quarkus:quarkus-arc
//DEPS io.debezium.quarkus:quarkus-debezium-postgres:3.2.2.Final
//FILES application.properties
//JAVAC_OPTIONS -parameters
//JAVA_OPTIONS -Djava.util.logging.manager=org.jboss.logmanager.LogManager


import org.apache.kafka.connect.source.SourceRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.debezium.engine.RecordChangeEvent;
import io.debezium.runtime.Capturing;
import io.quarkus.runtime.Quarkus;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class example {

    private final Logger logger = LoggerFactory.getLogger(example.class);

    public static void main(String[] args) {
        Quarkus.run();
    }

    @Capturing()
    public void capture(RecordChangeEvent<SourceRecord> event) throws Exception {
        logger.info("capturing event {}", event.record());
    }
}