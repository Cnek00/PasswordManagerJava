#0 building with "desktop-linux" instance using docker driver

#1 [internal] load build definition from Dockerfile
#1 transferring dockerfile: 518B done
#1 DONE 0.0s

#2 [internal] load metadata for docker.io/library/maven:3.8.8-eclipse-temurin-17
#2 ...

#3 [internal] load metadata for docker.io/bellsoft/liberica-openjre-alpine:17
#3 DONE 0.7s

#2 [internal] load metadata for docker.io/library/maven:3.8.8-eclipse-temurin-17
#2 DONE 0.7s

#4 [internal] load .dockerignore
#4 transferring context: 2B done
#4 DONE 0.0s

#5 [builder 1/6] FROM docker.io/library/maven:3.8.8-eclipse-temurin-17@sha256:40fcff4c4043d6adc90286c2e38ec70950f34f6dd5784f7e524866c66520cc23
#5 resolve docker.io/library/maven:3.8.8-eclipse-temurin-17@sha256:40fcff4c4043d6adc90286c2e38ec70950f34f6dd5784f7e524866c66520cc23 done
#5 DONE 0.0s

#6 [builder 2/6] WORKDIR /app
#6 CACHED

#7 [stage-1 1/3] FROM docker.io/bellsoft/liberica-openjre-alpine:17@sha256:46d2697c9a83d968506f4da2d25439aa02cec887eba9b60e711a05bcba534f46
#7 resolve docker.io/bellsoft/liberica-openjre-alpine:17@sha256:46d2697c9a83d968506f4da2d25439aa02cec887eba9b60e711a05bcba534f46 done
#7 DONE 0.0s

#8 [stage-1 2/3] WORKDIR /app
#8 CACHED

#9 [internal] load build context
#9 transferring context: 3.24kB done
#9 DONE 0.0s

#10 [builder 3/6] COPY pom.xml .
#10 DONE 0.0s

#11 [builder 4/6] RUN mvn dependency:go-offline -B
#11 0.502 [INFO] Scanning for projects...
#11 0.585 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-parent/4.1.0/spring-boot-starter-parent-4.1.0.pom
#11 0.743 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-parent/4.1.0/spring-boot-starter-parent-4.1.0.pom (14 kB at 89 kB/s)
#11 0.749 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/4.1.0/spring-boot-dependencies-4.1.0.pom
#11 0.811 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/4.1.0/spring-boot-dependencies-4.1.0.pom (142 kB at 2.3 MB/s)
#11 0.834 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-bom/6.2.6/activemq-bom-6.2.6.pom
#11 0.885 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-bom/6.2.6/activemq-bom-6.2.6.pom (7.9 kB at 155 kB/s)
#11 0.887 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/artemis/artemis-bom/2.53.0/artemis-bom-2.53.0.pom
#11 0.941 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/artemis/artemis-bom/2.53.0/artemis-bom-2.53.0.pom (18 kB at 327 kB/s)
#11 0.942 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/artemis/artemis-project/2.53.0/artemis-project-2.53.0.pom
#11 0.995 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/artemis/artemis-project/2.53.0/artemis-project-2.53.0.pom (55 kB at 1.1 MB/s)
#11 0.999 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/37/apache-37.pom
#11 1.051 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/37/apache-37.pom (26 kB at 493 kB/s)
#11 1.056 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-bom/3.27.7/assertj-bom-3.27.7.pom
#11 1.105 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-bom/3.27.7/assertj-bom-3.27.7.pom (3.3 kB at 68 kB/s)
#11 1.107 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/zipkin/reporter2/zipkin-reporter-bom/3.5.3/zipkin-reporter-bom-3.5.3.pom
#11 1.159 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/zipkin/reporter2/zipkin-reporter-bom/3.5.3/zipkin-reporter-bom-3.5.3.pom (6.1 kB at 117 kB/s)
#11 1.163 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/zipkin/brave/brave-bom/6.3.1/brave-bom-6.3.1.pom
#11 1.215 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/zipkin/brave/brave-bom/6.3.1/brave-bom-6.3.1.pom (11 kB at 215 kB/s)
#11 1.220 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/cassandra/java-driver-bom/4.19.3/java-driver-bom-4.19.3.pom
#11 1.273 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/cassandra/java-driver-bom/4.19.3/java-driver-bom-4.19.3.pom (5.5 kB at 103 kB/s)
#11 1.277 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/5.0.6/groovy-bom-5.0.6.pom
#11 1.332 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/5.0.6/groovy-bom-5.0.6.pom (27 kB at 495 kB/s)
#11 1.340 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-bom/1.80.0/grpc-bom-1.80.0.pom
#11 1.390 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-bom/1.80.0/grpc-bom-1.80.0.pom (6.3 kB at 127 kB/s)
#11 1.393 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/16.1.4/infinispan-bom-16.1.4.pom
#11 1.444 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/16.1.4/infinispan-bom-16.1.4.pom (20 kB at 383 kB/s)
#11 1.448 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.21.4/jackson-bom-2.21.4.pom
#11 1.496 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.21.4/jackson-bom-2.21.4.pom (20 kB at 421 kB/s)
#11 1.498 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.21/jackson-parent-2.21.pom
#11 1.551 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.21/jackson-parent-2.21.pom (6.9 kB at 130 kB/s)
#11 1.554 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/75/oss-parent-75.pom
#11 1.605 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/75/oss-parent-75.pom (24 kB at 472 kB/s)
#11 1.612 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/tools/jackson/jackson-bom/3.1.4/jackson-bom-3.1.4.pom
#11 1.662 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/tools/jackson/jackson-bom/3.1.4/jackson-bom-3.1.4.pom (20 kB at 397 kB/s)
#11 1.666 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/79/oss-parent-79.pom
#11 1.717 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/79/oss-parent-79.pom (24 kB at 479 kB/s)
#11 1.721 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jersey/jersey-bom/4.0.2/jersey-bom-4.0.2.pom
#11 1.770 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jersey/jersey-bom/4.0.2/jersey-bom-4.0.2.pom (24 kB at 485 kB/s)
#11 1.772 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.9/project-1.0.9.pom
#11 1.820 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.9/project-1.0.9.pom (16 kB at 336 kB/s)
#11 1.822 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/ee11/jetty-ee11-bom/12.1.10/jetty-ee11-bom-12.1.10.pom
#11 1.870 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/ee11/jetty-ee11-bom/12.1.10/jetty-ee11-bom-12.1.10.pom (9.4 kB at 196 kB/s)
#11 1.873 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/12.1.10/jetty-bom-12.1.10.pom
#11 1.923 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/12.1.10/jetty-bom-12.1.10.pom (17 kB at 347 kB/s)
#11 1.926 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jooq/jooq-bom/3.21.5/jooq-bom-3.21.5.pom
#11 1.977 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jooq/jooq-bom/3.21.5/jooq-bom-3.21.5.pom (5.4 kB at 107 kB/s)
#11 1.981 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/6.0.3/junit-bom-6.0.3.pom
#11 2.032 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/6.0.3/junit-bom-6.0.3.pom (5.1 kB at 100 kB/s)
#11 2.036 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-bom/2.3.21/kotlin-bom-2.3.21.pom
#11 2.088 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-bom/2.3.21/kotlin-bom-2.3.21.pom (9.4 kB at 181 kB/s)
#11 2.093 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.10.2/kotlinx-coroutines-bom-1.10.2.pom
#11 2.142 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.10.2/kotlinx-coroutines-bom-1.10.2.pom (4.3 kB at 87 kB/s)
#11 2.146 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-serialization-bom/1.11.0/kotlinx-serialization-bom-1.11.0.pom
#11 2.200 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-serialization-bom/1.11.0/kotlinx-serialization-bom-1.11.0.pom (4.1 kB at 77 kB/s)
#11 2.203 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-bom/2.25.4/log4j-bom-2.25.4.pom
#11 2.256 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-bom/2.25.4/log4j-bom-2.25.4.pom (12 kB at 231 kB/s)
#11 2.260 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-bom/1.17.0/micrometer-bom-1.17.0.pom
#11 2.308 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-bom/1.17.0/micrometer-bom-1.17.0.pom (8.7 kB at 186 kB/s)
#11 2.311 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-tracing-bom/1.7.0/micrometer-tracing-bom-1.7.0.pom
#11 2.363 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-tracing-bom/1.7.0/micrometer-tracing-bom-1.7.0.pom (4.1 kB at 79 kB/s)
#11 2.367 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/5.23.0/mockito-bom-5.23.0.pom
#11 2.418 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/5.23.0/mockito-bom-5.23.0.pom (3.0 kB at 58 kB/s)
#11 2.420 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mongodb/mongodb-driver-bom/5.8.0/mongodb-driver-bom-5.8.0.pom
#11 2.475 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mongodb/mongodb-driver-bom/5.8.0/mongodb-driver-bom-5.8.0.pom (4.5 kB at 82 kB/s)
#11 2.479 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/neo4j/driver/neo4j-java-driver-bom/6.1.0/neo4j-java-driver-bom-6.1.0.pom
#11 2.533 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/neo4j/driver/neo4j-java-driver-bom/6.1.0/neo4j-java-driver-bom-6.1.0.pom (2.3 kB at 43 kB/s)
#11 2.537 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/neo4j/bolt/neo4j-bolt-connection-bom/11.0.2/neo4j-bolt-connection-bom-11.0.2.pom
#11 2.592 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/neo4j/bolt/neo4j-bolt-connection-bom/11.0.2/neo4j-bolt-connection-bom-11.0.2.pom (2.5 kB at 45 kB/s)
#11 2.596 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.2.15.Final/netty-bom-4.2.15.Final.pom
#11 2.651 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.2.15.Final/netty-bom-4.2.15.Final.pom (19 kB at 349 kB/s)
#11 2.654 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/7/oss-parent-7.pom
#11 2.705 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/7/oss-parent-7.pom (4.8 kB at 95 kB/s)
#11 2.709 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/opentelemetry/opentelemetry-bom/1.62.0/opentelemetry-bom-1.62.0.pom
#11 2.762 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/opentelemetry/opentelemetry-bom/1.62.0/opentelemetry-bom-1.62.0.pom (6.0 kB at 114 kB/s)
#11 2.767 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/prometheus-metrics-bom/1.5.1/prometheus-metrics-bom-1.5.1.pom
#11 2.817 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/prometheus-metrics-bom/1.5.1/prometheus-metrics-bom-1.5.1.pom (6.0 kB at 119 kB/s)
#11 2.818 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/client_java_parent/1.5.1/client_java_parent-1.5.1.pom
#11 2.866 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/client_java_parent/1.5.1/client_java_parent-1.5.1.pom (4.6 kB at 96 kB/s)
#11 2.867 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/simpleclient_bom/0.16.0/simpleclient_bom-0.16.0.pom
#11 2.919 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/simpleclient_bom/0.16.0/simpleclient_bom-0.16.0.pom (6.0 kB at 116 kB/s)
#11 2.921 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/parent/0.16.0/parent-0.16.0.pom
#11 2.973 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/parent/0.16.0/parent-0.16.0.pom (13 kB at 241 kB/s)
#11 2.977 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/pulsar/pulsar-bom/4.2.2/pulsar-bom-4.2.2.pom
#11 3.027 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/pulsar/pulsar-bom/4.2.2/pulsar-bom-4.2.2.pom (25 kB at 497 kB/s)
#11 3.029 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/35/apache-35.pom
#11 3.080 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/35/apache-35.pom (24 kB at 475 kB/s)
#11 3.086 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-bom/4.34.2/protobuf-bom-4.34.2.pom
#11 3.139 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-bom/4.34.2/protobuf-bom-4.34.2.pom (3.7 kB at 69 kB/s)
#11 3.142 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/querydsl/querydsl-bom/5.1.0/querydsl-bom-5.1.0.pom
#11 3.194 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/querydsl/querydsl-bom/5.1.0/querydsl-bom-5.1.0.pom (7.2 kB at 140 kB/s)
#11 3.198 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2025.0.6/reactor-bom-2025.0.6.pom
#11 3.254 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2025.0.6/reactor-bom-2025.0.6.pom (4.6 kB at 82 kB/s)
#11 3.258 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/rsocket/rsocket-bom/1.1.5/rsocket-bom-1.1.5.pom
#11 3.312 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/rsocket/rsocket-bom/1.1.5/rsocket-bom-1.1.5.pom (2.4 kB at 44 kB/s)
#11 3.316 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-bom/4.43.0/selenium-bom-4.43.0.pom
#11 3.368 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-bom/4.43.0/selenium-bom-4.43.0.pom (6.0 kB at 116 kB/s)
#11 3.372 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/amqp/spring-amqp-bom/4.1.0/spring-amqp-bom-4.1.0.pom
#11 3.424 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/amqp/spring-amqp-bom/4.1.0/spring-amqp-bom-4.1.0.pom (4.2 kB at 82 kB/s)
#11 3.426 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/batch/spring-batch-bom/6.0.4/spring-batch-bom-6.0.4.pom
#11 3.474 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/batch/spring-batch-bom/6.0.4/spring-batch-bom-6.0.4.pom (3.2 kB at 66 kB/s)
#11 3.476 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-bom/2026.0.0/spring-data-bom-2026.0.0.pom
#11 3.526 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-bom/2026.0.0/spring-data-bom-2026.0.0.pom (5.5 kB at 110 kB/s)
#11 3.529 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/7.0.8/spring-framework-bom-7.0.8.pom
#11 3.581 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/7.0.8/spring-framework-bom-7.0.8.pom (5.7 kB at 109 kB/s)
#11 3.585 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/integration/spring-integration-bom/7.1.0/spring-integration-bom-7.1.0.pom
#11 3.639 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/integration/spring-integration-bom/7.1.0/spring-integration-bom-7.1.0.pom (11 kB at 200 kB/s)
#11 3.643 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/pulsar/spring-pulsar-bom/2.0.6/spring-pulsar-bom-2.0.6.pom
#11 3.697 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/pulsar/spring-pulsar-bom/2.0.6/spring-pulsar-bom-2.0.6.pom (2.7 kB at 51 kB/s)
#11 3.701 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/restdocs/spring-restdocs-bom/4.0.1/spring-restdocs-bom-4.0.1.pom
#11 3.755 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/restdocs/spring-restdocs-bom/4.0.1/spring-restdocs-bom-4.0.1.pom (2.4 kB at 44 kB/s)
#11 3.759 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-bom/7.1.0/spring-security-bom-7.1.0.pom
#11 3.810 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-bom/7.1.0/spring-security-bom-7.1.0.pom (6.7 kB at 131 kB/s)
#11 3.814 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/session/spring-session-bom/4.1.0/spring-session-bom-4.1.0.pom
#11 3.868 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/session/spring-session-bom/4.1.0/spring-session-bom-4.1.0.pom (2.5 kB at 48 kB/s)
#11 3.871 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/ws/spring-ws-bom/5.0.2/spring-ws-bom-5.0.2.pom
#11 3.924 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/ws/spring-ws-bom/5.0.2/spring-ws-bom-5.0.2.pom (2.3 kB at 44 kB/s)
#11 3.928 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/testcontainers/testcontainers-bom/2.0.5/testcontainers-bom-2.0.5.pom
#11 3.984 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/testcontainers/testcontainers-bom/2.0.5/testcontainers-bom-2.0.5.pom (12 kB at 218 kB/s)
#11 4.012 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/4.1.0/spring-boot-maven-plugin-4.1.0.pom
#11 4.058 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/4.1.0/spring-boot-maven-plugin-4.1.0.pom (4.0 kB at 87 kB/s)
#11 4.063 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/4.1.0/spring-boot-maven-plugin-4.1.0.jar
#11 4.125 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/4.1.0/spring-boot-maven-plugin-4.1.0.jar (141 kB at 2.3 MB/s)
#11 4.132 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.15.0/maven-compiler-plugin-3.15.0.pom
#11 4.179 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.15.0/maven-compiler-plugin-3.15.0.pom (9.5 kB at 208 kB/s)
#11 4.181 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/47/maven-plugins-47.pom
#11 4.229 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/47/maven-plugins-47.pom (7.2 kB at 150 kB/s)
#11 4.233 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/47/maven-parent-47.pom
#11 4.286 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/47/maven-parent-47.pom (54 kB at 1.0 MB/s)
#11 4.295 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.14.2/junit-bom-5.14.2.pom
#11 4.340 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.14.2/junit-bom-5.14.2.pom (5.7 kB at 126 kB/s)
#11 4.342 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.15.0/maven-compiler-plugin-3.15.0.jar
#11 4.397 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.15.0/maven-compiler-plugin-3.15.0.jar (84 kB at 1.6 MB/s)
#11 4.402 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.5.0/maven-clean-plugin-3.5.0.pom
#11 4.449 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.5.0/maven-clean-plugin-3.5.0.pom (5.7 kB at 121 kB/s)
#11 4.452 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/44/maven-plugins-44.pom
#11 4.500 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/44/maven-plugins-44.pom (8.4 kB at 174 kB/s)
#11 4.503 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/44/maven-parent-44.pom
#11 4.556 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/44/maven-parent-44.pom (52 kB at 985 kB/s)
#11 4.561 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/34/apache-34.pom
#11 4.614 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/34/apache-34.pom (24 kB at 458 kB/s)
#11 4.620 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.12.1/junit-bom-5.12.1.pom
#11 4.672 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.12.1/junit-bom-5.12.1.pom (5.6 kB at 109 kB/s)
#11 4.677 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.5.0/maven-clean-plugin-3.5.0.jar
#11 4.730 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.5.0/maven-clean-plugin-3.5.0.jar (37 kB at 703 kB/s)
#11 4.736 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.5.0/maven-resources-plugin-3.5.0.pom
#11 4.790 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.5.0/maven-resources-plugin-3.5.0.pom (7.7 kB at 142 kB/s)
#11 4.796 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.5.0/maven-resources-plugin-3.5.0.jar
#11 4.851 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.5.0/maven-resources-plugin-3.5.0.jar (32 kB at 584 kB/s)
#11 4.854 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.5.0/maven-jar-plugin-3.5.0.pom
#11 4.905 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.5.0/maven-jar-plugin-3.5.0.pom (7.6 kB at 150 kB/s)
#11 4.908 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/45/maven-plugins-45.pom
#11 4.958 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/45/maven-plugins-45.pom (8.4 kB at 167 kB/s)
#11 4.961 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/45/maven-parent-45.pom
#11 5.011 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/45/maven-parent-45.pom (53 kB at 1.1 MB/s)
#11 5.014 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.13.1/junit-bom-5.13.1.pom
#11 5.058 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.13.1/junit-bom-5.13.1.pom (5.6 kB at 131 kB/s)
#11 5.060 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.5.0/maven-jar-plugin-3.5.0.jar
#11 5.114 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.5.0/maven-jar-plugin-3.5.0.jar (35 kB at 650 kB/s)
#11 5.115 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.5.6/maven-surefire-plugin-3.5.6.pom
#11 5.161 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.5.6/maven-surefire-plugin-3.5.6.pom (4.9 kB at 108 kB/s)
#11 5.163 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/3.5.6/surefire-3.5.6.pom
#11 5.211 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/3.5.6/surefire-3.5.6.pom (19 kB at 400 kB/s)
#11 5.215 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.12.2/junit-bom-5.12.2.pom
#11 5.261 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.12.2/junit-bom-5.12.2.pom (5.6 kB at 123 kB/s)
#11 5.262 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.5.6/maven-surefire-plugin-3.5.6.jar
#11 5.308 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.5.6/maven-surefire-plugin-3.5.6.jar (47 kB at 1.0 MB/s)
#11 5.311 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/3.1.4/maven-install-plugin-3.1.4.pom
#11 5.357 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/3.1.4/maven-install-plugin-3.1.4.pom (8.1 kB at 176 kB/s)
#11 5.358 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/43/maven-plugins-43.pom
#11 5.399 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/43/maven-plugins-43.pom (7.5 kB at 182 kB/s)
#11 5.400 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/43/maven-parent-43.pom
#11 5.450 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/43/maven-parent-43.pom (50 kB at 1.0 MB/s)
#11 5.451 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/33/apache-33.pom
#11 5.495 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/33/apache-33.pom (24 kB at 562 kB/s)
#11 5.497 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.3/junit-bom-5.10.3.pom
#11 5.537 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.3/junit-bom-5.10.3.pom (5.6 kB at 141 kB/s)
#11 5.539 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/3.1.4/maven-install-plugin-3.1.4.jar
#11 5.589 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/3.1.4/maven-install-plugin-3.1.4.jar (33 kB at 652 kB/s)
#11 5.592 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-deploy-plugin/3.1.4/maven-deploy-plugin-3.1.4.pom
#11 5.640 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-deploy-plugin/3.1.4/maven-deploy-plugin-3.1.4.pom (9.2 kB at 192 kB/s)
#11 5.646 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-deploy-plugin/3.1.4/maven-deploy-plugin-3.1.4.jar
#11 5.696 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-deploy-plugin/3.1.4/maven-deploy-plugin-3.1.4.jar (40 kB at 796 kB/s)
#11 5.699 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-site-plugin/3.3/maven-site-plugin-3.3.pom
#11 5.751 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-site-plugin/3.3/maven-site-plugin-3.3.pom (21 kB at 400 kB/s)
#11 5.753 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/24/maven-plugins-24.pom
#11 5.802 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/24/maven-plugins-24.pom (11 kB at 225 kB/s)
#11 5.803 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom
#11 5.857 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom (33 kB at 615 kB/s)
#11 5.860 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom
#11 5.906 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom (14 kB at 304 kB/s)
#11 5.913 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-site-plugin/3.3/maven-site-plugin-3.3.jar
#11 5.973 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-site-plugin/3.3/maven-site-plugin-3.3.jar (124 kB at 2.1 MB/s)
#11 5.978 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/build-helper-maven-plugin/3.6.1/build-helper-maven-plugin-3.6.1.pom
#11 6.027 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/build-helper-maven-plugin/3.6.1/build-helper-maven-plugin-3.6.1.pom (8.1 kB at 166 kB/s)
#11 6.028 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/mojo-parent/91/mojo-parent-91.pom
#11 6.078 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/mojo-parent/91/mojo-parent-91.pom (38 kB at 755 kB/s)
#11 6.080 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.13.0/junit-bom-5.13.0.pom
#11 6.123 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.13.0/junit-bom-5.13.0.pom (5.6 kB at 131 kB/s)
#11 6.125 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/build-helper-maven-plugin/3.6.1/build-helper-maven-plugin-3.6.1.jar
#11 6.174 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/build-helper-maven-plugin/3.6.1/build-helper-maven-plugin-3.6.1.jar (72 kB at 1.5 MB/s)
#11 6.179 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/cyclonedx/cyclonedx-maven-plugin/2.9.1/cyclonedx-maven-plugin-2.9.1.pom
#11 6.227 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/cyclonedx/cyclonedx-maven-plugin/2.9.1/cyclonedx-maven-plugin-2.9.1.pom (19 kB at 397 kB/s)
#11 6.229 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.11.2/junit-bom-5.11.2.pom
#11 6.271 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.11.2/junit-bom-5.11.2.pom (5.6 kB at 134 kB/s)
#11 6.273 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/cyclonedx/cyclonedx-maven-plugin/2.9.1/cyclonedx-maven-plugin-2.9.1.jar
#11 6.321 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/cyclonedx/cyclonedx-maven-plugin/2.9.1/cyclonedx-maven-plugin-2.9.1.jar (52 kB at 1.1 MB/s)
#11 6.323 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/flywaydb/flyway-maven-plugin/12.4.0/flyway-maven-plugin-12.4.0.pom
#11 6.369 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/flywaydb/flyway-maven-plugin/12.4.0/flyway-maven-plugin-12.4.0.pom (3.1 kB at 68 kB/s)
#11 6.370 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/flywaydb/flyway-parent/12.4.0/flyway-parent-12.4.0.pom
#11 6.420 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/flywaydb/flyway-parent/12.4.0/flyway-parent-12.4.0.pom (34 kB at 676 kB/s)
#11 6.422 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.2.12.Final/netty-bom-4.2.12.Final.pom
#11 6.470 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.2.12.Final/netty-bom-4.2.12.Final.pom (19 kB at 400 kB/s)
#11 6.481 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/flywaydb/flyway-maven-plugin/12.4.0/flyway-maven-plugin-12.4.0.jar
#11 6.533 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/flywaydb/flyway-maven-plugin/12.4.0/flyway-maven-plugin-12.4.0.jar (105 kB at 2.0 MB/s)
#11 6.537 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/github/git-commit-id/git-commit-id-maven-plugin/9.2.0/git-commit-id-maven-plugin-9.2.0.pom
#11 6.587 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/github/git-commit-id/git-commit-id-maven-plugin/9.2.0/git-commit-id-maven-plugin-9.2.0.pom (28 kB at 561 kB/s)
#11 6.588 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/github/git-commit-id/git-commit-id-maven-plugin/9.2.0/git-commit-id-maven-plugin-9.2.0.jar
#11 6.637 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/github/git-commit-id/git-commit-id-maven-plugin/9.2.0/git-commit-id-maven-plugin-9.2.0.jar (56 kB at 1.1 MB/s)
#11 6.639 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jooq/jooq-codegen-maven/3.21.5/jooq-codegen-maven-3.21.5.pom
#11 6.686 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jooq/jooq-codegen-maven/3.21.5/jooq-codegen-maven-3.21.5.pom (3.9 kB at 84 kB/s)
#11 6.686 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jooq/jooq-parent/3.21.5/jooq-parent-3.21.5.pom
#11 6.736 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jooq/jooq-parent/3.21.5/jooq-parent-3.21.5.pom (44 kB at 889 kB/s)
#11 6.738 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jooq/jooq-codegen-maven/3.21.5/jooq-codegen-maven-3.21.5.jar
#11 6.791 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jooq/jooq-codegen-maven/3.21.5/jooq-codegen-maven-3.21.5.jar (19 kB at 360 kB/s)
#11 6.793 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-maven-plugin/2.3.21/kotlin-maven-plugin-2.3.21.pom
#11 6.841 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-maven-plugin/2.3.21/kotlin-maven-plugin-2.3.21.pom (8.3 kB at 173 kB/s)
#11 6.844 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-project/2.3.21/kotlin-project-2.3.21.pom
#11 6.900 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-project/2.3.21/kotlin-project-2.3.21.pom (16 kB at 278 kB/s)
#11 6.905 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-maven-plugin/2.3.21/kotlin-maven-plugin-2.3.21.jar
#11 6.957 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-maven-plugin/2.3.21/kotlin-maven-plugin-2.3.21.jar (85 kB at 1.6 MB/s)
#11 6.961 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/liquibase/liquibase-maven-plugin/5.0.3/liquibase-maven-plugin-5.0.3.pom
#11 7.008 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/liquibase/liquibase-maven-plugin/5.0.3/liquibase-maven-plugin-5.0.3.pom (1.9 kB at 40 kB/s)
#11 7.010 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/liquibase/liquibase-maven-plugin/5.0.3/liquibase-maven-plugin-5.0.3.jar
#11 7.060 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/liquibase/liquibase-maven-plugin/5.0.3/liquibase-maven-plugin-5.0.3.jar (105 kB at 2.1 MB/s)
#11 7.068 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/3.2.0/maven-antrun-plugin-3.2.0.pom
#11 7.113 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/3.2.0/maven-antrun-plugin-3.2.0.pom (7.7 kB at 176 kB/s)
#11 7.115 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/3.2.0/maven-antrun-plugin-3.2.0.jar
#11 7.160 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/3.2.0/maven-antrun-plugin-3.2.0.jar (41 kB at 896 kB/s)
#11 7.162 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-assembly-plugin/3.8.0/maven-assembly-plugin-3.8.0.pom
#11 7.208 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-assembly-plugin/3.8.0/maven-assembly-plugin-3.8.0.pom (16 kB at 337 kB/s)
#11 7.211 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-assembly-plugin/3.8.0/maven-assembly-plugin-3.8.0.jar
#11 7.274 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-assembly-plugin/3.8.0/maven-assembly-plugin-3.8.0.jar (240 kB at 3.7 MB/s)
#11 7.277 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/3.10.0/maven-dependency-plugin-3.10.0.pom
#11 7.323 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/3.10.0/maven-dependency-plugin-3.10.0.pom (19 kB at 404 kB/s)
#11 7.329 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/3.10.0/maven-dependency-plugin-3.10.0.jar
#11 7.396 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/3.10.0/maven-dependency-plugin-3.10.0.jar (228 kB at 3.4 MB/s)
#11 7.410 [INFO] 
#11 7.410 [INFO] -------------------< com.example:UserManagmentPanel >-------------------
#11 7.410 [INFO] Building  0.0.1-SNAPSHOT
#11 7.410 [INFO]   from pom.xml
#11 7.410 [INFO] --------------------------------[ jar ]---------------------------------
#11 7.412 [INFO] 
#11 7.412 [INFO] --- maven-dependency-plugin:3.10.0:go-offline (default-cli) @ UserManagmentPanel ---
#11 7.418 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/2.0.0/doxia-sink-api-2.0.0.pom
#11 7.465 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/2.0.0/doxia-sink-api-2.0.0.pom (1.4 kB at 30 kB/s)
#11 7.466 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/2.0.0/doxia-2.0.0.pom
#11 7.516 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/2.0.0/doxia-2.0.0.pom (17 kB at 344 kB/s)
#11 7.520 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.11.1/junit-bom-5.11.1.pom
#11 7.570 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.11.1/junit-bom-5.11.1.pom (5.6 kB at 115 kB/s)
#11 7.576 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/4.0.0/maven-reporting-api-4.0.0.pom
#11 7.624 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/4.0.0/maven-reporting-api-4.0.0.pom (2.8 kB at 58 kB/s)
#11 7.627 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/43/maven-shared-components-43.pom
#11 7.685 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/43/maven-shared-components-43.pom (3.8 kB at 66 kB/s)
#11 7.692 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/4.0.0/maven-reporting-impl-4.0.0.pom
#11 7.745 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/4.0.0/maven-reporting-impl-4.0.0.pom (8.8 kB at 165 kB/s)
#11 7.749 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.pom
#11 7.798 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.pom (5.9 kB at 120 kB/s)
#11 7.800 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/39/maven-shared-components-39.pom
#11 7.846 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/39/maven-shared-components-39.pom (3.2 kB at 70 kB/s)
#11 7.849 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/39/maven-parent-39.pom
#11 7.897 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/39/maven-parent-39.pom (48 kB at 999 kB/s)
#11 7.900 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/29/apache-29.pom
#11 7.950 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/29/apache-29.pom (21 kB at 423 kB/s)
#11 7.955 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom
#11 8.003 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom (2.7 kB at 57 kB/s)
#11 8.006 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.pom
#11 8.056 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.pom (14 kB at 282 kB/s)
#11 8.061 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom
#11 8.109 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom (20 kB at 411 kB/s)
#11 8.111 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-52.pom
#11 8.159 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-52.pom (79 kB at 1.7 MB/s)
#11 8.163 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom
#11 8.211 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom (18 kB at 384 kB/s)
#11 8.214 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom
#11 8.254 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom (5.1 kB at 127 kB/s)
#11 8.255 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-model/2.0.0/doxia-site-model-2.0.0.pom
#11 8.303 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-model/2.0.0/doxia-site-model-2.0.0.pom (5.8 kB at 121 kB/s)
#11 8.303 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/2.0.0/doxia-sitetools-2.0.0.pom
#11 8.349 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/2.0.0/doxia-sitetools-2.0.0.pom (12 kB at 266 kB/s)
#11 8.350 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M4/org.eclipse.sisu.plexus-0.9.0.M4.pom
#11 8.396 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M4/org.eclipse.sisu.plexus-0.9.0.M4.pom (17 kB at 377 kB/s)
#11 8.397 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.9.0.M4/sisu-inject-0.9.0.M4.pom
#11 8.441 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.9.0.M4/sisu-inject-0.9.0.M4.pom (25 kB at 564 kB/s)
#11 8.443 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M4/org.eclipse.sisu.inject-0.9.0.M4.pom
#11 8.489 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M4/org.eclipse.sisu.inject-0.9.0.M4.pom (18 kB at 390 kB/s)
#11 8.491 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.8/asm-9.8.pom
#11 8.537 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.8/asm-9.8.pom (2.4 kB at 52 kB/s)
#11 8.538 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5.1/ow2-1.5.1.pom
#11 8.583 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5.1/ow2-1.5.1.pom (11 kB at 251 kB/s)
#11 8.584 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.pom
#11 8.633 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.pom (750 B at 15 kB/s)
#11 8.634 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.1.0/plexus-containers-2.1.0.pom
#11 8.676 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.1.0/plexus-containers-2.1.0.pom (4.8 kB at 114 kB/s)
#11 8.677 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom
#11 8.725 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom (23 kB at 479 kB/s)
#11 8.728 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.pom
#11 8.771 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.pom (7.9 kB at 184 kB/s)
#11 8.774 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.2/plexus-utils-4.0.2.pom
#11 8.819 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.2/plexus-utils-4.0.2.pom (13 kB at 285 kB/s)
#11 8.821 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom
#11 8.866 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom (612 B at 14 kB/s)
#11 8.869 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.1/plexus-xml-3.0.1.pom
#11 8.928 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.1/plexus-xml-3.0.1.pom (3.7 kB at 63 kB/s)
#11 8.930 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/18/plexus-18.pom
#11 8.982 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/18/plexus-18.pom (29 kB at 562 kB/s)
#11 8.986 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.2/junit-bom-5.10.2.pom
#11 9.029 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.2/junit-bom-5.10.2.pom (5.6 kB at 131 kB/s)
#11 9.032 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/2.0.0/doxia-core-2.0.0.pom
#11 9.080 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/2.0.0/doxia-core-2.0.0.pom (3.9 kB at 81 kB/s)
#11 9.085 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.17.0/commons-io-2.17.0.pom
#11 9.131 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.17.0/commons-io-2.17.0.pom (20 kB at 435 kB/s)
#11 9.132 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/74/commons-parent-74.pom
#11 9.180 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/74/commons-parent-74.pom (78 kB at 1.6 MB/s)
#11 9.183 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.11.0/junit-bom-5.11.0.pom
#11 9.224 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.11.0/junit-bom-5.11.0.pom (5.6 kB at 138 kB/s)
#11 9.225 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.12.0/commons-text-1.12.0.pom
#11 9.270 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.12.0/commons-text-1.12.0.pom (20 kB at 441 kB/s)
#11 9.272 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/69/commons-parent-69.pom
#11 9.326 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/69/commons-parent-69.pom (77 kB at 1.4 MB/s)
#11 9.336 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/31/apache-31.pom
#11 9.382 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/31/apache-31.pom (24 kB at 523 kB/s)
#11 9.386 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.pom
#11 9.433 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.pom (31 kB at 657 kB/s)
#11 9.436 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/64/commons-parent-64.pom
#11 9.492 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/64/commons-parent-64.pom (78 kB at 1.4 MB/s)
#11 9.497 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/30/apache-30.pom
#11 9.547 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/30/apache-30.pom (23 kB at 465 kB/s)
#11 9.553 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.0/junit-bom-5.10.0.pom
#11 9.601 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.0/junit-bom-5.10.0.pom (5.6 kB at 115 kB/s)
#11 9.605 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.17.0/commons-lang3-3.17.0.pom
#11 9.655 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.17.0/commons-lang3-3.17.0.pom (31 kB at 625 kB/s)
#11 9.658 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/73/commons-parent-73.pom
#11 9.713 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/73/commons-parent-73.pom (78 kB at 1.4 MB/s)
#11 9.720 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/2.0.0/doxia-integration-tools-2.0.0.pom
#11 9.775 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/2.0.0/doxia-integration-tools-2.0.0.pom (7.8 kB at 141 kB/s)
#11 9.781 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.0-beta-10/plexus-i18n-1.0-beta-10.pom
#11 9.830 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.0-beta-10/plexus-i18n-1.0-beta-10.pom (2.1 kB at 43 kB/s)
#11 9.833 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.12/plexus-components-1.1.12.pom
#11 9.890 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.12/plexus-components-1.1.12.pom (3.0 kB at 54 kB/s)
#11 9.893 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.10/plexus-1.0.10.pom
#11 9.942 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.10/plexus-1.0.10.pom (8.2 kB at 168 kB/s)
#11 9.948 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.pom
#11 9.997 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.pom (3.0 kB at 62 kB/s)
#11 10.000 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/16/plexus-16.pom
#11 10.05 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/16/plexus-16.pom (28 kB at 553 kB/s)
#11 10.05 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.1/junit-bom-5.10.1.pom
#11 10.10 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.1/junit-bom-5.10.1.pom (5.6 kB at 126 kB/s)
#11 10.10 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/2.0.0/doxia-site-renderer-2.0.0.pom
#11 10.15 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/2.0.0/doxia-site-renderer-2.0.0.pom (7.4 kB at 160 kB/s)
#11 10.15 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/2.0.0/doxia-skin-model-2.0.0.pom
#11 10.20 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/2.0.0/doxia-skin-model-2.0.0.pom (3.0 kB at 66 kB/s)
#11 10.20 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/2.0.0/doxia-module-xhtml5-2.0.0.pom
#11 10.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/2.0.0/doxia-module-xhtml5-2.0.0.pom (2.9 kB at 57 kB/s)
#11 10.25 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-modules/2.0.0/doxia-modules-2.0.0.pom
#11 10.30 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-modules/2.0.0/doxia-modules-2.0.0.pom (2.5 kB at 50 kB/s)
#11 10.31 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/2.2.0/plexus-velocity-2.2.0.pom
#11 10.36 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/2.2.0/plexus-velocity-2.2.0.pom (4.1 kB at 81 kB/s)
#11 10.36 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/19/plexus-19.pom
#11 10.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/19/plexus-19.pom (25 kB at 518 kB/s)
#11 10.41 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-core/2.4/velocity-engine-core-2.4.pom
#11 10.46 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-core/2.4/velocity-engine-core-2.4.pom (12 kB at 235 kB/s)
#11 10.47 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-parent/2.4/velocity-engine-parent-2.4.pom
#11 10.52 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-parent/2.4/velocity-engine-parent-2.4.pom (9.5 kB at 179 kB/s)
#11 10.52 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-master/7/velocity-master-7.pom
#11 10.58 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-master/7/velocity-master-7.pom (7.9 kB at 152 kB/s)
#11 10.58 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/tools/velocity-tools-generic/3.1/velocity-tools-generic-3.1.pom
#11 10.63 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/tools/velocity-tools-generic/3.1/velocity-tools-generic-3.1.pom (2.6 kB at 49 kB/s)
#11 10.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/tools/velocity-tools-parent/3.1/velocity-tools-parent-3.1.pom
#11 10.68 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/tools/velocity-tools-parent/3.1/velocity-tools-parent-3.1.pom (8.0 kB at 164 kB/s)
#11 10.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-master/4/velocity-master-4.pom
#11 10.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-master/4/velocity-master-4.pom (7.8 kB at 159 kB/s)
#11 10.74 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-core/2.3/velocity-engine-core-2.3.pom
#11 10.79 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-core/2.3/velocity-engine-core-2.3.pom (10 kB at 205 kB/s)
#11 10.79 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-parent/2.3/velocity-engine-parent-2.3.pom
#11 10.84 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-parent/2.3/velocity-engine-parent-2.3.pom (14 kB at 288 kB/s)
#11 10.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.11/commons-lang3-3.11.pom
#11 10.89 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.11/commons-lang3-3.11.pom (30 kB at 683 kB/s)
#11 10.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/51/commons-parent-51.pom
#11 10.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/51/commons-parent-51.pom (78 kB at 1.7 MB/s)
#11 10.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.pom
#11 10.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.pom (3.8 kB at 89 kB/s)
#11 10.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.30/slf4j-parent-1.7.30.pom
#11 11.03 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.30/slf4j-parent-1.7.30.pom (14 kB at 321 kB/s)
#11 11.03 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.pom
#11 11.07 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.pom (18 kB at 419 kB/s)
#11 11.07 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/47/commons-parent-47.pom
#11 11.13 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/47/commons-parent-47.pom (78 kB at 1.5 MB/s)
#11 11.13 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/19/apache-19.pom
#11 11.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/19/apache-19.pom (15 kB at 323 kB/s)
#11 11.18 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.pom
#11 11.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.pom (19 kB at 447 kB/s)
#11 11.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/34/commons-parent-34.pom
#11 11.27 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/34/commons-parent-34.pom (56 kB at 1.2 MB/s)
#11 11.27 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.pom
#11 11.32 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.pom (12 kB at 288 kB/s)
#11 11.32 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/39/commons-parent-39.pom
#11 11.37 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/39/commons-parent-39.pom (62 kB at 1.2 MB/s)
#11 11.37 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/16/apache-16.pom
#11 11.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/16/apache-16.pom (15 kB at 367 kB/s)
#11 11.41 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-digester3/3.2/commons-digester3-3.2.pom
#11 11.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-digester3/3.2/commons-digester3-3.2.pom (18 kB at 400 kB/s)
#11 11.46 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/22/commons-parent-22.pom
#11 11.50 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/22/commons-parent-22.pom (42 kB at 873 kB/s)
#11 11.51 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/9/apache-9.pom
#11 11.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/9/apache-9.pom (15 kB at 292 kB/s)
#11 11.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.8.3/commons-beanutils-1.8.3.pom
#11 11.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.8.3/commons-beanutils-1.8.3.pom (11 kB at 211 kB/s)
#11 11.62 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/14/commons-parent-14.pom
#11 11.68 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/14/commons-parent-14.pom (31 kB at 571 kB/s)
#11 11.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom
#11 11.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom (14 kB at 294 kB/s)
#11 11.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.1.1/commons-logging-1.1.1.pom
#11 11.80 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.1.1/commons-logging-1.1.1.pom (18 kB at 367 kB/s)
#11 11.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/5/commons-parent-5.pom
#11 11.85 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/5/commons-parent-5.pom (16 kB at 365 kB/s)
#11 11.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom
#11 11.89 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom (4.5 kB at 102 kB/s)
#11 11.90 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.10/commons-lang3-3.10.pom
#11 11.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.10/commons-lang3-3.10.pom (31 kB at 664 kB/s)
#11 11.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/50/commons-parent-50.pom
#11 11.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/50/commons-parent-50.pom (76 kB at 1.5 MB/s)
#11 12.00 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom
#11 12.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom (17 kB at 372 kB/s)
#11 12.05 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/github/cliftonlabs/json-simple/3.0.2/json-simple-3.0.2.pom
#11 12.10 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/github/cliftonlabs/json-simple/3.0.2/json-simple-3.0.2.pom (7.5 kB at 147 kB/s)
#11 12.10 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-apt/2.0.0/doxia-module-apt-2.0.0.pom
#11 12.15 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-apt/2.0.0/doxia-module-apt-2.0.0.pom (2.9 kB at 60 kB/s)
#11 12.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xdoc/2.0.0/doxia-module-xdoc-2.0.0.pom
#11 12.21 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xdoc/2.0.0/doxia-module-xdoc-2.0.0.pom (5.4 kB at 102 kB/s)
#11 12.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.pom
#11 12.26 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.pom (4.4 kB at 90 kB/s)
#11 12.27 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/41/maven-shared-components-41.pom
#11 12.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/41/maven-shared-components-41.pom (3.2 kB at 71 kB/s)
#11 12.32 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/41/maven-parent-41.pom
#11 12.37 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/41/maven-parent-41.pom (50 kB at 997 kB/s)
#11 12.37 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.pom
#11 12.42 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.pom (6.0 kB at 130 kB/s)
#11 12.42 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/17/plexus-17.pom
#11 12.47 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/17/plexus-17.pom (28 kB at 626 kB/s)
#11 12.47 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.pom
#11 12.51 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.pom (3.9 kB at 88 kB/s)
#11 12.51 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.15.1/commons-io-2.15.1.pom
#11 12.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.15.1/commons-io-2.15.1.pom (20 kB at 392 kB/s)
#11 12.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/65/commons-parent-65.pom
#11 12.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/65/commons-parent-65.pom (78 kB at 1.6 MB/s)
#11 12.62 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.pom
#11 12.67 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.pom (22 kB at 520 kB/s)
#11 12.67 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/66/commons-parent-66.pom
#11 12.72 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/66/commons-parent-66.pom (77 kB at 1.4 MB/s)
#11 12.73 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.pom
#11 12.78 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.pom (16 kB at 327 kB/s)
#11 12.78 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.pom
#11 12.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.pom (15 kB at 297 kB/s)
#11 12.83 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.9/xz-1.9.pom
#11 12.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.9/xz-1.9.pom (2.0 kB at 44 kB/s)
#11 12.88 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.pom
#11 12.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.pom (2.0 kB at 41 kB/s)
#11 12.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.pom
#11 12.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.pom (2.6 kB at 53 kB/s)
#11 12.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver/1.4.1/maven-resolver-1.4.1.pom
#11 13.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver/1.4.1/maven-resolver-1.4.1.pom (18 kB at 379 kB/s)
#11 13.04 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom
#11 13.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom (44 kB at 849 kB/s)
#11 13.10 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.11.0/plexus-archiver-4.11.0.pom
#11 13.14 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.11.0/plexus-archiver-4.11.0.pom (5.6 kB at 115 kB/s)
#11 13.15 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/25/plexus-25.pom
#11 13.20 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/25/plexus-25.pom (31 kB at 581 kB/s)
#11 13.21 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.14.1/junit-bom-5.14.1.pom
#11 13.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.14.1/junit-bom-5.14.1.pom (5.7 kB at 126 kB/s)
#11 13.26 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.6.0/plexus-io-3.6.0.pom
#11 13.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.6.0/plexus-io-3.6.0.pom (3.5 kB at 67 kB/s)
#11 13.31 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/24/plexus-24.pom
#11 13.35 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/24/plexus-24.pom (31 kB at 713 kB/s)
#11 13.35 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.13.4/junit-bom-5.13.4.pom
#11 13.40 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.13.4/junit-bom-5.13.4.pom (5.7 kB at 135 kB/s)
#11 13.40 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.20.0/commons-io-2.20.0.pom
#11 13.44 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.20.0/commons-io-2.20.0.pom (20 kB at 465 kB/s)
#11 13.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/85/commons-parent-85.pom
#11 13.50 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/85/commons-parent-85.pom (78 kB at 1.5 MB/s)
#11 13.50 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.28.0/commons-compress-1.28.0.pom
#11 13.55 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.28.0/commons-compress-1.28.0.pom (25 kB at 538 kB/s)
#11 13.55 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.19.0/commons-codec-1.19.0.pom
#11 13.60 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.19.0/commons-codec-1.19.0.pom (18 kB at 391 kB/s)
#11 13.61 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.18.0/commons-lang3-3.18.0.pom
#11 13.65 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.18.0/commons-lang3-3.18.0.pom (32 kB at 667 kB/s)
#11 13.66 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.21.0/commons-io-2.21.0.pom
#11 13.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.21.0/commons-io-2.21.0.pom (21 kB at 444 kB/s)
#11 13.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/91/commons-parent-91.pom
#11 13.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/91/commons-parent-91.pom (79 kB at 1.6 MB/s)
#11 13.77 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.11/xz-1.11.pom
#11 13.81 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.11/xz-1.11.pom (1.9 kB at 46 kB/s)
#11 13.81 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.7-6/zstd-jni-1.5.7-6.pom
#11 13.85 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.7-6/zstd-jni-1.5.7-6.pom (2.0 kB at 50 kB/s)
#11 13.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.20.0/commons-lang3-3.20.0.pom
#11 13.90 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.20.0/commons-lang3-3.20.0.pom (33 kB at 651 kB/s)
#11 13.90 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/92/commons-parent-92.pom
#11 13.96 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/92/commons-parent-92.pom (80 kB at 1.4 MB/s)
#11 13.97 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.1.0/plexus-i18n-1.1.0.pom
#11 14.02 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.1.0/plexus-i18n-1.1.0.pom (2.8 kB at 60 kB/s)
#11 14.02 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-analyzer/1.17.0/maven-dependency-analyzer-1.17.0.pom
#11 14.07 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-analyzer/1.17.0/maven-dependency-analyzer-1.17.0.pom (7.1 kB at 154 kB/s)
#11 14.07 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/47/maven-shared-components-47.pom
#11 14.12 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/47/maven-shared-components-47.pom (3.8 kB at 79 kB/s)
#11 14.12 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.9.1/asm-9.9.1.pom
#11 14.17 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.9.1/asm-9.9.1.pom (2.4 kB at 47 kB/s)
#11 14.18 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.3.0/maven-dependency-tree-3.3.0.pom
#11 14.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.3.0/maven-dependency-tree-3.3.0.pom (7.0 kB at 143 kB/s)
#11 14.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/42/maven-shared-components-42.pom
#11 14.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/42/maven-shared-components-42.pom (3.8 kB at 75 kB/s)
#11 14.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/42/maven-parent-42.pom
#11 14.33 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/42/maven-parent-42.pom (50 kB at 989 kB/s)
#11 14.34 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/32/apache-32.pom
#11 14.38 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/32/apache-32.pom (24 kB at 515 kB/s)
#11 14.39 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.pom
#11 14.43 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.pom (2.8 kB at 60 kB/s)
#11 14.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.4.0/maven-common-artifact-filters-3.4.0.pom
#11 14.49 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.4.0/maven-common-artifact-filters-3.4.0.pom (5.4 kB at 103 kB/s)
#11 14.49 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.pom
#11 14.54 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.pom (11 kB at 244 kB/s)
#11 14.54 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom
#11 14.59 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom (5.1 kB at 108 kB/s)
#11 14.59 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/34/maven-parent-34.pom
#11 14.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/34/maven-parent-34.pom (43 kB at 840 kB/s)
#11 14.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.pom
#11 14.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.pom (750 B at 17 kB/s)
#11 14.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.0.0/plexus-containers-2.0.0.pom
#11 14.74 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.0.0/plexus-containers-2.0.0.pom (4.8 kB at 107 kB/s)
#11 14.74 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.pom
#11 14.79 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.pom (5.3 kB at 115 kB/s)
#11 14.79 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/33/maven-shared-components-33.pom
#11 14.84 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/33/maven-shared-components-33.pom (5.1 kB at 108 kB/s)
#11 14.84 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom
#11 14.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom (3.9 kB at 91 kB/s)
#11 14.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom
#11 14.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom (22 kB at 466 kB/s)
#11 14.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom
#11 14.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom (24 kB at 490 kB/s)
#11 14.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom
#11 15.03 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom (13 kB at 278 kB/s)
#11 15.04 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom
#11 15.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom (2.3 kB at 48 kB/s)
#11 15.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom
#11 15.14 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom (5.4 kB at 117 kB/s)
#11 15.14 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom
#11 15.19 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom (3.1 kB at 65 kB/s)
#11 15.19 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom
#11 15.24 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom (2.6 kB at 55 kB/s)
#11 15.24 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom
#11 15.29 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom (1.2 kB at 23 kB/s)
#11 15.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom
#11 15.34 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom (7.8 kB at 173 kB/s)
#11 15.34 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom
#11 15.39 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom (11 kB at 215 kB/s)
#11 15.40 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.4/plexus-component-annotations-1.5.4.pom
#11 15.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.4/plexus-component-annotations-1.5.4.pom (815 B at 16 kB/s)
#11 15.45 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.4/plexus-containers-1.5.4.pom
#11 15.49 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.4/plexus-containers-1.5.4.pom (4.2 kB at 94 kB/s)
#11 15.49 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.5/plexus-2.0.5.pom
#11 15.54 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.5/plexus-2.0.5.pom (17 kB at 377 kB/s)
#11 15.54 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom
#11 15.59 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom (4.0 kB at 93 kB/s)
#11 15.59 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom
#11 15.63 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom (17 kB at 381 kB/s)
#11 15.64 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom
#11 15.68 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom (5.5 kB at 114 kB/s)
#11 15.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom
#11 15.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom (11 kB at 246 kB/s)
#11 15.74 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.pom
#11 15.78 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.pom (5.0 kB at 111 kB/s)
#11 15.79 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/30/maven-shared-components-30.pom
#11 15.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/30/maven-shared-components-30.pom (4.6 kB at 98 kB/s)
#11 15.84 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/30/maven-parent-30.pom
#11 15.89 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/30/maven-parent-30.pom (41 kB at 765 kB/s)
#11 15.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/18/apache-18.pom
#11 15.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/18/apache-18.pom (16 kB at 320 kB/s)
#11 15.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.pom
#11 15.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.pom (13 kB at 289 kB/s)
#11 15.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.5/slf4j-api-1.7.5.pom
#11 16.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.5/slf4j-api-1.7.5.pom (2.7 kB at 63 kB/s)
#11 16.04 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.5/slf4j-parent-1.7.5.pom
#11 16.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.5/slf4j-parent-1.7.5.pom (12 kB at 241 kB/s)
#11 16.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.25/maven-resolver-util-1.9.25.pom
#11 16.14 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.25/maven-resolver-util-1.9.25.pom (2.2 kB at 48 kB/s)
#11 16.14 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver/1.9.25/maven-resolver-1.9.25.pom
#11 16.19 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver/1.9.25/maven-resolver-1.9.25.pom (25 kB at 472 kB/s)
#11 16.20 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.9.25/maven-resolver-api-1.9.25.pom
#11 16.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.9.25/maven-resolver-api-1.9.25.pom (2.2 kB at 44 kB/s)
#11 16.25 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom
#11 16.30 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom (3.2 kB at 70 kB/s)
#11 16.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.pom
#11 16.35 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.pom (8.4 kB at 186 kB/s)
#11 16.35 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom
#11 16.40 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom (8.4 kB at 164 kB/s)
#11 16.40 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-core/2.4.1/velocity-engine-core-2.4.1.pom
#11 16.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-core/2.4.1/velocity-engine-core-2.4.1.pom (12 kB at 240 kB/s)
#11 16.45 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-parent/2.4.1/velocity-engine-parent-2.4.1.pom
#11 16.50 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-parent/2.4.1/velocity-engine-parent-2.4.1.pom (9.5 kB at 202 kB/s)
#11 16.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/2.0.0/doxia-sink-api-2.0.0.jar
#11 16.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/4.0.0/maven-reporting-api-4.0.0.jar
#11 16.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/4.0.0/maven-reporting-impl-4.0.0.jar
#11 16.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-model/2.0.0/doxia-site-model-2.0.0.jar
#11 16.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/2.0.0/doxia-core-2.0.0.jar
#11 16.57 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/2.0.0/doxia-sink-api-2.0.0.jar (11 kB at 252 kB/s)
#11 16.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.12.0/commons-text-1.12.0.jar
#11 16.65 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/4.0.0/maven-reporting-api-4.0.0.jar (9.8 kB at 76 kB/s)
#11 16.65 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.12.0/commons-text-1.12.0.jar (251 kB at 2.0 MB/s)
#11 16.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.jar
#11 16.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/2.0.0/doxia-integration-tools-2.0.0.jar
#11 16.66 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/2.0.0/doxia-core-2.0.0.jar (168 kB at 1.2 MB/s)
#11 16.66 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/2.0.0/doxia-site-renderer-2.0.0.jar
#11 16.67 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-model/2.0.0/doxia-site-model-2.0.0.jar (86 kB at 605 kB/s)
#11 16.67 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/2.0.0/doxia-skin-model-2.0.0.jar
#11 16.68 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/4.0.0/maven-reporting-impl-4.0.0.jar (21 kB at 139 kB/s)
#11 16.68 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/2.0.0/doxia-module-xhtml5-2.0.0.jar
#11 16.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/2.0.0/doxia-site-renderer-2.0.0.jar (44 kB at 244 kB/s)
#11 16.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/2.2.0/plexus-velocity-2.2.0.jar
#11 16.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/2.0.0/doxia-integration-tools-2.0.0.jar (50 kB at 275 kB/s)
#11 16.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-apt/2.0.0/doxia-module-apt-2.0.0.jar
#11 16.72 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/2.0.0/doxia-skin-model-2.0.0.jar (16 kB at 87 kB/s)
#11 16.72 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xdoc/2.0.0/doxia-module-xdoc-2.0.0.jar
#11 16.72 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/2.0.0/doxia-module-xhtml5-2.0.0.jar (17 kB at 88 kB/s)
#11 16.72 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.jar
#11 16.74 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.jar (86 kB at 401 kB/s)
#11 16.74 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.jar
#11 16.75 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/2.2.0/plexus-velocity-2.2.0.jar (5.7 kB at 26 kB/s)
#11 16.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M4/org.eclipse.sisu.plexus-0.9.0.M4.jar
#11 16.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-apt/2.0.0/doxia-module-apt-2.0.0.jar (54 kB at 234 kB/s)
#11 16.76 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M4/org.eclipse.sisu.inject-0.9.0.M4.jar
#11 16.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xdoc/2.0.0/doxia-module-xdoc-2.0.0.jar (35 kB at 152 kB/s)
#11 16.76 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.jar
#11 16.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.jar (27 kB at 113 kB/s)
#11 16.76 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.11.0/plexus-archiver-4.11.0.jar
#11 16.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M4/org.eclipse.sisu.plexus-0.9.0.M4.jar (216 kB at 608 kB/s)
#11 16.88 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar
#11 16.90 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.jar (53 kB at 143 kB/s)
#11 16.90 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.28.0/commons-compress-1.28.0.jar
#11 16.90 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.11.0/plexus-archiver-4.11.0.jar (227 kB at 607 kB/s)
#11 16.90 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.19.0/commons-codec-1.19.0.jar
#11 16.91 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.jar (149 kB at 389 kB/s)
#11 16.91 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.21.0/commons-io-2.21.0.jar
#11 16.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M4/org.eclipse.sisu.inject-0.9.0.M4.jar (305 kB at 768 kB/s)
#11 16.93 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.11/xz-1.11.jar
#11 16.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar (2.5 kB at 6.1 kB/s)
#11 16.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.7-6/zstd-jni-1.5.7-6.jar
#11 17.15 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.19.0/commons-codec-1.19.0.jar (375 kB at 601 kB/s)
#11 17.15 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.20.0/commons-lang3-3.20.0.jar
#11 17.38 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.21.0/commons-io-2.21.0.jar (585 kB at 683 kB/s)
#11 17.38 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.2/plexus-utils-4.0.2.jar
#11 17.58 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.20.0/commons-lang3-3.20.0.jar (714 kB at 678 kB/s)
#11 17.58 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.1/plexus-xml-3.0.1.jar
#11 17.59 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.28.0/commons-compress-1.28.0.jar (1.1 MB at 1.1 MB/s)
#11 17.59 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.6.0/plexus-io-3.6.0.jar
#11 17.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.2/plexus-utils-4.0.2.jar (193 kB at 176 kB/s)
#11 17.62 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.1.0/plexus-i18n-1.1.0.jar
#11 17.70 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.1/plexus-xml-3.0.1.jar (94 kB at 81 kB/s)
#11 17.70 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-analyzer/1.17.0/maven-dependency-analyzer-1.17.0.jar
#11 17.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.11/xz-1.11.jar (169 kB at 143 kB/s)
#11 17.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.9.1/asm-9.9.1.jar
#11 17.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.6.0/plexus-io-3.6.0.jar (80 kB at 68 kB/s)
#11 17.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.3.0/maven-dependency-tree-3.3.0.jar
#11 17.75 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.1.0/plexus-i18n-1.1.0.jar (10 kB at 8.4 kB/s)
#11 17.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.4.0/maven-common-artifact-filters-3.4.0.jar
#11 17.80 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-analyzer/1.17.0/maven-dependency-analyzer-1.17.0.jar (54 kB at 43 kB/s)
#11 17.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.jar
#11 17.84 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.3.0/maven-dependency-tree-3.3.0.jar (43 kB at 33 kB/s)
#11 17.84 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.jar
#11 17.89 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.9.1/asm-9.9.1.jar (126 kB at 93 kB/s)
#11 17.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.jar
#11 17.91 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.4.0/maven-common-artifact-filters-3.4.0.jar (58 kB at 42 kB/s)
#11 17.91 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.25/maven-resolver-util-1.9.25.jar
#11 17.92 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.jar (159 kB at 114 kB/s)
#11 17.92 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar
#11 17.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.jar (4.2 kB at 3.0 kB/s)
#11 17.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar
#11 18.06 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar (8.5 kB at 5.5 kB/s)
#11 18.06 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-core/2.4.1/velocity-engine-core-2.4.1.jar
#11 18.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar (41 kB at 26 kB/s)
#11 18.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/tools/velocity-tools-generic/3.1/velocity-tools-generic-3.1.jar
#11 18.10 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.25/maven-resolver-util-1.9.25.jar (197 kB at 125 kB/s)
#11 18.10 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.jar
#11 18.13 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.jar (151 kB at 94 kB/s)
#11 18.13 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar
#11 18.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-engine-core/2.4.1/velocity-engine-core-2.4.1.jar (516 kB at 289 kB/s)
#11 18.31 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.jar
#11 18.35 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/tools/velocity-tools-generic/3.1/velocity-tools-generic-3.1.jar (217 kB at 119 kB/s)
#11 18.35 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-digester3/3.2/commons-digester3-3.2.jar
#11 18.36 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar (62 kB at 34 kB/s)
#11 18.36 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/github/cliftonlabs/json-simple/3.0.2/json-simple-3.0.2.jar
#11 18.43 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.jar (247 kB at 129 kB/s)
#11 18.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/github/cliftonlabs/json-simple/3.0.2/json-simple-3.0.2.jar (35 kB at 18 kB/s)
#11 18.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-digester3/3.2/commons-digester3-3.2.jar (242 kB at 116 kB/s)
#11 18.82 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.jar (588 kB at 257 kB/s)
#11 19.12 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.7-6/zstd-jni-1.5.7-6.jar (7.4 MB at 2.9 MB/s)
#11 19.23 [INFO] Resolved plugin: maven-compiler-plugin-3.15.0.jar
#11 19.23 [INFO] Resolved plugin dependency:
#11 19.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom
#11 19.27 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom (4.7 kB at 125 kB/s)
#11 19.27 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom
#11 19.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom (6.4 kB at 163 kB/s)
#11 19.31 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.5.2/plexus-java-1.5.2.pom
#11 19.35 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.5.2/plexus-java-1.5.2.pom (4.1 kB at 107 kB/s)
#11 19.35 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/1.5.2/plexus-languages-1.5.2.pom
#11 19.39 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/1.5.2/plexus-languages-1.5.2.pom (3.9 kB at 99 kB/s)
#11 19.39 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.2.0/qdox-2.2.0.pom
#11 19.43 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.2.0/qdox-2.2.0.pom (18 kB at 420 kB/s)
#11 19.43 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom
#11 19.47 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom (6.6 kB at 149 kB/s)
#11 19.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.16.2/plexus-compiler-api-2.16.2.pom
#11 19.52 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.16.2/plexus-compiler-api-2.16.2.pom (1.4 kB at 30 kB/s)
#11 19.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.16.2/plexus-compiler-2.16.2.pom
#11 19.57 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.16.2/plexus-compiler-2.16.2.pom (7.5 kB at 168 kB/s)
#11 19.58 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.16.2/plexus-compiler-manager-2.16.2.pom
#11 19.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.16.2/plexus-compiler-manager-2.16.2.pom (1.3 kB at 28 kB/s)
#11 19.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.16.2/plexus-compiler-javac-2.16.2.pom
#11 19.67 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.16.2/plexus-compiler-javac-2.16.2.pom (1.3 kB at 31 kB/s)
#11 19.67 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.16.2/plexus-compilers-2.16.2.pom
#11 19.72 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.16.2/plexus-compilers-2.16.2.pom (1.6 kB at 37 kB/s)
#11 19.72 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar
#11 19.72 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar
#11 19.72 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.5.2/plexus-java-1.5.2.jar
#11 19.73 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.2.0/qdox-2.2.0.jar
#11 19.73 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.16.2/plexus-compiler-api-2.16.2.jar
#11 19.81 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar (14 kB at 150 kB/s)
#11 19.81 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.16.2/plexus-compiler-manager-2.16.2.jar
#11 19.82 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.2.0/qdox-2.2.0.jar (353 kB at 3.6 MB/s)
#11 19.82 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.16.2/plexus-compiler-javac-2.16.2.jar
#11 19.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.16.2/plexus-compiler-api-2.16.2.jar (29 kB at 269 kB/s)
#11 19.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.5.2/plexus-java-1.5.2.jar (57 kB at 517 kB/s)
#11 19.87 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.16.2/plexus-compiler-manager-2.16.2.jar (5.2 kB at 38 kB/s)
#11 19.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.16.2/plexus-compiler-javac-2.16.2.jar (30 kB at 202 kB/s)
#11 19.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar (327 kB at 1.5 MB/s)
#11 19.95 [INFO]       maven-compiler-plugin-3.15.0.jar
#11 19.95 [INFO]       asm-9.9.1.jar
#11 19.95 [INFO]       maven-shared-utils-3.4.2.jar
#11 19.95 [INFO]       slf4j-api-1.7.36.jar
#11 19.95 [INFO]       commons-io-2.11.0.jar
#11 19.95 [INFO]       maven-shared-incremental-1.1.jar
#11 19.95 [INFO]       plexus-java-1.5.2.jar
#11 19.95 [INFO]       qdox-2.2.0.jar
#11 19.95 [INFO]       plexus-compiler-api-2.16.2.jar
#11 19.95 [INFO]       plexus-compiler-manager-2.16.2.jar
#11 19.95 [INFO]       javax.inject-1.jar
#11 19.95 [INFO]       plexus-xml-3.0.1.jar
#11 19.95 [INFO]       plexus-compiler-javac-2.16.2.jar
#11 19.95 [INFO]       plexus-utils-4.0.2.jar
#11 19.95 [INFO] Resolved plugin: maven-surefire-plugin-3.5.6.jar
#11 19.95 [INFO] Resolved plugin dependency:
#11 19.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.5.6/surefire-api-3.5.6.pom
#11 19.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.5.6/surefire-api-3.5.6.pom (3.7 kB at 86 kB/s)
#11 20.00 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.5.6/surefire-logger-api-3.5.6.pom
#11 20.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.5.6/surefire-logger-api-3.5.6.pom (3.5 kB at 81 kB/s)
#11 20.04 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.5.6/surefire-shared-utils-3.5.6.pom
#11 20.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.5.6/surefire-shared-utils-3.5.6.pom (4.0 kB at 86 kB/s)
#11 20.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.5.6/surefire-extensions-api-3.5.6.pom
#11 20.13 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.5.6/surefire-extensions-api-3.5.6.pom (3.6 kB at 79 kB/s)
#11 20.14 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.5.6/maven-surefire-common-3.5.6.pom
#11 20.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.5.6/maven-surefire-common-3.5.6.pom (7.3 kB at 162 kB/s)
#11 20.19 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.5.6/surefire-booter-3.5.6.pom
#11 20.24 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.5.6/surefire-booter-3.5.6.pom (5.1 kB at 102 kB/s)
#11 20.24 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.5.6/surefire-extensions-spi-3.5.6.pom
#11 20.29 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.5.6/surefire-extensions-spi-3.5.6.pom (1.7 kB at 34 kB/s)
#11 20.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.5.6/surefire-api-3.5.6.jar
#11 20.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.5.6/surefire-shared-utils-3.5.6.jar
#11 20.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.5.6/surefire-logger-api-3.5.6.jar
#11 20.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.5.6/surefire-extensions-api-3.5.6.jar
#11 20.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.5.6/maven-surefire-common-3.5.6.jar
#11 20.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.5.6/surefire-extensions-api-3.5.6.jar (26 kB at 141 kB/s)
#11 20.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.5.6/surefire-booter-3.5.6.jar
#11 20.49 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.5.6/surefire-logger-api-3.5.6.jar (14 kB at 72 kB/s)
#11 20.49 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.5.6/surefire-extensions-spi-3.5.6.jar
#11 20.67 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.5.6/maven-surefire-common-3.5.6.jar (317 kB at 859 kB/s)
#11 20.67 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.jar
#11 20.67 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.5.6/surefire-extensions-spi-3.5.6.jar (8.2 kB at 22 kB/s)
#11 20.72 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.5.6/surefire-api-3.5.6.jar (174 kB at 413 kB/s)
#11 20.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.5.6/surefire-booter-3.5.6.jar (123 kB at 284 kB/s)
#11 20.86 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.jar (168 kB at 301 kB/s)
#11 20.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.5.6/surefire-shared-utils-3.5.6.jar (3.0 MB at 4.7 MB/s)
#11 20.94 [INFO]       maven-surefire-plugin-3.5.6.jar
#11 20.94 [INFO]       surefire-api-3.5.6.jar
#11 20.94 [INFO]       surefire-logger-api-3.5.6.jar
#11 20.94 [INFO]       surefire-shared-utils-3.5.6.jar
#11 20.94 [INFO]       surefire-extensions-api-3.5.6.jar
#11 20.94 [INFO]       maven-surefire-common-3.5.6.jar
#11 20.94 [INFO]       surefire-booter-3.5.6.jar
#11 20.94 [INFO]       surefire-extensions-spi-3.5.6.jar
#11 20.94 [INFO]       maven-resolver-util-1.4.1.jar
#11 20.94 [INFO]       maven-resolver-api-1.4.1.jar
#11 20.94 [INFO]       maven-common-artifact-filters-3.4.0.jar
#11 20.94 [INFO]       slf4j-api-1.7.36.jar
#11 20.94 [INFO]       plexus-java-1.5.2.jar
#11 20.94 [INFO]       asm-9.9.1.jar
#11 20.94 [INFO]       qdox-2.2.0.jar
#11 20.94 [INFO] Resolved plugin: maven-jar-plugin-3.5.0.jar
#11 20.94 [INFO] Resolved plugin dependency:
#11 20.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.2.0/file-management-3.2.0.pom
#11 20.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.2.0/file-management-3.2.0.pom (4.5 kB at 100 kB/s)
#11 20.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/44/maven-shared-components-44.pom
#11 21.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/44/maven-shared-components-44.pom (3.8 kB at 74 kB/s)
#11 21.04 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.19.0/commons-io-2.19.0.pom
#11 21.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.19.0/commons-io-2.19.0.pom (21 kB at 459 kB/s)
#11 21.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/81/commons-parent-81.pom
#11 21.14 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/81/commons-parent-81.pom (78 kB at 1.5 MB/s)
#11 21.15 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.11.4/junit-bom-5.11.4.pom
#11 21.19 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.11.4/junit-bom-5.11.4.pom (5.6 kB at 128 kB/s)
#11 21.19 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.5/maven-archiver-3.6.5.pom
#11 21.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.5/maven-archiver-3.6.5.pom (4.7 kB at 110 kB/s)
#11 21.24 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/45/maven-shared-components-45.pom
#11 21.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/45/maven-shared-components-45.pom (3.8 kB at 84 kB/s)
#11 21.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.10.2/plexus-archiver-4.10.2.pom
#11 21.32 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.10.2/plexus-archiver-4.10.2.pom (7.0 kB at 174 kB/s)
#11 21.32 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/23/plexus-23.pom
#11 21.37 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/23/plexus-23.pom (31 kB at 683 kB/s)
#11 21.37 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.5.1/plexus-io-3.5.1.pom
#11 21.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.5.1/plexus-io-3.5.1.pom (4.3 kB at 112 kB/s)
#11 21.41 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.pom
#11 21.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.pom (20 kB at 456 kB/s)
#11 21.46 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/airlift/aircompressor/0.27/aircompressor-0.27.pom
#11 21.51 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/airlift/aircompressor/0.27/aircompressor-0.27.pom (5.8 kB at 111 kB/s)
#11 21.51 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/airlift/airbase/112/airbase-112.pom
#11 21.57 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/airlift/airbase/112/airbase-112.pom (69 kB at 1.3 MB/s)
#11 21.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.8.0-M1/junit-bom-5.8.0-M1.pom
#11 21.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.8.0-M1/junit-bom-5.8.0-M1.pom (5.7 kB at 121 kB/s)
#11 21.62 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.10/xz-1.10.pom
#11 21.67 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.10/xz-1.10.pom (1.9 kB at 39 kB/s)
#11 21.67 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.7-4/zstd-jni-1.5.7-4.pom
#11 21.72 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.7-4/zstd-jni-1.5.7-4.pom (2.0 kB at 42 kB/s)
#11 21.72 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.28/plexus-interpolation-1.28.pom
#11 21.77 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.28/plexus-interpolation-1.28.pom (3.4 kB at 70 kB/s)
#11 21.78 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/20/plexus-20.pom
#11 21.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/20/plexus-20.pom (29 kB at 572 kB/s)
#11 21.83 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.10.4/plexus-archiver-4.10.4.pom
#11 21.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.10.4/plexus-archiver-4.10.4.pom (5.6 kB at 115 kB/s)
#11 21.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.2.0/file-management-3.2.0.jar
#11 21.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.5/maven-archiver-3.6.5.jar
#11 21.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.28/plexus-interpolation-1.28.jar
#11 21.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.10.4/plexus-archiver-4.10.4.jar
#11 21.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.18.0/commons-lang3-3.18.0.jar
#11 21.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.2.0/file-management-3.2.0.jar (26 kB at 529 kB/s)
#11 21.93 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/airlift/aircompressor/0.27/aircompressor-0.27.jar
#11 21.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.5/maven-archiver-3.6.5.jar (28 kB at 506 kB/s)
#11 21.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.10/xz-1.10.jar
#11 22.01 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.28/plexus-interpolation-1.28.jar (87 kB at 692 kB/s)
#11 22.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/airlift/aircompressor/0.27/aircompressor-0.27.jar (255 kB at 1.7 MB/s)
#11 22.06 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.10.4/plexus-archiver-4.10.4.jar (227 kB at 1.3 MB/s)
#11 22.07 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.10/xz-1.10.jar (169 kB at 926 kB/s)
#11 22.29 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.18.0/commons-lang3-3.18.0.jar (703 kB at 1.7 MB/s)
#11 22.29 [INFO]       maven-jar-plugin-3.5.0.jar
#11 22.29 [INFO]       file-management-3.2.0.jar
#11 22.29 [INFO]       plexus-utils-4.0.2.jar
#11 22.29 [INFO]       maven-archiver-3.6.5.jar
#11 22.29 [INFO]       plexus-interpolation-1.28.jar
#11 22.29 [INFO]       plexus-xml-3.0.1.jar
#11 22.29 [INFO]       plexus-archiver-4.10.4.jar
#11 22.29 [INFO]       plexus-io-3.6.0.jar
#11 22.29 [INFO]       commons-compress-1.28.0.jar
#11 22.29 [INFO]       commons-codec-1.19.0.jar
#11 22.29 [INFO]       commons-lang3-3.18.0.jar
#11 22.29 [INFO]       aircompressor-0.27.jar
#11 22.29 [INFO]       xz-1.10.jar
#11 22.29 [INFO]       zstd-jni-1.5.7-6.jar
#11 22.29 [INFO]       javax.inject-1.jar
#11 22.29 [INFO]       slf4j-api-1.7.36.jar
#11 22.29 [INFO]       commons-io-2.21.0.jar
#11 22.30 [INFO] Resolved plugin: maven-clean-plugin-3.5.0.jar
#11 22.30 [INFO] Resolved plugin dependency:
#11 22.30 [INFO]       maven-clean-plugin-3.5.0.jar
#11 22.30 [INFO]       plexus-utils-4.0.2.jar
#11 22.30 [INFO] Resolved plugin: maven-install-plugin-3.1.4.jar
#11 22.30 [INFO] Resolved plugin dependency:
#11 22.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.22/maven-resolver-util-1.9.22.pom
#11 22.35 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.22/maven-resolver-util-1.9.22.pom (2.2 kB at 45 kB/s)
#11 22.35 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver/1.9.22/maven-resolver-1.9.22.pom
#11 22.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver/1.9.22/maven-resolver-1.9.22.pom (23 kB at 470 kB/s)
#11 22.41 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.9.22/maven-resolver-api-1.9.22.pom
#11 22.47 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.9.22/maven-resolver-api-1.9.22.pom (2.2 kB at 39 kB/s)
#11 22.47 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.pom
#11 22.52 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.pom (7.8 kB at 145 kB/s)
#11 22.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.22/maven-resolver-util-1.9.22.jar
#11 22.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.9.22/maven-resolver-api-1.9.22.jar
#11 22.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.jar
#11 22.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.22/maven-resolver-util-1.9.22.jar (196 kB at 2.1 MB/s)
#11 22.65 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.9.22/maven-resolver-api-1.9.22.jar (157 kB at 1.3 MB/s)
#11 22.66 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.jar (193 kB at 1.5 MB/s)
#11 22.66 [INFO]       maven-install-plugin-3.1.4.jar
#11 22.66 [INFO]       maven-resolver-util-1.9.22.jar
#11 22.66 [INFO]       maven-resolver-api-1.9.22.jar
#11 22.66 [INFO]       plexus-utils-4.0.1.jar
#11 22.66 [INFO]       plexus-xml-3.0.1.jar
#11 22.66 [INFO] Resolved plugin: maven-site-plugin-3.3.jar
#11 22.66 [INFO] Resolved plugin dependency:
#11 22.67 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-exec/1.1/maven-reporting-exec-1.1.pom
#11 22.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-exec/1.1/maven-reporting-exec-1.1.pom (11 kB at 171 kB/s)
#11 22.74 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.pom
#11 22.80 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.pom (2.4 kB at 36 kB/s)
#11 22.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/15/maven-shared-components-15.pom
#11 22.86 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/15/maven-shared-components-15.pom (9.3 kB at 156 kB/s)
#11 22.87 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/16/maven-parent-16.pom
#11 22.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/16/maven-parent-16.pom (23 kB at 394 kB/s)
#11 22.93 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.pom
#11 22.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.pom (1.4 kB at 23 kB/s)
#11 22.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0/doxia-1.0.pom
#11 23.05 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0/doxia-1.0.pom (9.6 kB at 161 kB/s)
#11 23.05 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/10/maven-parent-10.pom
#11 23.11 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/10/maven-parent-10.pom (32 kB at 545 kB/s)
#11 23.11 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.pom
#11 23.16 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.pom (1.9 kB at 33 kB/s)
#11 23.17 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.pom
#11 23.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.pom (3.3 kB at 60 kB/s)
#11 23.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.pom
#11 23.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.pom (6.6 kB at 112 kB/s)
#11 23.29 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.pom
#11 23.35 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.pom (1.9 kB at 28 kB/s)
#11 23.36 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.pom
#11 23.42 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.pom (2.2 kB at 36 kB/s)
#11 23.42 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom
#11 23.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom (910 B at 15 kB/s)
#11 23.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom
#11 23.54 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom (5.4 kB at 92 kB/s)
#11 23.54 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom
#11 23.60 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom (17 kB at 288 kB/s)
#11 23.60 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom
#11 23.67 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom (815 B at 13 kB/s)
#11 23.67 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom
#11 23.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom (4.2 kB at 70 kB/s)
#11 23.74 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom
#11 23.80 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom (3.0 kB at 45 kB/s)
#11 23.81 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom
#11 23.87 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom (6.8 kB at 105 kB/s)
#11 23.87 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom
#11 23.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom (8.4 kB at 120 kB/s)
#11 23.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.5/plexus-utils-1.5.5.pom
#11 24.01 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.5/plexus-utils-1.5.5.pom (5.1 kB at 83 kB/s)
#11 24.01 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.11/plexus-1.0.11.pom
#11 24.08 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.11/plexus-1.0.11.pom (9.0 kB at 140 kB/s)
#11 24.08 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom
#11 24.14 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom (2.1 kB at 32 kB/s)
#11 24.15 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.pom
#11 24.21 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.pom (1.9 kB at 30 kB/s)
#11 24.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom
#11 24.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom (3.3 kB at 54 kB/s)
#11 24.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom
#11 24.34 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom (2.2 kB at 36 kB/s)
#11 24.35 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.pom
#11 24.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.pom (2.5 kB at 37 kB/s)
#11 24.42 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.pom
#11 24.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.pom (2.1 kB at 33 kB/s)
#11 24.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-parent/1.7/aether-parent-1.7.pom
#11 24.55 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-parent/1.7/aether-parent-1.7.pom (7.7 kB at 121 kB/s)
#11 24.55 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.3/maven-shared-utils-0.3.pom
#11 24.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.3/maven-shared-utils-0.3.pom (4.0 kB at 61 kB/s)
#11 24.62 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/18/maven-shared-components-18.pom
#11 24.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/18/maven-shared-components-18.pom (4.9 kB at 76 kB/s)
#11 24.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/22/maven-parent-22.pom
#11 24.75 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/22/maven-parent-22.pom (30 kB at 480 kB/s)
#11 24.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/11/apache-11.pom
#11 24.81 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/11/apache-11.pom (15 kB at 243 kB/s)
#11 24.82 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.pom
#11 24.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.pom (965 B at 15 kB/s)
#11 24.88 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.pom
#11 24.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.pom (2.0 kB at 33 kB/s)
#11 24.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/0.9.0.M2/aether-0.9.0.M2.pom
#11 25.01 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/0.9.0.M2/aether-0.9.0.M2.pom (28 kB at 442 kB/s)
#11 25.01 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.pom
#11 25.08 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.pom (1.7 kB at 27 kB/s)
#11 25.08 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.pom
#11 25.14 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.pom (3.7 kB at 63 kB/s)
#11 25.14 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.pom
#11 25.20 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.pom (1.7 kB at 29 kB/s)
#11 25.20 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.4.2/maven-archiver-2.4.2.pom
#11 25.26 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.4.2/maven-archiver-2.4.2.pom (4.0 kB at 67 kB/s)
#11 25.26 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/16/maven-shared-components-16.pom
#11 25.32 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/16/maven-shared-components-16.pom (9.2 kB at 153 kB/s)
#11 25.33 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/19/maven-parent-19.pom
#11 25.39 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/19/maven-parent-19.pom (25 kB at 397 kB/s)
#11 25.39 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.6/maven-artifact-2.0.6.pom
#11 25.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.6/maven-artifact-2.0.6.pom (1.6 kB at 27 kB/s)
#11 25.45 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.6/maven-2.0.6.pom
#11 25.51 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.6/maven-2.0.6.pom (9.0 kB at 148 kB/s)
#11 25.51 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/5/maven-parent-5.pom
#11 25.58 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/5/maven-parent-5.pom (15 kB at 238 kB/s)
#11 25.58 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/3/apache-3.pom
#11 25.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/3/apache-3.pom (3.4 kB at 54 kB/s)
#11 25.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.1/plexus-utils-1.4.1.pom
#11 25.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.1/plexus-utils-1.4.1.pom (1.9 kB at 31 kB/s)
#11 25.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.6/maven-model-2.0.6.pom
#11 25.77 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.6/maven-model-2.0.6.pom (3.0 kB at 50 kB/s)
#11 25.78 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.0.1/plexus-archiver-2.0.1.pom
#11 25.84 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.0.1/plexus-archiver-2.0.1.pom (2.8 kB at 44 kB/s)
#11 25.84 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom
#11 25.91 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom (6.8 kB at 98 kB/s)
#11 25.91 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom
#11 25.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom (14 kB at 215 kB/s)
#11 25.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom
#11 26.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom (3.9 kB at 61 kB/s)
#11 26.05 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom
#11 26.11 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom (492 B at 7.8 kB/s)
#11 26.11 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom
#11 26.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom (5.7 kB at 91 kB/s)
#11 26.18 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.pom
#11 26.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.pom (998 B at 15 kB/s)
#11 26.25 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.0.4/plexus-utils-1.0.4.pom
#11 26.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.0.4/plexus-utils-1.0.4.pom (6.9 kB at 112 kB/s)
#11 26.31 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.pom
#11 26.37 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.pom (3.1 kB at 54 kB/s)
#11 26.37 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0/plexus-utils-3.0.pom
#11 26.43 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0/plexus-utils-3.0.pom (4.1 kB at 65 kB/s)
#11 26.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/16/spice-parent-16.pom
#11 26.50 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/16/spice-parent-16.pom (8.4 kB at 139 kB/s)
#11 26.50 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.0.1/plexus-io-2.0.1.pom
#11 26.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.0.1/plexus-io-2.0.1.pom (1.7 kB at 27 kB/s)
#11 26.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.19/plexus-components-1.1.19.pom
#11 26.63 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.19/plexus-components-1.1.19.pom (2.7 kB at 44 kB/s)
#11 26.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.0.1/plexus-3.0.1.pom
#11 26.70 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.0.1/plexus-3.0.1.pom (19 kB at 274 kB/s)
#11 26.70 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.13/plexus-interpolation-1.13.pom
#11 26.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.13/plexus-interpolation-1.13.pom (890 B at 15 kB/s)
#11 26.77 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.15/plexus-components-1.1.15.pom
#11 26.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.15/plexus-components-1.1.15.pom (2.8 kB at 47 kB/s)
#11 26.83 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.3/plexus-2.0.3.pom
#11 26.89 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.3/plexus-2.0.3.pom (15 kB at 245 kB/s)
#11 26.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.4/doxia-sink-api-1.4.pom
#11 26.96 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.4/doxia-sink-api-1.4.pom (1.5 kB at 24 kB/s)
#11 26.96 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.4/doxia-1.4.pom
#11 27.02 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.4/doxia-1.4.pom (18 kB at 276 kB/s)
#11 27.03 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.4/doxia-logging-api-1.4.pom
#11 27.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.4/doxia-logging-api-1.4.pom (1.5 kB at 24 kB/s)
#11 27.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-30/plexus-container-default-1.0-alpha-30.pom
#11 27.16 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-30/plexus-container-default-1.0-alpha-30.pom (3.5 kB at 54 kB/s)
#11 27.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0-alpha-30/plexus-containers-1.0-alpha-30.pom
#11 27.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0-alpha-30/plexus-containers-1.0-alpha-30.pom (1.9 kB at 30 kB/s)
#11 27.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.5/plexus-utils-1.4.5.pom
#11 27.29 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.5/plexus-utils-1.4.5.pom (2.3 kB at 34 kB/s)
#11 27.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/1.2-alpha-9/plexus-classworlds-1.2-alpha-9.pom
#11 27.36 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/1.2-alpha-9/plexus-classworlds-1.2-alpha-9.pom (3.2 kB at 53 kB/s)
#11 27.36 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.4/doxia-core-1.4.pom
#11 27.42 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.4/doxia-core-1.4.pom (4.1 kB at 67 kB/s)
#11 27.43 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.10/plexus-utils-3.0.10.pom
#11 27.49 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.10/plexus-utils-3.0.10.pom (3.1 kB at 47 kB/s)
#11 27.50 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3/plexus-3.3.pom
#11 27.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3/plexus-3.3.pom (20 kB at 302 kB/s)
#11 27.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/xerces/xercesImpl/2.9.1/xercesImpl-2.9.1.pom
#11 27.63 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/xerces/xercesImpl/2.9.1/xercesImpl-2.9.1.pom (1.4 kB at 22 kB/s)
#11 27.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.3.04/xml-apis-1.3.04.pom
#11 27.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.3.04/xml-apis-1.3.04.pom (1.8 kB at 31 kB/s)
#11 27.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.4/commons-lang-2.4.pom
#11 27.75 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.4/commons-lang-2.4.pom (14 kB at 233 kB/s)
#11 27.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/9/commons-parent-9.pom
#11 27.81 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/9/commons-parent-9.pom (22 kB at 378 kB/s)
#11 27.81 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.0.2/httpclient-4.0.2.pom
#11 27.87 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.0.2/httpclient-4.0.2.pom (7.5 kB at 121 kB/s)
#11 27.87 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-client/4.0.2/httpcomponents-client-4.0.2.pom
#11 27.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-client/4.0.2/httpcomponents-client-4.0.2.pom (9.0 kB at 145 kB/s)
#11 27.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/project/4.1/project-4.1.pom
#11 28.01 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/project/4.1/project-4.1.pom (16 kB at 241 kB/s)
#11 28.01 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.0.1/httpcore-4.0.1.pom
#11 28.07 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.0.1/httpcore-4.0.1.pom (4.9 kB at 78 kB/s)
#11 28.07 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.0.1/httpcomponents-core-4.0.1.pom
#11 28.14 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.0.1/httpcomponents-core-4.0.1.pom (9.4 kB at 142 kB/s)
#11 28.14 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/project/4.0/project-4.0.pom
#11 28.21 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/project/4.0/project-4.0.pom (13 kB at 202 kB/s)
#11 28.21 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.3/commons-codec-1.3.pom
#11 28.27 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.3/commons-codec-1.3.pom (6.1 kB at 97 kB/s)
#11 28.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.4/doxia-module-xhtml-1.4.pom
#11 28.34 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.4/doxia-module-xhtml-1.4.pom (1.6 kB at 25 kB/s)
#11 28.34 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-modules/1.4/doxia-modules-1.4.pom
#11 28.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-modules/1.4/doxia-modules-1.4.pom (2.6 kB at 41 kB/s)
#11 28.41 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-apt/1.4/doxia-module-apt-1.4.pom
#11 28.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-apt/1.4/doxia-module-apt-1.4.pom (1.7 kB at 26 kB/s)
#11 28.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xdoc/1.4/doxia-module-xdoc-1.4.pom
#11 28.55 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xdoc/1.4/doxia-module-xdoc-1.4.pom (4.6 kB at 67 kB/s)
#11 28.55 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-fml/1.4/doxia-module-fml-1.4.pom
#11 28.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-fml/1.4/doxia-module-fml-1.4.pom (4.8 kB at 73 kB/s)
#11 28.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-markdown/1.4/doxia-module-markdown-1.4.pom
#11 28.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-markdown/1.4/doxia-module-markdown-1.4.pom (2.1 kB at 33 kB/s)
#11 28.70 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/pegdown/pegdown/1.2.1/pegdown-1.2.1.pom
#11 28.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/pegdown/pegdown/1.2.1/pegdown-1.2.1.pom (1.9 kB at 31 kB/s)
#11 28.76 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/parboiled/parboiled-java/1.1.4/parboiled-java-1.1.4.pom
#11 28.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/parboiled/parboiled-java/1.1.4/parboiled-java-1.1.4.pom (2.6 kB at 39 kB/s)
#11 28.83 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/parboiled/parboiled-core/1.1.4/parboiled-core-1.1.4.pom
#11 28.90 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/parboiled/parboiled-core/1.1.4/parboiled-core-1.1.4.pom (1.7 kB at 24 kB/s)
#11 28.90 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/4.1/asm-4.1.pom
#11 28.97 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/4.1/asm-4.1.pom (1.9 kB at 30 kB/s)
#11 28.97 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-parent/4.1/asm-parent-4.1.pom
#11 29.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-parent/4.1/asm-parent-4.1.pom (5.5 kB at 83 kB/s)
#11 29.04 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.3/ow2-1.3.pom
#11 29.10 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.3/ow2-1.3.pom (9.5 kB at 151 kB/s)
#11 29.10 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/4.1/asm-tree-4.1.pom
#11 29.16 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/4.1/asm-tree-4.1.pom (2.1 kB at 34 kB/s)
#11 29.17 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/4.1/asm-analysis-4.1.pom
#11 29.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/4.1/asm-analysis-4.1.pom (2.1 kB at 34 kB/s)
#11 29.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-util/4.1/asm-util-4.1.pom
#11 29.30 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-util/4.1/asm-util-4.1.pom (2.1 kB at 33 kB/s)
#11 29.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/servlet/servlet-api/2.5/servlet-api-2.5.pom
#11 29.36 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/servlet/servlet-api/2.5/servlet-api-2.5.pom (157 B at 2.6 kB/s)
#11 29.36 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.4/doxia-decoration-model-1.4.pom
#11 29.42 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.4/doxia-decoration-model-1.4.pom (2.7 kB at 45 kB/s)
#11 29.42 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.4/doxia-sitetools-1.4.pom
#11 29.49 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.4/doxia-sitetools-1.4.pom (17 kB at 268 kB/s)
#11 29.49 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.4/doxia-site-renderer-1.4.pom
#11 29.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.4/doxia-site-renderer-1.4.pom (6.1 kB at 91 kB/s)
#11 29.56 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.0-beta-7/plexus-i18n-1.0-beta-7.pom
#11 29.63 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.0-beta-7/plexus-i18n-1.0-beta-7.pom (1.1 kB at 16 kB/s)
#11 29.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.1.7/plexus-velocity-1.1.7.pom
#11 29.70 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.1.7/plexus-velocity-1.1.7.pom (2.0 kB at 31 kB/s)
#11 29.70 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-20/plexus-container-default-1.0-alpha-20.pom
#11 29.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-20/plexus-container-default-1.0-alpha-20.pom (3.0 kB at 50 kB/s)
#11 29.76 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0-alpha-20/plexus-containers-1.0-alpha-20.pom
#11 29.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0-alpha-20/plexus-containers-1.0-alpha-20.pom (1.9 kB at 30 kB/s)
#11 29.83 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.3/plexus-utils-1.3.pom
#11 29.89 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.3/plexus-utils-1.3.pom (1.0 kB at 16 kB/s)
#11 29.90 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.8/plexus-1.0.8.pom
#11 29.96 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.8/plexus-1.0.8.pom (7.2 kB at 117 kB/s)
#11 29.96 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/1.2-alpha-7/plexus-classworlds-1.2-alpha-7.pom
#11 30.03 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/1.2-alpha-7/plexus-classworlds-1.2-alpha-7.pom (2.4 kB at 36 kB/s)
#11 30.03 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.9/plexus-1.0.9.pom
#11 30.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.9/plexus-1.0.9.pom (7.7 kB at 130 kB/s)
#11 30.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.5/velocity-1.5.pom
#11 30.16 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.5/velocity-1.5.pom (7.8 kB at 123 kB/s)
#11 30.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.1/commons-collections-3.1.pom
#11 30.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.1/commons-collections-3.1.pom (6.1 kB at 101 kB/s)
#11 30.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.1/commons-lang-2.1.pom
#11 30.29 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.1/commons-lang-2.1.pom (9.9 kB at 163 kB/s)
#11 30.29 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/oro/oro/2.0.8/oro-2.0.8.pom
#11 30.35 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/oro/oro/2.0.8/oro-2.0.8.pom (140 B at 2.3 kB/s)
#11 30.35 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-tools/2.0/velocity-tools-2.0.pom
#11 30.42 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-tools/2.0/velocity-tools-2.0.pom (18 kB at 289 kB/s)
#11 30.42 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.7.0/commons-beanutils-1.7.0.pom
#11 30.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.7.0/commons-beanutils-1.7.0.pom (357 B at 6.2 kB/s)
#11 30.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.0.3/commons-logging-1.0.3.pom
#11 30.54 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.0.3/commons-logging-1.0.3.pom (866 B at 14 kB/s)
#11 30.54 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.8/commons-digester-1.8.pom
#11 30.60 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.8/commons-digester-1.8.pom (7.0 kB at 113 kB/s)
#11 30.61 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.1/commons-logging-1.1.pom
#11 30.67 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.1/commons-logging-1.1.pom (6.2 kB at 105 kB/s)
#11 30.67 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.12/log4j-1.2.12.pom
#11 30.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.12/log4j-1.2.12.pom (145 B at 2.4 kB/s)
#11 30.73 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/logkit/logkit/1.0.1/logkit-1.0.1.pom
#11 30.79 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/logkit/logkit/1.0.1/logkit-1.0.1.pom (147 B at 2.5 kB/s)
#11 30.79 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/avalon-framework/avalon-framework/4.1.3/avalon-framework-4.1.3.pom
#11 30.85 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/avalon-framework/avalon-framework/4.1.3/avalon-framework-4.1.3.pom (167 B at 2.8 kB/s)
#11 30.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/servlet/servlet-api/2.3/servlet-api-2.3.pom
#11 30.91 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/servlet/servlet-api/2.3/servlet-api-2.3.pom (156 B at 2.7 kB/s)
#11 30.91 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-chain/commons-chain/1.1/commons-chain-1.1.pom
#11 30.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-chain/commons-chain/1.1/commons-chain-1.1.pom (6.0 kB at 88 kB/s)
#11 30.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.6/commons-digester-1.6.pom
#11 31.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.6/commons-digester-1.6.pom (974 B at 16 kB/s)
#11 31.05 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.6/commons-beanutils-1.6.pom
#11 31.11 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.6/commons-beanutils-1.6.pom (2.3 kB at 36 kB/s)
#11 31.11 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.0/commons-logging-1.0.pom
#11 31.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.0/commons-logging-1.0.pom (163 B at 2.5 kB/s)
#11 31.18 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/2.0/commons-collections-2.0.pom
#11 31.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/2.0/commons-collections-2.0.pom (171 B at 2.7 kB/s)
#11 31.25 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/2.1/commons-collections-2.1.pom
#11 31.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/2.1/commons-collections-2.1.pom (3.3 kB at 53 kB/s)
#11 31.32 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.pom
#11 31.38 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.pom (2.2 kB at 35 kB/s)
#11 31.38 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2/commons-collections-3.2.pom
#11 31.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2/commons-collections-3.2.pom (11 kB at 178 kB/s)
#11 31.45 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-validator/commons-validator/1.3.1/commons-validator-1.3.1.pom
#11 31.51 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-validator/commons-validator/1.3.1/commons-validator-1.3.1.pom (9.0 kB at 146 kB/s)
#11 31.52 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.0.4/commons-logging-1.0.4.pom
#11 31.58 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.0.4/commons-logging-1.0.4.pom (5.3 kB at 84 kB/s)
#11 31.58 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/dom4j/dom4j/1.1/dom4j-1.1.pom
#11 31.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/dom4j/dom4j/1.1/dom4j-1.1.pom (142 B at 2.3 kB/s)
#11 31.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/sslext/sslext/1.2-0/sslext-1.2-0.pom
#11 31.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/sslext/sslext/1.2-0/sslext-1.2-0.pom (653 B at 10 kB/s)
#11 31.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-core/1.3.8/struts-core-1.3.8.pom
#11 31.78 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-core/1.3.8/struts-core-1.3.8.pom (4.3 kB at 67 kB/s)
#11 31.78 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-parent/1.3.8/struts-parent-1.3.8.pom
#11 31.85 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-parent/1.3.8/struts-parent-1.3.8.pom (9.8 kB at 151 kB/s)
#11 31.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-master/4/struts-master-4.pom
#11 31.91 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-master/4/struts-master-4.pom (12 kB at 185 kB/s)
#11 31.92 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/2/apache-2.pom
#11 31.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/2/apache-2.pom (3.4 kB at 55 kB/s)
#11 31.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/antlr/antlr/2.7.2/antlr-2.7.2.pom
#11 32.05 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/antlr/antlr/2.7.2/antlr-2.7.2.pom (145 B at 2.2 kB/s)
#11 32.05 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-taglib/1.3.8/struts-taglib-1.3.8.pom
#11 32.12 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-taglib/1.3.8/struts-taglib-1.3.8.pom (3.1 kB at 45 kB/s)
#11 32.12 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-tiles/1.3.8/struts-tiles-1.3.8.pom
#11 32.19 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-tiles/1.3.8/struts-tiles-1.3.8.pom (2.9 kB at 45 kB/s)
#11 32.19 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.6.2/velocity-1.6.2.pom
#11 32.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.6.2/velocity-1.6.2.pom (11 kB at 171 kB/s)
#11 32.26 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.pom
#11 32.32 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.pom (13 kB at 205 kB/s)
#11 32.32 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.5/doxia-integration-tools-1.5.pom
#11 32.38 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.5/doxia-integration-tools-1.5.pom (6.9 kB at 108 kB/s)
#11 32.39 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-tools/2/doxia-tools-2.pom
#11 32.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-tools/2/doxia-tools-2.pom (12 kB at 178 kB/s)
#11 32.46 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/1.4/commons-io-1.4.pom
#11 32.52 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/1.4/commons-io-1.4.pom (13 kB at 212 kB/s)
#11 32.52 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/7/commons-parent-7.pom
#11 32.59 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/7/commons-parent-7.pom (17 kB at 278 kB/s)
#11 32.60 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.pom
#11 32.66 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.pom (1.6 kB at 25 kB/s)
#11 32.66 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.1/maven-2.2.1.pom
#11 32.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.1/maven-2.2.1.pom (22 kB at 367 kB/s)
#11 32.73 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/11/maven-parent-11.pom
#11 32.79 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/11/maven-parent-11.pom (32 kB at 506 kB/s)
#11 32.79 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/5/apache-5.pom
#11 32.86 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/5/apache-5.pom (4.1 kB at 67 kB/s)
#11 32.86 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.pom
#11 32.92 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.pom (6.8 kB at 109 kB/s)
#11 32.92 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.2/plexus-2.0.2.pom
#11 32.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.2/plexus-2.0.2.pom (12 kB at 190 kB/s)
#11 32.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.pom
#11 33.05 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.pom (3.2 kB at 51 kB/s)
#11 33.05 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.pom
#11 33.12 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.pom (1.5 kB at 23 kB/s)
#11 33.12 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.3/doxia-logging-api-1.3.pom
#11 33.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.3/doxia-logging-api-1.3.pom (1.6 kB at 27 kB/s)
#11 33.19 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.3/doxia-1.3.pom
#11 33.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.3/doxia-1.3.pom (18 kB at 275 kB/s)
#11 33.25 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/21/maven-parent-21.pom
#11 33.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/21/maven-parent-21.pom (26 kB at 432 kB/s)
#11 33.32 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/10/apache-10.pom
#11 33.38 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/10/apache-10.pom (15 kB at 247 kB/s)
#11 33.38 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.3/doxia-decoration-model-1.3.pom
#11 33.44 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.3/doxia-decoration-model-1.3.pom (3.1 kB at 48 kB/s)
#11 33.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.3/doxia-sitetools-1.3.pom
#11 33.51 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.3/doxia-sitetools-1.3.pom (16 kB at 252 kB/s)
#11 33.51 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.pom
#11 33.58 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.pom (1.2 kB at 19 kB/s)
#11 33.58 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0/wagon-provider-api-1.0.pom
#11 33.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0/wagon-provider-api-1.0.pom (1.8 kB at 27 kB/s)
#11 33.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/1.0/wagon-1.0.pom
#11 33.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/1.0/wagon-1.0.pom (9.8 kB at 156 kB/s)
#11 33.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/20/maven-parent-20.pom
#11 33.78 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/20/maven-parent-20.pom (25 kB at 379 kB/s)
#11 33.78 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.2/plexus-utils-1.4.2.pom
#11 33.85 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.2/plexus-utils-1.4.2.pom (2.0 kB at 30 kB/s)
#11 33.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/1.0/plexus-archiver-1.0.pom
#11 33.91 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/1.0/plexus-archiver-1.0.pom (1.6 kB at 26 kB/s)
#11 33.91 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.17/plexus-components-1.1.17.pom
#11 33.97 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.17/plexus-components-1.1.17.pom (5.2 kB at 85 kB/s)
#11 33.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/1.0/plexus-io-1.0.pom
#11 34.05 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/1.0/plexus-io-1.0.pom (1.2 kB at 18 kB/s)
#11 34.05 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.1.8/plexus-velocity-1.1.8.pom
#11 34.11 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.1.8/plexus-velocity-1.1.8.pom (1.9 kB at 30 kB/s)
#11 34.12 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.10/plexus-utils-1.5.10.pom
#11 34.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.10/plexus-utils-1.5.10.pom (5.6 kB at 89 kB/s)
#11 34.18 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty/6.1.25/jetty-6.1.25.pom
#11 34.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty/6.1.25/jetty-6.1.25.pom (6.3 kB at 96 kB/s)
#11 34.25 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/project/6.1.25/project-6.1.25.pom
#11 34.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/project/6.1.25/project-6.1.25.pom (9.2 kB at 144 kB/s)
#11 34.32 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty-parent/10/jetty-parent-10.pom
#11 34.38 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty-parent/10/jetty-parent-10.pom (3.3 kB at 51 kB/s)
#11 34.38 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-parent/14/jetty-parent-14.pom
#11 34.44 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-parent/14/jetty-parent-14.pom (16 kB at 275 kB/s)
#11 34.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty-util/6.1.25/jetty-util-6.1.25.pom
#11 34.50 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty-util/6.1.25/jetty-util-6.1.25.pom (3.9 kB at 65 kB/s)
#11 34.50 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/servlet-api/2.5-20081211/servlet-api-2.5-20081211.pom
#11 34.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/servlet-api/2.5-20081211/servlet-api-2.5-20081211.pom (2.7 kB at 46 kB/s)
#11 34.56 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty-parent/7/jetty-parent-7.pom
#11 34.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty-parent/7/jetty-parent-7.pom (13 kB at 229 kB/s)
#11 34.62 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.5/commons-lang-2.5.pom
#11 34.68 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.5/commons-lang-2.5.pom (17 kB at 276 kB/s)
#11 34.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/12/commons-parent-12.pom
#11 34.74 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/12/commons-parent-12.pom (27 kB at 472 kB/s)
#11 34.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-exec/1.1/maven-reporting-exec-1.1.jar
#11 34.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar
#11 34.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar
#11 34.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.3/maven-shared-utils-0.3.jar
#11 34.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.jar
#11 34.80 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar (11 kB at 223 kB/s)
#11 34.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.jar
#11 34.81 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar (52 kB at 851 kB/s)
#11 34.81 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar
#11 34.82 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-exec/1.1/maven-reporting-exec-1.1.jar (26 kB at 370 kB/s)
#11 34.82 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.jar (32 kB at 462 kB/s)
#11 34.82 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.jar
#11 34.82 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar
#11 34.82 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.3/maven-shared-utils-0.3.jar (155 kB at 2.1 MB/s)
#11 34.82 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar
#11 34.84 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.jar (4.2 kB at 46 kB/s)
#11 34.84 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar
#11 34.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar (30 kB at 231 kB/s)
#11 34.88 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar
#11 34.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar (108 kB at 794 kB/s)
#11 34.88 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar
#11 34.92 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.jar (134 kB at 777 kB/s)
#11 34.92 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar
#11 34.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar (51 kB at 272 kB/s)
#11 34.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar
#11 34.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar (148 kB at 771 kB/s)
#11 34.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar
#11 34.96 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar (106 kB at 511 kB/s)
#11 34.96 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar
#11 34.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar (14 kB at 58 kB/s)
#11 34.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar
#11 35.01 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar (74 kB at 285 kB/s)
#11 35.01 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.jar
#11 35.07 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar (153 kB at 471 kB/s)
#11 35.07 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar
#11 35.11 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar (202 kB at 565 kB/s)
#11 35.11 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar
#11 35.12 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.jar (61 kB at 166 kB/s)
#11 35.12 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar
#11 35.16 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar (46 kB at 111 kB/s)
#11 35.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar
#11 35.16 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar (527 kB at 1.3 MB/s)
#11 35.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar
#11 35.17 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar (29 kB at 68 kB/s)
#11 35.17 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.jar
#11 35.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar (13 kB at 31 kB/s)
#11 35.18 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar
#11 35.20 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar (472 kB at 1.0 MB/s)
#11 35.20 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.4.2/maven-archiver-2.4.2.jar
#11 35.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar (165 kB at 339 kB/s)
#11 35.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.4/doxia-sink-api-1.4.jar
#11 35.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.jar (47 kB at 96 kB/s)
#11 35.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.4/doxia-logging-api-1.4.jar
#11 35.24 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar (38 kB at 77 kB/s)
#11 35.24 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-30/plexus-container-default-1.0-alpha-30.jar
#11 35.24 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar (49 kB at 100 kB/s)
#11 35.24 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.jar
#11 35.27 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.4.2/maven-archiver-2.4.2.jar (20 kB at 39 kB/s)
#11 35.27 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.4/doxia-core-1.4.jar
#11 35.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.4/doxia-logging-api-1.4.jar (11 kB at 21 kB/s)
#11 35.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/xerces/xercesImpl/2.9.1/xercesImpl-2.9.1.jar
#11 35.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.4/doxia-sink-api-1.4.jar (11 kB at 21 kB/s)
#11 35.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.3.04/xml-apis-1.3.04.jar
#11 35.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.jar (121 kB at 215 kB/s)
#11 35.31 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.0.2/httpclient-4.0.2.jar
#11 35.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.3.04/xml-apis-1.3.04.jar (194 kB at 292 kB/s)
#11 35.41 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.1.1/commons-logging-1.1.1.jar
#11 35.42 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.4/doxia-core-1.4.jar (165 kB at 245 kB/s)
#11 35.42 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.3/commons-codec-1.3.jar
#11 35.44 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-30/plexus-container-default-1.0-alpha-30.jar (237 kB at 345 kB/s)
#11 35.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.0.1/httpcore-4.0.1.jar
#11 35.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.0.2/httpclient-4.0.2.jar (293 kB at 401 kB/s)
#11 35.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.4/doxia-module-xhtml-1.4.jar
#11 35.49 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.1.1/commons-logging-1.1.1.jar (61 kB at 82 kB/s)
#11 35.49 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-apt/1.4/doxia-module-apt-1.4.jar
#11 35.51 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.3/commons-codec-1.3.jar (47 kB at 61 kB/s)
#11 35.51 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xdoc/1.4/doxia-module-xdoc-1.4.jar
#11 35.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.4/doxia-module-xhtml-1.4.jar (15 kB at 19 kB/s)
#11 35.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-apt/1.4/doxia-module-apt-1.4.jar (52 kB at 64 kB/s)
#11 35.56 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-fml/1.4/doxia-module-fml-1.4.jar
#11 35.56 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-markdown/1.4/doxia-module-markdown-1.4.jar
#11 35.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.0.1/httpcore-4.0.1.jar (173 kB at 212 kB/s)
#11 35.56 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/pegdown/pegdown/1.2.1/pegdown-1.2.1.jar
#11 35.58 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xdoc/1.4/doxia-module-xdoc-1.4.jar (37 kB at 44 kB/s)
#11 35.58 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/parboiled/parboiled-java/1.1.4/parboiled-java-1.1.4.jar
#11 35.61 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-markdown/1.4/doxia-module-markdown-1.4.jar (12 kB at 14 kB/s)
#11 35.61 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/parboiled/parboiled-core/1.1.4/parboiled-core-1.1.4.jar
#11 35.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/pegdown/pegdown/1.2.1/pegdown-1.2.1.jar (59 kB at 67 kB/s)
#11 35.62 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/4.1/asm-4.1.jar
#11 35.63 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-fml/1.4/doxia-module-fml-1.4.jar (38 kB at 43 kB/s)
#11 35.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/4.1/asm-tree-4.1.jar
#11 35.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/parboiled/parboiled-java/1.1.4/parboiled-java-1.1.4.jar (73 kB at 82 kB/s)
#11 35.64 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/4.1/asm-analysis-4.1.jar
#11 35.70 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/parboiled/parboiled-core/1.1.4/parboiled-core-1.1.4.jar (185 kB at 195 kB/s)
#11 35.70 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-util/4.1/asm-util-4.1.jar
#11 35.70 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/4.1/asm-4.1.jar (47 kB at 50 kB/s)
#11 35.70 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/servlet/servlet-api/2.5/servlet-api-2.5.jar
#11 35.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/4.1/asm-tree-4.1.jar (22 kB at 23 kB/s)
#11 35.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.4/doxia-decoration-model-1.4.jar
#11 35.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/4.1/asm-analysis-4.1.jar (20 kB at 21 kB/s)
#11 35.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.4/doxia-site-renderer-1.4.jar
#11 35.77 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-util/4.1/asm-util-4.1.jar (38 kB at 37 kB/s)
#11 35.77 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-tools/2.0/velocity-tools-2.0.jar
#11 35.78 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.4/doxia-site-renderer-1.4.jar (53 kB at 51 kB/s)
#11 35.78 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.7.0/commons-beanutils-1.7.0.jar
#11 35.80 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/servlet/servlet-api/2.5/servlet-api-2.5.jar (105 kB at 100 kB/s)
#11 35.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.8/commons-digester-1.8.jar
#11 35.80 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.4/doxia-decoration-model-1.4.jar (61 kB at 58 kB/s)
#11 35.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-chain/commons-chain/1.1/commons-chain-1.1.jar
#11 35.80 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/xerces/xercesImpl/2.9.1/xercesImpl-2.9.1.jar (1.2 MB at 1.2 MB/s)
#11 35.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-validator/commons-validator/1.3.1/commons-validator-1.3.1.jar
#11 35.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-tools/2.0/velocity-tools-2.0.jar (347 kB at 293 kB/s)
#11 35.93 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/dom4j/dom4j/1.1/dom4j-1.1.jar
#11 35.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.7.0/commons-beanutils-1.7.0.jar (189 kB at 159 kB/s)
#11 35.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/sslext/sslext/1.2-0/sslext-1.2-0.jar
#11 35.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-validator/commons-validator/1.3.1/commons-validator-1.3.1.jar (139 kB at 116 kB/s)
#11 35.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-chain/commons-chain/1.1/commons-chain-1.1.jar (90 kB at 75 kB/s)
#11 35.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/antlr/antlr/2.7.2/antlr-2.7.2.jar
#11 35.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-core/1.3.8/struts-core-1.3.8.jar
#11 35.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.8/commons-digester-1.8.jar (144 kB at 119 kB/s)
#11 35.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-taglib/1.3.8/struts-taglib-1.3.8.jar
#11 35.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/sslext/sslext/1.2-0/sslext-1.2-0.jar (26 kB at 21 kB/s)
#11 35.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-tiles/1.3.8/struts-tiles-1.3.8.jar
#11 36.13 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-taglib/1.3.8/struts-taglib-1.3.8.jar (252 kB at 182 kB/s)
#11 36.13 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar
#11 36.17 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-tiles/1.3.8/struts-tiles-1.3.8.jar (120 kB at 84 kB/s)
#11 36.17 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.5/doxia-integration-tools-1.5.jar
#11 36.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/antlr/antlr/2.7.2/antlr-2.7.2.jar (358 kB at 242 kB/s)
#11 36.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0/wagon-provider-api-1.0.jar
#11 36.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/struts/struts-core/1.3.8/struts-core-1.3.8.jar (329 kB at 220 kB/s)
#11 36.25 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/1.0/plexus-archiver-1.0.jar
#11 36.26 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/dom4j/dom4j/1.1/dom4j-1.1.jar (457 kB at 303 kB/s)
#11 36.26 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/1.0/plexus-io-1.0.jar
#11 36.30 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.5/doxia-integration-tools-1.5.jar (45 kB at 29 kB/s)
#11 36.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.0-beta-7/plexus-i18n-1.0-beta-7.jar
#11 36.32 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar (575 kB at 365 kB/s)
#11 36.32 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.5/velocity-1.5.jar
#11 36.33 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0/wagon-provider-api-1.0.jar (53 kB at 34 kB/s)
#11 36.33 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/oro/oro/2.0.8/oro-2.0.8.jar
#11 36.34 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/1.0/plexus-io-1.0.jar (51 kB at 32 kB/s)
#11 36.34 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.1.8/plexus-velocity-1.1.8.jar
#11 36.36 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.0-beta-7/plexus-i18n-1.0-beta-7.jar (11 kB at 6.5 kB/s)
#11 36.36 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.10/plexus-utils-1.5.10.jar
#11 36.37 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/1.0/plexus-archiver-1.0.jar (177 kB at 109 kB/s)
#11 36.37 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty/6.1.25/jetty-6.1.25.jar
#11 36.40 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.1.8/plexus-velocity-1.1.8.jar (7.9 kB at 4.8 kB/s)
#11 36.40 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/servlet-api/2.5-20081211/servlet-api-2.5-20081211.jar
#11 36.42 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/oro/oro/2.0.8/oro-2.0.8.jar (65 kB at 39 kB/s)
#11 36.42 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty-util/6.1.25/jetty-util-6.1.25.jar
#11 36.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.5/velocity-1.5.jar (392 kB at 230 kB/s)
#11 36.45 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.5/commons-lang-2.5.jar
#11 36.55 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/servlet-api/2.5-20081211/servlet-api-2.5-20081211.jar (134 kB at 74 kB/s)
#11 36.55 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/1.4/commons-io-1.4.jar
#11 36.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty-util/6.1.25/jetty-util-6.1.25.jar (177 kB at 98 kB/s)
#11 36.61 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.10/plexus-utils-1.5.10.jar (281 kB at 150 kB/s)
#11 36.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.5/commons-lang-2.5.jar (279 kB at 148 kB/s)
#11 36.65 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/1.4/commons-io-1.4.jar (109 kB at 57 kB/s)
#11 36.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mortbay/jetty/jetty/6.1.25/jetty-6.1.25.jar (539 kB at 271 kB/s)
#11 36.75 [INFO]       maven-site-plugin-3.3.jar
#11 36.75 [INFO]       maven-reporting-exec-1.1.jar
#11 36.75 [INFO]       maven-reporting-api-3.0.jar
#11 36.75 [INFO]       maven-artifact-3.0.jar
#11 36.75 [INFO]       maven-shared-utils-0.3.jar
#11 36.75 [INFO]       jsr305-2.0.1.jar
#11 36.75 [INFO]       plexus-component-annotations-1.5.5.jar
#11 36.75 [INFO]       aether-util-1.7.jar
#11 36.75 [INFO]       aether-util-0.9.0.M2.jar
#11 36.75 [INFO]       maven-core-3.0.jar
#11 36.75 [INFO]       maven-repository-metadata-3.0.jar
#11 36.75 [INFO]       maven-model-builder-3.0.jar
#11 36.75 [INFO]       maven-aether-provider-3.0.jar
#11 36.75 [INFO]       aether-impl-1.7.jar
#11 36.75 [INFO]       aether-spi-1.7.jar
#11 36.75 [INFO]       aether-api-1.7.jar
#11 36.75 [INFO]       sisu-inject-plexus-1.4.2.jar
#11 36.75 [INFO]       sisu-inject-bean-1.4.2.jar
#11 36.75 [INFO]       sisu-guice-2.1.7-noaop.jar
#11 36.75 [INFO]       plexus-interpolation-1.14.jar
#11 36.75 [INFO]       plexus-classworlds-2.2.3.jar
#11 36.75 [INFO]       plexus-sec-dispatcher-1.3.jar
#11 36.75 [INFO]       plexus-cipher-1.4.jar
#11 36.75 [INFO]       maven-model-3.0.jar
#11 36.75 [INFO]       maven-plugin-api-3.0.jar
#11 36.75 [INFO]       maven-settings-3.0.jar
#11 36.75 [INFO]       maven-settings-builder-3.0.jar
#11 36.75 [INFO]       maven-archiver-2.4.2.jar
#11 36.75 [INFO]       doxia-sink-api-1.4.jar
#11 36.75 [INFO]       doxia-logging-api-1.4.jar
#11 36.75 [INFO]       plexus-container-default-1.0-alpha-30.jar
#11 36.75 [INFO]       junit-3.8.1.jar
#11 36.75 [INFO]       doxia-core-1.4.jar
#11 36.75 [INFO]       xercesImpl-2.9.1.jar
#11 36.75 [INFO]       xml-apis-1.3.04.jar
#11 36.75 [INFO]       httpclient-4.0.2.jar
#11 36.75 [INFO]       commons-logging-1.1.1.jar
#11 36.75 [INFO]       commons-codec-1.3.jar
#11 36.75 [INFO]       httpcore-4.0.1.jar
#11 36.75 [INFO]       doxia-module-xhtml-1.4.jar
#11 36.75 [INFO]       doxia-module-apt-1.4.jar
#11 36.75 [INFO]       doxia-module-xdoc-1.4.jar
#11 36.75 [INFO]       doxia-module-fml-1.4.jar
#11 36.75 [INFO]       doxia-module-markdown-1.4.jar
#11 36.75 [INFO]       pegdown-1.2.1.jar
#11 36.75 [INFO]       parboiled-java-1.1.4.jar
#11 36.75 [INFO]       parboiled-core-1.1.4.jar
#11 36.75 [INFO]       asm-4.1.jar
#11 36.75 [INFO]       asm-tree-4.1.jar
#11 36.75 [INFO]       asm-analysis-4.1.jar
#11 36.75 [INFO]       asm-util-4.1.jar
#11 36.75 [INFO]       servlet-api-2.5.jar
#11 36.75 [INFO]       doxia-decoration-model-1.4.jar
#11 36.75 [INFO]       doxia-site-renderer-1.4.jar
#11 36.75 [INFO]       velocity-tools-2.0.jar
#11 36.75 [INFO]       commons-beanutils-1.7.0.jar
#11 36.75 [INFO]       commons-digester-1.8.jar
#11 36.75 [INFO]       commons-chain-1.1.jar
#11 36.75 [INFO]       commons-validator-1.3.1.jar
#11 36.75 [INFO]       dom4j-1.1.jar
#11 36.75 [INFO]       sslext-1.2-0.jar
#11 36.75 [INFO]       struts-core-1.3.8.jar
#11 36.75 [INFO]       antlr-2.7.2.jar
#11 36.75 [INFO]       struts-taglib-1.3.8.jar
#11 36.75 [INFO]       struts-tiles-1.3.8.jar
#11 36.75 [INFO]       commons-collections-3.2.1.jar
#11 36.75 [INFO]       doxia-integration-tools-1.5.jar
#11 36.75 [INFO]       wagon-provider-api-1.0.jar
#11 36.75 [INFO]       plexus-archiver-1.0.jar
#11 36.75 [INFO]       plexus-io-1.0.jar
#11 36.75 [INFO]       plexus-i18n-1.0-beta-7.jar
#11 36.75 [INFO]       velocity-1.5.jar
#11 36.75 [INFO]       oro-2.0.8.jar
#11 36.75 [INFO]       plexus-velocity-1.1.8.jar
#11 36.75 [INFO]       plexus-utils-1.5.10.jar
#11 36.75 [INFO]       jetty-6.1.25.jar
#11 36.75 [INFO]       servlet-api-2.5-20081211.jar
#11 36.75 [INFO]       jetty-util-6.1.25.jar
#11 36.75 [INFO]       commons-lang-2.5.jar
#11 36.75 [INFO]       commons-io-1.4.jar
#11 36.75 [INFO] Resolved plugin: maven-resources-plugin-3.5.0.jar
#11 36.75 [INFO] Resolved plugin dependency:
#11 36.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.5.0/maven-filtering-3.5.0.pom
#11 36.82 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.5.0/maven-filtering-3.5.0.pom (6.2 kB at 97 kB/s)
#11 36.82 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-build-api/1.2.0/plexus-build-api-1.2.0.pom
#11 36.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-build-api/1.2.0/plexus-build-api-1.2.0.pom (4.7 kB at 79 kB/s)
#11 36.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/13/plexus-13.pom
#11 36.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/13/plexus-13.pom (27 kB at 421 kB/s)
#11 36.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.3/junit-bom-5.9.3.pom
#11 37.02 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.3/junit-bom-5.9.3.pom (5.6 kB at 91 kB/s)
#11 37.02 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.6.0/plexus-utils-3.6.0.pom
#11 37.08 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.6.0/plexus-utils-3.6.0.pom (7.6 kB at 117 kB/s)
#11 37.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.29/plexus-interpolation-1.29.pom
#11 37.15 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.29/plexus-interpolation-1.29.pom (4.7 kB at 76 kB/s)
#11 37.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.5.0/maven-filtering-3.5.0.jar
#11 37.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-build-api/1.2.0/plexus-build-api-1.2.0.jar
#11 37.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.29/plexus-interpolation-1.29.jar
#11 37.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.6.0/plexus-utils-3.6.0.jar
#11 37.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-build-api/1.2.0/plexus-build-api-1.2.0.jar (6.6 kB at 103 kB/s)
#11 37.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.5.0/maven-filtering-3.5.0.jar (61 kB at 864 kB/s)
#11 37.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.29/plexus-interpolation-1.29.jar (88 kB at 1.3 MB/s)
#11 37.30 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.6.0/plexus-utils-3.6.0.jar (272 kB at 1.9 MB/s)
#11 37.30 [INFO]       maven-resources-plugin-3.5.0.jar
#11 37.30 [INFO]       maven-filtering-3.5.0.jar
#11 37.30 [INFO]       slf4j-api-1.7.36.jar
#11 37.30 [INFO]       plexus-build-api-1.2.0.jar
#11 37.30 [INFO]       javax.inject-1.jar
#11 37.30 [INFO]       plexus-build-api-0.0.7.jar
#11 37.30 [INFO]       org.eclipse.sisu.plexus-0.9.0.M4.jar
#11 37.30 [INFO]       plexus-interpolation-1.29.jar
#11 37.30 [INFO]       plexus-utils-3.6.0.jar
#11 37.30 [INFO] Resolved plugin: spring-boot-maven-plugin-4.1.0.jar
#11 37.30 [INFO] Resolved plugin dependency:
#11 37.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/4.1.0/spring-boot-buildpack-platform-4.1.0.pom
#11 37.35 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/4.1.0/spring-boot-buildpack-platform-4.1.0.pom (3.0 kB at 65 kB/s)
#11 37.35 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.17.0/jna-platform-5.17.0.pom
#11 37.40 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.17.0/jna-platform-5.17.0.pom (2.3 kB at 48 kB/s)
#11 37.40 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.17.0/jna-5.17.0.pom
#11 37.44 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.17.0/jna-5.17.0.pom (2.0 kB at 45 kB/s)
#11 37.45 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.27.1/commons-compress-1.27.1.pom
#11 37.49 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.27.1/commons-compress-1.27.1.pom (23 kB at 490 kB/s)
#11 37.50 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/72/commons-parent-72.pom
#11 37.55 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/72/commons-parent-72.pom (78 kB at 1.4 MB/s)
#11 37.56 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.11.0-M2/junit-bom-5.11.0-M2.pom
#11 37.61 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.11.0-M2/junit-bom-5.11.0-M2.pom (5.7 kB at 116 kB/s)
#11 37.61 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.17.1/commons-codec-1.17.1.pom
#11 37.65 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.17.1/commons-codec-1.17.1.pom (18 kB at 395 kB/s)
#11 37.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/71/commons-parent-71.pom
#11 37.70 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/71/commons-parent-71.pom (78 kB at 1.6 MB/s)
#11 37.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.16.0/commons-lang3-3.16.0.pom
#11 37.75 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.16.0/commons-lang3-3.16.0.pom (31 kB at 680 kB/s)
#11 37.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5/5.6.1/httpclient5-5.6.1.pom
#11 37.81 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5/5.6.1/httpclient5-5.6.1.pom (6.7 kB at 132 kB/s)
#11 37.81 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5-parent/5.6.1/httpclient5-parent-5.6.1.pom
#11 37.86 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5-parent/5.6.1/httpclient5-parent-5.6.1.pom (20 kB at 381 kB/s)
#11 37.86 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-parent/14/httpcomponents-parent-14.pom
#11 37.92 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-parent/14/httpcomponents-parent-14.pom (30 kB at 573 kB/s)
#11 37.92 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/27/apache-27.pom
#11 37.97 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/27/apache-27.pom (20 kB at 399 kB/s)
#11 37.97 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.13.3/junit-bom-5.13.3.pom
#11 38.02 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.13.3/junit-bom-5.13.3.pom (5.7 kB at 129 kB/s)
#11 38.02 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/opentelemetry/opentelemetry-bom/1.49.0/opentelemetry-bom-1.49.0.pom
#11 38.06 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/opentelemetry/opentelemetry-bom/1.49.0/opentelemetry-bom-1.49.0.pom (5.9 kB at 130 kB/s)
#11 38.06 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/5.4/httpcore5-5.4.pom
#11 38.11 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/5.4/httpcore5-5.4.pom (3.9 kB at 86 kB/s)
#11 38.11 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-parent/5.4/httpcore5-parent-5.4.pom
#11 38.15 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-parent/5.4/httpcore5-parent-5.4.pom (15 kB at 355 kB/s)
#11 38.15 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-h2/5.4/httpcore5-h2-5.4.pom
#11 38.20 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-h2/5.4/httpcore5-h2-5.4.pom (3.6 kB at 79 kB/s)
#11 38.21 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/7.0.8/spring-core-7.0.8.pom
#11 38.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/7.0.8/spring-core-7.0.8.pom (2.2 kB at 47 kB/s)
#11 38.26 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.3.5/commons-logging-1.3.5.pom
#11 38.30 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.3.5/commons-logging-1.3.5.pom (32 kB at 685 kB/s)
#11 38.31 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jspecify/jspecify/1.0.0/jspecify-1.0.0.pom
#11 38.36 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jspecify/jspecify/1.0.0/jspecify-1.0.0.pom (1.5 kB at 31 kB/s)
#11 38.36 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/tomlj/tomlj/1.0.0/tomlj-1.0.0.pom
#11 38.40 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/tomlj/tomlj/1.0.0/tomlj-1.0.0.pom (2.8 kB at 66 kB/s)
#11 38.40 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.7.2/antlr4-runtime-4.7.2.pom
#11 38.44 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.7.2/antlr4-runtime-4.7.2.pom (3.6 kB at 88 kB/s)
#11 38.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.7.2/antlr4-master-4.7.2.pom
#11 38.49 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.7.2/antlr4-master-4.7.2.pom (4.4 kB at 86 kB/s)
#11 38.49 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.pom
#11 38.54 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.pom (4.3 kB at 95 kB/s)
#11 38.54 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/tools/jackson/core/jackson-databind/3.1.4/jackson-databind-3.1.4.pom
#11 38.59 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/tools/jackson/core/jackson-databind/3.1.4/jackson-databind-3.1.4.pom (18 kB at 376 kB/s)
#11 38.59 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/tools/jackson/jackson-base/3.1.4/jackson-base-3.1.4.pom
#11 38.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/tools/jackson/jackson-base/3.1.4/jackson-base-3.1.4.pom (16 kB at 335 kB/s)
#11 38.64 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.21/jackson-annotations-2.21.pom
#11 38.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.21/jackson-annotations-2.21.pom (7.4 kB at 151 kB/s)
#11 38.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/tools/jackson/core/jackson-core/3.1.4/jackson-core-3.1.4.pom
#11 38.74 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/tools/jackson/core/jackson-core/3.1.4/jackson-core-3.1.4.pom (11 kB at 247 kB/s)
#11 38.74 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/4.1.0/spring-boot-loader-tools-4.1.0.pom
#11 38.79 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/4.1.0/spring-boot-loader-tools-4.1.0.pom (2.2 kB at 51 kB/s)
#11 38.79 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/7.0.8/spring-context-7.0.8.pom
#11 38.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/7.0.8/spring-context-7.0.8.pom (2.8 kB at 62 kB/s)
#11 38.83 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/7.0.8/spring-aop-7.0.8.pom
#11 38.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/7.0.8/spring-aop-7.0.8.pom (2.2 kB at 53 kB/s)
#11 38.88 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/7.0.8/spring-beans-7.0.8.pom
#11 38.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/7.0.8/spring-beans-7.0.8.pom (2.0 kB at 44 kB/s)
#11 38.93 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/7.0.8/spring-expression-7.0.8.pom
#11 38.97 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/7.0.8/spring-expression-7.0.8.pom (2.1 kB at 45 kB/s)
#11 38.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.16.6/micrometer-observation-1.16.6.pom
#11 39.02 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.16.6/micrometer-observation-1.16.6.pom (3.8 kB at 83 kB/s)
#11 39.02 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.16.6/micrometer-commons-1.16.6.pom
#11 39.07 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.16.6/micrometer-commons-1.16.6.pom (3.6 kB at 70 kB/s)
#11 39.08 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.6.0/maven-shade-plugin-3.6.0.pom
#11 39.13 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.6.0/maven-shade-plugin-3.6.0.pom (12 kB at 228 kB/s)
#11 39.13 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/42/maven-plugins-42.pom
#11 39.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/42/maven-plugins-42.pom (7.7 kB at 160 kB/s)
#11 39.18 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom
#11 39.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom (8.8 kB at 175 kB/s)
#11 39.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom
#11 39.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom (25 kB at 518 kB/s)
#11 39.29 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7/asm-9.7.pom
#11 39.33 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7/asm-9.7.pom (2.4 kB at 49 kB/s)
#11 39.34 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.pom
#11 39.38 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.pom (2.8 kB at 63 kB/s)
#11 39.38 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.pom
#11 39.43 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.pom (2.6 kB at 56 kB/s)
#11 39.43 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.pom
#11 39.47 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.pom (4.6 kB at 105 kB/s)
#11 39.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.2/commons-compress-1.26.2.pom
#11 39.52 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.2/commons-compress-1.26.2.pom (23 kB at 478 kB/s)
#11 39.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.17.0/commons-codec-1.17.0.pom
#11 39.58 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.17.0/commons-codec-1.17.0.pom (18 kB at 344 kB/s)
#11 39.58 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.10/jdependency-2.10.pom
#11 39.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.10/jdependency-2.10.pom (14 kB at 275 kB/s)
#11 39.64 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/4.1.0/spring-boot-buildpack-platform-4.1.0.jar
#11 39.64 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.17.0/jna-platform-5.17.0.jar
#11 39.64 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.17.0/jna-5.17.0.jar
#11 39.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.27.1/commons-compress-1.27.1.jar
#11 39.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.17.1/commons-codec-1.17.1.jar
#11 39.85 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.17.1/commons-codec-1.17.1.jar (373 kB at 1.8 MB/s)
#11 39.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.16.0/commons-lang3-3.16.0.jar
#11 39.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/4.1.0/spring-boot-buildpack-platform-4.1.0.jar (333 kB at 990 kB/s)
#11 39.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5/5.6.1/httpclient5-5.6.1.jar
#11 40.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.16.0/commons-lang3-3.16.0.jar (674 kB at 1.2 MB/s)
#11 40.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/5.4/httpcore5-5.4.jar
#11 40.55 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.27.1/commons-compress-1.27.1.jar (1.1 MB at 1.2 MB/s)
#11 40.55 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-h2/5.4/httpcore5-h2-5.4.jar
#11 40.81 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/5.4/httpcore5-5.4.jar (953 kB at 817 kB/s)
#11 40.81 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/tomlj/tomlj/1.0.0/tomlj-1.0.0.jar
#11 40.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5/5.6.1/httpclient5-5.6.1.jar (1.1 MB at 892 kB/s)
#11 40.83 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.7.2/antlr4-runtime-4.7.2.jar
#11 40.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-h2/5.4/httpcore5-h2-5.4.jar (263 kB at 222 kB/s)
#11 40.83 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar
#11 40.89 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar (20 kB at 16 kB/s)
#11 40.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/tools/jackson/core/jackson-databind/3.1.4/jackson-databind-3.1.4.jar
#11 40.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/tomlj/tomlj/1.0.0/tomlj-1.0.0.jar (157 kB at 122 kB/s)
#11 40.93 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.21/jackson-annotations-2.21.jar
#11 41.00 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.17.0/jna-platform-5.17.0.jar (1.4 MB at 1.0 MB/s)
#11 41.00 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/tools/jackson/core/jackson-core/3.1.4/jackson-core-3.1.4.jar
#11 41.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.21/jackson-annotations-2.21.jar (82 kB at 59 kB/s)
#11 41.04 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/4.1.0/spring-boot-loader-tools-4.1.0.jar
#11 41.06 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.7.2/antlr4-runtime-4.7.2.jar (338 kB at 239 kB/s)
#11 41.06 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/7.0.8/spring-core-7.0.8.jar
#11 41.34 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.17.0/jna-5.17.0.jar (2.0 MB at 1.2 MB/s)
#11 41.34 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.3.5/commons-logging-1.3.5.jar
#11 41.39 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/4.1.0/spring-boot-loader-tools-4.1.0.jar (342 kB at 196 kB/s)
#11 41.39 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jspecify/jspecify/1.0.0/jspecify-1.0.0.jar
#11 41.46 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.3.5/commons-logging-1.3.5.jar (74 kB at 41 kB/s)
#11 41.46 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/7.0.8/spring-context-7.0.8.jar
#11 41.47 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jspecify/jspecify/1.0.0/jspecify-1.0.0.jar (3.8 kB at 2.1 kB/s)
#11 41.47 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/7.0.8/spring-aop-7.0.8.jar
#11 41.52 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/tools/jackson/core/jackson-core/3.1.4/jackson-core-3.1.4.jar (599 kB at 319 kB/s)
#11 41.52 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/7.0.8/spring-beans-7.0.8.jar
#11 41.97 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/7.0.8/spring-aop-7.0.8.jar (426 kB at 183 kB/s)
#11 41.97 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/7.0.8/spring-expression-7.0.8.jar
#11 42.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/tools/jackson/core/jackson-databind/3.1.4/jackson-databind-3.1.4.jar (1.9 MB at 795 kB/s)
#11 42.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.16.6/micrometer-observation-1.16.6.jar
#11 42.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.16.6/micrometer-observation-1.16.6.jar (84 kB at 33 kB/s)
#11 42.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.16.6/micrometer-commons-1.16.6.jar
#11 42.24 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/7.0.8/spring-beans-7.0.8.jar (928 kB at 358 kB/s)
#11 42.24 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.6.0/maven-shade-plugin-3.6.0.jar
#11 42.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/7.0.8/spring-expression-7.0.8.jar (326 kB at 124 kB/s)
#11 42.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar
#11 42.29 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.16.6/micrometer-commons-1.16.6.jar (52 kB at 20 kB/s)
#11 42.29 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7/asm-9.7.jar
#11 42.44 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.6.0/maven-shade-plugin-3.6.0.jar (150 kB at 54 kB/s)
#11 42.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.jar
#11 42.44 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7/asm-9.7.jar (125 kB at 45 kB/s)
#11 42.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.jar
#11 42.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/7.0.8/spring-core-7.0.8.jar (2.0 MB at 725 kB/s)
#11 42.45 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.jar
#11 42.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar (269 kB at 95 kB/s)
#11 42.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.jar
#11 42.52 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.jar (52 kB at 18 kB/s)
#11 42.52 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.10/jdependency-2.10.jar
#11 42.53 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/7.0.8/spring-context-7.0.8.jar (1.4 MB at 484 kB/s)
#11 42.54 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.jar (73 kB at 25 kB/s)
#11 42.61 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.jar (328 kB at 111 kB/s)
#11 42.72 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.jar (509 kB at 165 kB/s)
#11 42.79 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.10/jdependency-2.10.jar (416 kB at 132 kB/s)
#11 42.79 [INFO]       spring-boot-maven-plugin-4.1.0.jar
#11 42.79 [INFO]       spring-boot-buildpack-platform-4.1.0.jar
#11 42.79 [INFO]       jna-platform-5.17.0.jar
#11 42.79 [INFO]       jna-5.17.0.jar
#11 42.79 [INFO]       commons-compress-1.27.1.jar
#11 42.79 [INFO]       commons-codec-1.17.1.jar
#11 42.79 [INFO]       commons-lang3-3.16.0.jar
#11 42.79 [INFO]       httpclient5-5.6.1.jar
#11 42.79 [INFO]       httpcore5-5.4.jar
#11 42.79 [INFO]       httpcore5-h2-5.4.jar
#11 42.79 [INFO]       tomlj-1.0.0.jar
#11 42.79 [INFO]       antlr4-runtime-4.7.2.jar
#11 42.79 [INFO]       jsr305-3.0.2.jar
#11 42.79 [INFO]       jackson-databind-3.1.4.jar
#11 42.79 [INFO]       jackson-annotations-2.21.jar
#11 42.79 [INFO]       jackson-core-3.1.4.jar
#11 42.79 [INFO]       spring-boot-loader-tools-4.1.0.jar
#11 42.79 [INFO]       maven-common-artifact-filters-3.4.0.jar
#11 42.79 [INFO]       slf4j-api-1.7.36.jar
#11 42.79 [INFO]       maven-resolver-util-1.4.1.jar
#11 42.79 [INFO]       maven-resolver-api-1.4.1.jar
#11 42.79 [INFO]       plexus-build-api-0.0.7.jar
#11 42.79 [INFO]       spring-core-7.0.8.jar
#11 42.79 [INFO]       commons-logging-1.3.5.jar
#11 42.79 [INFO]       jspecify-1.0.0.jar
#11 42.79 [INFO]       spring-context-7.0.8.jar
#11 42.79 [INFO]       spring-aop-7.0.8.jar
#11 42.79 [INFO]       spring-beans-7.0.8.jar
#11 42.79 [INFO]       spring-expression-7.0.8.jar
#11 42.79 [INFO]       micrometer-observation-1.16.6.jar
#11 42.79 [INFO]       micrometer-commons-1.16.6.jar
#11 42.79 [INFO]       maven-shade-plugin-3.6.0.jar
#11 42.79 [INFO]       plexus-utils-3.5.1.jar
#11 42.79 [INFO]       asm-9.7.jar
#11 42.79 [INFO]       asm-commons-9.7.jar
#11 42.79 [INFO]       asm-tree-9.7.jar
#11 42.79 [INFO]       jdom2-2.0.6.1.jar
#11 42.79 [INFO]       commons-io-2.16.1.jar
#11 42.79 [INFO]       jdependency-2.10.jar
#11 42.79 [INFO] Resolved plugin: maven-deploy-plugin-3.1.4.jar
#11 42.79 [INFO] Resolved plugin dependency:
#11 42.79 [INFO]       maven-deploy-plugin-3.1.4.jar
#11 42.79 [INFO]       plexus-utils-4.0.1.jar
#11 42.79 [INFO]       plexus-xml-3.0.1.jar
#11 42.79 [INFO]       maven-resolver-util-1.9.22.jar
#11 42.79 [INFO]       maven-resolver-api-1.9.22.jar
#11 42.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/projectlombok/lombok/1.18.46/lombok-1.18.46.pom
#11 42.86 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/projectlombok/lombok/1.18.46/lombok-1.18.46.pom (1.5 kB at 26 kB/s)
#11 42.86 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/postgresql/postgresql/42.7.11/postgresql-42.7.11.pom
#11 42.92 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/postgresql/postgresql/42.7.11/postgresql-42.7.11.pom (2.4 kB at 39 kB/s)
#11 42.92 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-thymeleaf-test/4.1.0/spring-boot-starter-thymeleaf-test-4.1.0.pom
#11 42.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-thymeleaf-test/4.1.0/spring-boot-starter-thymeleaf-test-4.1.0.pom (2.3 kB at 37 kB/s)
#11 42.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-thymeleaf/4.1.0/spring-boot-starter-thymeleaf-4.1.0.pom
#11 43.05 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-thymeleaf/4.1.0/spring-boot-starter-thymeleaf-4.1.0.pom (2.3 kB at 37 kB/s)
#11 43.05 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/4.1.0/spring-boot-starter-4.1.0.pom
#11 43.11 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/4.1.0/spring-boot-starter-4.1.0.pom (2.7 kB at 42 kB/s)
#11 43.12 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/4.1.0/spring-boot-starter-logging-4.1.0.pom
#11 43.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/4.1.0/spring-boot-starter-logging-4.1.0.pom (2.4 kB at 41 kB/s)
#11 43.18 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.34/logback-classic-1.5.34.pom
#11 43.24 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.34/logback-classic-1.5.34.pom (16 kB at 248 kB/s)
#11 43.25 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-parent/1.5.34/logback-parent-1.5.34.pom
#11 43.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-parent/1.5.34/logback-parent-1.5.34.pom (20 kB at 299 kB/s)
#11 43.32 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.34/logback-core-1.5.34.pom
#11 43.38 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.34/logback-core-1.5.34.pom (9.4 kB at 150 kB/s)
#11 43.38 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.18/slf4j-api-2.0.18.pom
#11 43.44 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.18/slf4j-api-2.0.18.pom (2.8 kB at 46 kB/s)
#11 43.45 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/2.0.18/slf4j-parent-2.0.18.pom
#11 43.51 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/2.0.18/slf4j-parent-2.0.18.pom (13 kB at 216 kB/s)
#11 43.51 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-bom/2.0.18/slf4j-bom-2.0.18.pom
#11 43.57 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-bom/2.0.18/slf4j-bom-2.0.18.pom (7.9 kB at 129 kB/s)
#11 43.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.25.4/log4j-to-slf4j-2.25.4.pom
#11 43.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.25.4/log4j-to-slf4j-2.25.4.pom (5.5 kB at 87 kB/s)
#11 43.64 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j/2.25.4/log4j-2.25.4.pom
#11 43.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j/2.25.4/log4j-2.25.4.pom (41 kB at 610 kB/s)
#11 43.72 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/4.0.27/groovy-bom-4.0.27.pom
#11 43.78 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/4.0.27/groovy-bom-4.0.27.pom (27 kB at 426 kB/s)
#11 43.78 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.19.1/jackson-bom-2.19.1.pom
#11 43.85 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.19.1/jackson-bom-2.19.1.pom (20 kB at 321 kB/s)
#11 43.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.19.2/jackson-parent-2.19.2.pom
#11 43.91 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.19.2/jackson-parent-2.19.2.pom (7.2 kB at 124 kB/s)
#11 43.91 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/68/oss-parent-68.pom
#11 43.97 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/68/oss-parent-68.pom (24 kB at 394 kB/s)
#11 43.97 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakarta.jakartaee-bom/9.1.0/jakarta.jakartaee-bom-9.1.0.pom
#11 44.03 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakarta.jakartaee-bom/9.1.0/jakarta.jakartaee-bom-9.1.0.pom (9.6 kB at 159 kB/s)
#11 44.03 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakartaee-api-parent/9.1.0/jakartaee-api-parent-9.1.0.pom
#11 44.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakartaee-api-parent/9.1.0/jakartaee-api-parent-9.1.0.pom (15 kB at 243 kB/s)
#11 44.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.7/project-1.0.7.pom
#11 44.15 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.7/project-1.0.7.pom (14 kB at 229 kB/s)
#11 44.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.13.2/junit-bom-5.13.2.pom
#11 44.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.13.2/junit-bom-5.13.2.pom (5.7 kB at 98 kB/s)
#11 44.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/4.11.0/mockito-bom-4.11.0.pom
#11 44.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/4.11.0/mockito-bom-4.11.0.pom (3.2 kB at 53 kB/s)
#11 44.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/5.3.39/spring-framework-bom-5.3.39.pom
#11 44.34 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/5.3.39/spring-framework-bom-5.3.39.pom (5.7 kB at 96 kB/s)
#11 44.34 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.25.4/log4j-api-2.25.4.pom
#11 44.40 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.25.4/log4j-api-2.25.4.pom (4.5 kB at 73 kB/s)
#11 44.41 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.18/jul-to-slf4j-2.0.18.pom
#11 44.46 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.18/jul-to-slf4j-2.0.18.pom (1.1 kB at 19 kB/s)
#11 44.47 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/4.1.0/spring-boot-autoconfigure-4.1.0.pom
#11 44.53 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/4.1.0/spring-boot-autoconfigure-4.1.0.pom (2.1 kB at 34 kB/s)
#11 44.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/4.1.0/spring-boot-4.1.0.pom
#11 44.59 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/4.1.0/spring-boot-4.1.0.pom (2.2 kB at 35 kB/s)
#11 44.59 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.3.6/commons-logging-1.3.6.pom
#11 44.66 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.3.6/commons-logging-1.3.6.pom (32 kB at 495 kB/s)
#11 44.66 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/97/commons-parent-97.pom
#11 44.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/97/commons-parent-97.pom (80 kB at 1.2 MB/s)
#11 44.73 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.17.0/micrometer-observation-1.17.0.pom
#11 44.80 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.17.0/micrometer-observation-1.17.0.pom (4.0 kB at 64 kB/s)
#11 44.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.17.0/micrometer-commons-1.17.0.pom
#11 44.86 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.17.0/micrometer-commons-1.17.0.pom (3.7 kB at 63 kB/s)
#11 44.86 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/3.0.0/jakarta.annotation-api-3.0.0.pom
#11 44.92 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/3.0.0/jakarta.annotation-api-3.0.0.pom (15 kB at 248 kB/s)
#11 44.92 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.6/snakeyaml-2.6.pom
#11 44.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.6/snakeyaml-2.6.pom (21 kB at 355 kB/s)
#11 44.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-thymeleaf/4.1.0/spring-boot-thymeleaf-4.1.0.pom
#11 45.05 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-thymeleaf/4.1.0/spring-boot-thymeleaf-4.1.0.pom (2.4 kB at 40 kB/s)
#11 45.05 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf-spring6/3.1.5.RELEASE/thymeleaf-spring6-3.1.5.RELEASE.pom
#11 45.11 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf-spring6/3.1.5.RELEASE/thymeleaf-spring6-3.1.5.RELEASE.pom (4.6 kB at 76 kB/s)
#11 45.11 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf-lib/3.1.5.RELEASE/thymeleaf-lib-3.1.5.RELEASE.pom
#11 45.17 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf-lib/3.1.5.RELEASE/thymeleaf-lib-3.1.5.RELEASE.pom (6.5 kB at 115 kB/s)
#11 45.17 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf-parent/3.1.5.RELEASE/thymeleaf-parent-3.1.5.RELEASE.pom
#11 45.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf-parent/3.1.5.RELEASE/thymeleaf-parent-3.1.5.RELEASE.pom (23 kB at 405 kB/s)
#11 45.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/6.2.17/spring-framework-bom-6.2.17.pom
#11 45.29 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/6.2.17/spring-framework-bom-6.2.17.pom (5.8 kB at 101 kB/s)
#11 45.30 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.18.2/jackson-bom-2.18.2.pom
#11 45.36 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.18.2/jackson-bom-2.18.2.pom (19 kB at 306 kB/s)
#11 45.36 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.18.1/jackson-parent-2.18.1.pom
#11 45.42 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.18.1/jackson-parent-2.18.1.pom (6.7 kB at 106 kB/s)
#11 45.43 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/61/oss-parent-61.pom
#11 45.49 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/61/oss-parent-61.pom (23 kB at 337 kB/s)
#11 45.50 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2024.0.0/reactor-bom-2024.0.0.pom
#11 45.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2024.0.0/reactor-bom-2024.0.0.pom (4.8 kB at 76 kB/s)
#11 45.56 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-bom/2.25.3/log4j-bom-2.25.3.pom
#11 45.63 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-bom/2.25.3/log4j-bom-2.25.3.pom (12 kB at 189 kB/s)
#11 45.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.14.3/junit-bom-5.14.3.pom
#11 45.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.14.3/junit-bom-5.14.3.pom (5.7 kB at 91 kB/s)
#11 45.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf/3.1.5.RELEASE/thymeleaf-3.1.5.RELEASE.pom
#11 45.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf/3.1.5.RELEASE/thymeleaf-3.1.5.RELEASE.pom (4.0 kB at 64 kB/s)
#11 45.76 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/attoparser/attoparser/2.0.7.RELEASE/attoparser-2.0.7.RELEASE.pom
#11 45.82 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/attoparser/attoparser/2.0.7.RELEASE/attoparser-2.0.7.RELEASE.pom (11 kB at 181 kB/s)
#11 45.82 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/unbescape/unbescape/1.1.6.RELEASE/unbescape-1.1.6.RELEASE.pom
#11 45.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/unbescape/unbescape/1.1.6.RELEASE/unbescape-1.1.6.RELEASE.pom (10.0 kB at 166 kB/s)
#11 45.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/7.0.8/spring-web-7.0.8.pom
#11 45.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/7.0.8/spring-web-7.0.8.pom (2.4 kB at 39 kB/s)
#11 45.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/4.1.0/spring-boot-starter-test-4.1.0.pom
#11 46.01 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/4.1.0/spring-boot-starter-test-4.1.0.pom (4.9 kB at 79 kB/s)
#11 46.01 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/4.1.0/spring-boot-test-4.1.0.pom
#11 46.08 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/4.1.0/spring-boot-test-4.1.0.pom (2.2 kB at 36 kB/s)
#11 46.08 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/7.0.8/spring-test-7.0.8.pom
#11 46.14 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/7.0.8/spring-test-7.0.8.pom (2.1 kB at 34 kB/s)
#11 46.14 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/4.1.0/spring-boot-test-autoconfigure-4.1.0.pom
#11 46.20 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/4.1.0/spring-boot-test-autoconfigure-4.1.0.pom (2.1 kB at 36 kB/s)
#11 46.20 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.10.0/json-path-2.10.0.pom
#11 46.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.10.0/json-path-2.10.0.pom (1.9 kB at 34 kB/s)
#11 46.25 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/minidev/json-smart/2.6.0/json-smart-2.6.0.pom
#11 46.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/minidev/json-smart/2.6.0/json-smart-2.6.0.pom (12 kB at 209 kB/s)
#11 46.31 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/minidev/accessors-smart/2.6.0/accessors-smart-2.6.0.pom
#11 46.37 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/minidev/accessors-smart/2.6.0/accessors-smart-2.6.0.pom (14 kB at 227 kB/s)
#11 46.37 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7.1/asm-9.7.1.pom
#11 46.43 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7.1/asm-9.7.1.pom (2.4 kB at 40 kB/s)
#11 46.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.5/jakarta.xml.bind-api-4.0.5.pom
#11 46.50 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.5/jakarta.xml.bind-api-4.0.5.pom (13 kB at 202 kB/s)
#11 46.50 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api-parent/4.0.5/jakarta.xml.bind-api-parent-4.0.5.pom
#11 46.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api-parent/4.0.5/jakarta.xml.bind-api-parent-4.0.5.pom (9.1 kB at 148 kB/s)
#11 46.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/2.1.4/jakarta.activation-api-2.1.4.pom
#11 46.63 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/2.1.4/jakarta.activation-api-2.1.4.pom (19 kB at 294 kB/s)
#11 46.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.27.7/assertj-core-3.27.7.pom
#11 46.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.27.7/assertj-core-3.27.7.pom (3.8 kB at 61 kB/s)
#11 46.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.18.10/byte-buddy-1.18.10.pom
#11 46.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.18.10/byte-buddy-1.18.10.pom (21 kB at 331 kB/s)
#11 46.76 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.18.10/byte-buddy-parent-1.18.10.pom
#11 46.83 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.18.10/byte-buddy-parent-1.18.10.pom (68 kB at 1.0 MB/s)
#11 46.83 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.3.0/awaitility-4.3.0.pom
#11 46.89 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.3.0/awaitility-4.3.0.pom (3.7 kB at 63 kB/s)
#11 46.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility-parent/4.3.0/awaitility-parent-4.3.0.pom
#11 46.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility-parent/4.3.0/awaitility-parent-4.3.0.pom (11 kB at 184 kB/s)
#11 46.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/3.0/hamcrest-3.0.pom
#11 47.01 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/3.0/hamcrest-3.0.pom (1.6 kB at 27 kB/s)
#11 47.01 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/6.0.3/junit-jupiter-6.0.3.pom
#11 47.08 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/6.0.3/junit-jupiter-6.0.3.pom (3.2 kB at 50 kB/s)
#11 47.08 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/6.0.3/junit-jupiter-api-6.0.3.pom
#11 47.14 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/6.0.3/junit-jupiter-api-6.0.3.pom (3.4 kB at 54 kB/s)
#11 47.15 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.pom
#11 47.21 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.pom (2.0 kB at 32 kB/s)
#11 47.21 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/6.0.3/junit-platform-commons-6.0.3.pom
#11 47.27 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/6.0.3/junit-platform-commons-6.0.3.pom (3.0 kB at 47 kB/s)
#11 47.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.pom
#11 47.34 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.pom (1.5 kB at 25 kB/s)
#11 47.34 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/6.0.3/junit-jupiter-params-6.0.3.pom
#11 47.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/6.0.3/junit-jupiter-params-6.0.3.pom (3.2 kB at 50 kB/s)
#11 47.41 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/6.0.3/junit-jupiter-engine-6.0.3.pom
#11 47.47 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/6.0.3/junit-jupiter-engine-6.0.3.pom (3.4 kB at 53 kB/s)
#11 47.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/6.0.3/junit-platform-engine-6.0.3.pom
#11 47.54 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/6.0.3/junit-platform-engine-6.0.3.pom (3.4 kB at 54 kB/s)
#11 47.54 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.23.0/mockito-core-5.23.0.pom
#11 47.60 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.23.0/mockito-core-5.23.0.pom (2.5 kB at 41 kB/s)
#11 47.60 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.18.10/byte-buddy-agent-1.18.10.pom
#11 47.66 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.18.10/byte-buddy-agent-1.18.10.pom (14 kB at 252 kB/s)
#11 47.66 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.pom
#11 47.72 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.pom (3.0 kB at 53 kB/s)
#11 47.72 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/3.3/objenesis-parent-3.3.pom
#11 47.78 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/3.3/objenesis-parent-3.3.pom (19 kB at 330 kB/s)
#11 47.78 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.23.0/mockito-junit-jupiter-5.23.0.pom
#11 47.84 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.23.0/mockito-junit-jupiter-5.23.0.pom (2.3 kB at 37 kB/s)
#11 47.84 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.pom
#11 47.92 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.pom (7.0 kB at 83 kB/s)
#11 47.93 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.pom
#11 47.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.pom (2.8 kB at 44 kB/s)
#11 47.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.11.0/xmlunit-core-2.11.0.pom
#11 48.05 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.11.0/xmlunit-core-2.11.0.pom (2.8 kB at 45 kB/s)
#11 48.06 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-parent/2.11.0/xmlunit-parent-2.11.0.pom
#11 48.12 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-parent/2.11.0/xmlunit-parent-2.11.0.pom (23 kB at 364 kB/s)
#11 48.12 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/4.1.0/spring-boot-starter-data-jpa-4.1.0.pom
#11 48.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/4.1.0/spring-boot-starter-data-jpa-4.1.0.pom (2.7 kB at 45 kB/s)
#11 48.19 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/4.1.0/spring-boot-starter-jdbc-4.1.0.pom
#11 48.25 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/4.1.0/spring-boot-starter-jdbc-4.1.0.pom (2.5 kB at 41 kB/s)
#11 48.26 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jdbc/4.1.0/spring-boot-jdbc-4.1.0.pom
#11 48.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jdbc/4.1.0/spring-boot-jdbc-4.1.0.pom (2.6 kB at 46 kB/s)
#11 48.31 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-sql/4.1.0/spring-boot-sql-4.1.0.pom
#11 48.37 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-sql/4.1.0/spring-boot-sql-4.1.0.pom (2.0 kB at 35 kB/s)
#11 48.37 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-transaction/4.1.0/spring-boot-transaction-4.1.0.pom
#11 48.43 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-transaction/4.1.0/spring-boot-transaction-4.1.0.pom (2.4 kB at 42 kB/s)
#11 48.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-persistence/4.1.0/spring-boot-persistence-4.1.0.pom
#11 48.50 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-persistence/4.1.0/spring-boot-persistence-4.1.0.pom (2.2 kB at 35 kB/s)
#11 48.50 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-tx/7.0.8/spring-tx-7.0.8.pom
#11 48.56 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-tx/7.0.8/spring-tx-7.0.8.pom (2.2 kB at 35 kB/s)
#11 48.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/7.0.8/spring-jdbc-7.0.8.pom
#11 48.63 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/7.0.8/spring-jdbc-7.0.8.pom (2.4 kB at 39 kB/s)
#11 48.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/zaxxer/HikariCP/7.0.2/HikariCP-7.0.2.pom
#11 48.70 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/zaxxer/HikariCP/7.0.2/HikariCP-7.0.2.pom (29 kB at 433 kB/s)
#11 48.70 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-jpa/4.1.0/spring-boot-data-jpa-4.1.0.pom
#11 48.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-jpa/4.1.0/spring-boot-data-jpa-4.1.0.pom (2.6 kB at 44 kB/s)
#11 48.76 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-commons/4.1.0/spring-boot-data-commons-4.1.0.pom
#11 48.82 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-commons/4.1.0/spring-boot-data-commons-4.1.0.pom (2.5 kB at 40 kB/s)
#11 48.82 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/4.1.0/spring-data-commons-4.1.0.pom
#11 48.88 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/4.1.0/spring-data-commons-4.1.0.pom (12 kB at 201 kB/s)
#11 48.89 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-parent/4.1.0/spring-data-parent-4.1.0.pom
#11 48.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-parent/4.1.0/spring-data-parent-4.1.0.pom (49 kB at 772 kB/s)
#11 48.95 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-build/4.1.0/spring-data-build-4.1.0.pom
#11 49.02 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-build/4.1.0/spring-data-build-4.1.0.pom (6.0 kB at 93 kB/s)
#11 49.02 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jmolecules/jmolecules-bom/2025.0.2/jmolecules-bom-2025.0.2.pom
#11 49.08 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jmolecules/jmolecules-bom/2025.0.2/jmolecules-bom-2025.0.2.pom (4.9 kB at 80 kB/s)
#11 49.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-hibernate/4.1.0/spring-boot-hibernate-4.1.0.pom
#11 49.15 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-hibernate/4.1.0/spring-boot-hibernate-4.1.0.pom (2.4 kB at 41 kB/s)
#11 49.15 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jpa/4.1.0/spring-boot-jpa-4.1.0.pom
#11 49.21 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jpa/4.1.0/spring-boot-jpa-4.1.0.pom (2.6 kB at 44 kB/s)
#11 49.21 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/persistence/jakarta.persistence-api/3.2.0/jakarta.persistence-api-3.2.0.pom
#11 49.27 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/persistence/jakarta.persistence-api/3.2.0/jakarta.persistence-api-3.2.0.pom (16 kB at 244 kB/s)
#11 49.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-orm/7.0.8/spring-orm-7.0.8.pom
#11 49.34 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-orm/7.0.8/spring-orm-7.0.8.pom (2.6 kB at 44 kB/s)
#11 49.34 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/orm/hibernate-core/7.4.1.Final/hibernate-core-7.4.1.Final.pom
#11 49.40 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/orm/hibernate-core/7.4.1.Final/hibernate-core-7.4.1.Final.pom (5.6 kB at 89 kB/s)
#11 49.40 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/orm/hibernate-platform/7.4.1.Final/hibernate-platform-7.4.1.Final.pom
#11 49.46 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/orm/hibernate-platform/7.4.1.Final/hibernate-platform-7.4.1.Final.pom (11 kB at 187 kB/s)
#11 49.47 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/transaction/jakarta.transaction-api/2.0.1/jakarta.transaction-api-2.0.1.pom
#11 49.53 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/transaction/jakarta.transaction-api/2.0.1/jakarta.transaction-api-2.0.1.pom (14 kB at 224 kB/s)
#11 49.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.6/project-1.0.6.pom
#11 49.59 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.6/project-1.0.6.pom (13 kB at 226 kB/s)
#11 49.59 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.6.3.Final/jboss-logging-3.6.3.Final.pom
#11 49.66 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.6.3.Final/jboss-logging-3.6.3.Final.pom (23 kB at 360 kB/s)
#11 49.66 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/jboss-parent/52/jboss-parent-52.pom
#11 49.73 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/jboss-parent/52/jboss-parent-52.pom (102 kB at 1.5 MB/s)
#11 49.73 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/models/hibernate-models/1.1.1/hibernate-models-1.1.1.pom
#11 49.79 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/models/hibernate-models/1.1.1/hibernate-models-1.1.1.pom (2.1 kB at 34 kB/s)
#11 49.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-runtime/4.0.9/jaxb-runtime-4.0.9.pom
#11 49.86 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-runtime/4.0.9/jaxb-runtime-4.0.9.pom (11 kB at 171 kB/s)
#11 49.86 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-runtime-parent/4.0.9/jaxb-runtime-parent-4.0.9.pom
#11 49.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-runtime-parent/4.0.9/jaxb-runtime-parent-4.0.9.pom (1.3 kB at 20 kB/s)
#11 49.93 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-parent/4.0.9/jaxb-parent-4.0.9.pom
#11 49.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-parent/4.0.9/jaxb-parent-4.0.9.pom (35 kB at 540 kB/s)
#11 49.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-bom-ext/4.0.9/jaxb-bom-ext-4.0.9.pom
#11 50.06 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-bom-ext/4.0.9/jaxb-bom-ext-4.0.9.pom (3.6 kB at 56 kB/s)
#11 50.06 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-bom/4.0.9/jaxb-bom-4.0.9.pom
#11 50.13 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-bom/4.0.9/jaxb-bom-4.0.9.pom (13 kB at 191 kB/s)
#11 50.13 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/2.0.4/project-2.0.4.pom
#11 50.19 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/2.0.4/project-2.0.4.pom (27 kB at 433 kB/s)
#11 50.19 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-core/4.0.9/jaxb-core-4.0.9.pom
#11 50.26 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-core/4.0.9/jaxb-core-4.0.9.pom (3.8 kB at 63 kB/s)
#11 50.26 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation/2.0.3/angus-activation-2.0.3.pom
#11 50.32 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation/2.0.3/angus-activation-2.0.3.pom (4.0 kB at 65 kB/s)
#11 50.32 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation-project/2.0.3/angus-activation-project-2.0.3.pom
#11 50.38 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation-project/2.0.3/angus-activation-project-2.0.3.pom (21 kB at 360 kB/s)
#11 50.38 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/txw2/4.0.9/txw2-4.0.9.pom
#11 50.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/txw2/4.0.9/txw2-4.0.9.pom (1.9 kB at 30 kB/s)
#11 50.45 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-txw-parent/4.0.9/jaxb-txw-parent-4.0.9.pom
#11 50.51 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-txw-parent/4.0.9/jaxb-txw-parent-4.0.9.pom (1.3 kB at 21 kB/s)
#11 50.51 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons-runtime/4.1.2/istack-commons-runtime-4.1.2.pom
#11 50.57 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons-runtime/4.1.2/istack-commons-runtime-4.1.2.pom (1.6 kB at 27 kB/s)
#11 50.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons/4.1.2/istack-commons-4.1.2.pom
#11 50.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons/4.1.2/istack-commons-4.1.2.pom (26 kB at 399 kB/s)
#11 50.64 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.pom
#11 50.71 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.pom (5.9 kB at 94 kB/s)
#11 50.71 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.13.2/antlr4-runtime-4.13.2.pom
#11 50.77 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.13.2/antlr4-runtime-4.13.2.pom (3.6 kB at 56 kB/s)
#11 50.77 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.13.2/antlr4-master-4.13.2.pom
#11 50.84 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.13.2/antlr4-master-4.13.2.pom (4.8 kB at 80 kB/s)
#11 50.84 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/4.1.0/spring-data-jpa-4.1.0.pom
#11 50.89 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/4.1.0/spring-data-jpa-4.1.0.pom (13 kB at 228 kB/s)
#11 50.90 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa-parent/4.1.0/spring-data-jpa-parent-4.1.0.pom
#11 50.96 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa-parent/4.1.0/spring-data-jpa-parent-4.1.0.pom (5.5 kB at 91 kB/s)
#11 50.96 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aspects/7.0.8/spring-aspects-7.0.8.pom
#11 51.03 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aspects/7.0.8/spring-aspects-7.0.8.pom (2.0 kB at 33 kB/s)
#11 51.03 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.9.25.1/aspectjweaver-1.9.25.1.pom
#11 51.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.9.25.1/aspectjweaver-1.9.25.1.pom (1.7 kB at 27 kB/s)
#11 51.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webmvc-test/4.1.0/spring-boot-starter-webmvc-test-4.1.0.pom
#11 51.15 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webmvc-test/4.1.0/spring-boot-starter-webmvc-test-4.1.0.pom (2.9 kB at 47 kB/s)
#11 51.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jackson-test/4.1.0/spring-boot-starter-jackson-test-4.1.0.pom
#11 51.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jackson-test/4.1.0/spring-boot-starter-jackson-test-4.1.0.pom (2.3 kB at 36 kB/s)
#11 51.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jackson/4.1.0/spring-boot-starter-jackson-4.1.0.pom
#11 51.29 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jackson/4.1.0/spring-boot-starter-jackson-4.1.0.pom (2.3 kB at 37 kB/s)
#11 51.29 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jackson/4.1.0/spring-boot-jackson-4.1.0.pom
#11 51.35 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jackson/4.1.0/spring-boot-jackson-4.1.0.pom (2.2 kB at 36 kB/s)
#11 51.35 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webmvc/4.1.0/spring-boot-starter-webmvc-4.1.0.pom
#11 51.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webmvc/4.1.0/spring-boot-starter-webmvc-4.1.0.pom (2.9 kB at 47 kB/s)
#11 51.42 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/4.1.0/spring-boot-starter-tomcat-4.1.0.pom
#11 51.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/4.1.0/spring-boot-starter-tomcat-4.1.0.pom (2.5 kB at 39 kB/s)
#11 51.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat-runtime/4.1.0/spring-boot-starter-tomcat-runtime-4.1.0.pom
#11 51.54 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat-runtime/4.1.0/spring-boot-starter-tomcat-runtime-4.1.0.pom (3.7 kB at 59 kB/s)
#11 51.55 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-tomcat/4.1.0/spring-boot-tomcat-4.1.0.pom
#11 51.61 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-tomcat/4.1.0/spring-boot-tomcat-4.1.0.pom (2.6 kB at 42 kB/s)
#11 51.61 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-web-server/4.1.0/spring-boot-web-server-4.1.0.pom
#11 51.67 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-web-server/4.1.0/spring-boot-web-server-4.1.0.pom (2.2 kB at 35 kB/s)
#11 51.68 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/11.0.22/tomcat-embed-core-11.0.22.pom
#11 51.74 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/11.0.22/tomcat-embed-core-11.0.22.pom (1.8 kB at 27 kB/s)
#11 51.74 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/11.0.22/tomcat-embed-el-11.0.22.pom
#11 51.81 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/11.0.22/tomcat-embed-el-11.0.22.pom (1.5 kB at 24 kB/s)
#11 51.81 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/11.0.22/tomcat-embed-websocket-11.0.22.pom
#11 51.87 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/11.0.22/tomcat-embed-websocket-11.0.22.pom (1.8 kB at 28 kB/s)
#11 51.88 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-http-converter/4.1.0/spring-boot-http-converter-4.1.0.pom
#11 51.95 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-http-converter/4.1.0/spring-boot-http-converter-4.1.0.pom (2.2 kB at 30 kB/s)
#11 51.96 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-webmvc/4.1.0/spring-boot-webmvc-4.1.0.pom
#11 52.02 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-webmvc/4.1.0/spring-boot-webmvc-4.1.0.pom (2.6 kB at 40 kB/s)
#11 52.02 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-servlet/4.1.0/spring-boot-servlet-4.1.0.pom
#11 52.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-servlet/4.1.0/spring-boot-servlet-4.1.0.pom (2.2 kB at 34 kB/s)
#11 52.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/7.0.8/spring-webmvc-7.0.8.pom
#11 52.15 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/7.0.8/spring-webmvc-7.0.8.pom (3.0 kB at 48 kB/s)
#11 52.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-webmvc-test/4.1.0/spring-boot-webmvc-test-4.1.0.pom
#11 52.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-webmvc-test/4.1.0/spring-boot-webmvc-test-4.1.0.pom (2.7 kB at 45 kB/s)
#11 52.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-resttestclient/4.1.0/spring-boot-resttestclient-4.1.0.pom
#11 52.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-resttestclient/4.1.0/spring-boot-resttestclient-4.1.0.pom (2.4 kB at 40 kB/s)
#11 52.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa-test/4.1.0/spring-boot-starter-data-jpa-test-4.1.0.pom
#11 52.35 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa-test/4.1.0/spring-boot-starter-data-jpa-test-4.1.0.pom (2.7 kB at 43 kB/s)
#11 52.35 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc-test/4.1.0/spring-boot-starter-jdbc-test-4.1.0.pom
#11 52.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc-test/4.1.0/spring-boot-starter-jdbc-test-4.1.0.pom (2.5 kB at 39 kB/s)
#11 52.42 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jdbc-test/4.1.0/spring-boot-jdbc-test-4.1.0.pom
#11 52.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jdbc-test/4.1.0/spring-boot-jdbc-test-4.1.0.pom (2.3 kB at 35 kB/s)
#11 52.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-jpa-test/4.1.0/spring-boot-data-jpa-test-4.1.0.pom
#11 52.55 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-jpa-test/4.1.0/spring-boot-data-jpa-test-4.1.0.pom (2.5 kB at 39 kB/s)
#11 52.55 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jpa-test/4.1.0/spring-boot-jpa-test-4.1.0.pom
#11 52.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jpa-test/4.1.0/spring-boot-jpa-test-4.1.0.pom (2.5 kB at 38 kB/s)
#11 52.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/projectlombok/lombok/1.18.46/lombok-1.18.46.jar
#11 52.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/postgresql/postgresql/42.7.11/postgresql-42.7.11.jar
#11 52.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-thymeleaf-test/4.1.0/spring-boot-starter-thymeleaf-test-4.1.0.jar
#11 52.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/4.1.0/spring-boot-starter-test-4.1.0.jar
#11 52.63 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/4.1.0/spring-boot-test-4.1.0.jar
#11 52.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-thymeleaf-test/4.1.0/spring-boot-starter-thymeleaf-test-4.1.0.jar (4.7 kB at 82 kB/s)
#11 52.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/4.1.0/spring-boot-starter-test-4.1.0.jar (4.8 kB at 83 kB/s)
#11 52.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/4.1.0/spring-boot-test-autoconfigure-4.1.0.jar
#11 52.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.10.0/json-path-2.10.0.jar
#11 52.80 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/4.1.0/spring-boot-test-autoconfigure-4.1.0.jar (28 kB at 163 kB/s)
#11 52.80 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.18/slf4j-api-2.0.18.jar
#11 52.82 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/4.1.0/spring-boot-test-4.1.0.jar (210 kB at 1.1 MB/s)
#11 52.82 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.5/jakarta.xml.bind-api-4.0.5.jar
#11 52.96 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.18/slf4j-api-2.0.18.jar (70 kB at 217 kB/s)
#11 52.96 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/2.1.4/jakarta.activation-api-2.1.4.jar
#11 53.00 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.10.0/json-path-2.10.0.jar (279 kB at 759 kB/s)
#11 53.00 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/minidev/json-smart/2.6.0/json-smart-2.6.0.jar
#11 53.03 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.5/jakarta.xml.bind-api-4.0.5.jar (131 kB at 331 kB/s)
#11 53.03 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/minidev/accessors-smart/2.6.0/accessors-smart-2.6.0.jar
#11 53.10 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/2.1.4/jakarta.activation-api-2.1.4.jar (67 kB at 146 kB/s)
#11 53.10 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7.1/asm-9.7.1.jar
#11 53.15 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/minidev/accessors-smart/2.6.0/accessors-smart-2.6.0.jar (30 kB at 59 kB/s)
#11 53.15 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.27.7/assertj-core-3.27.7.jar
#11 53.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/minidev/json-smart/2.6.0/json-smart-2.6.0.jar (123 kB at 223 kB/s)
#11 53.18 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.18.10/byte-buddy-1.18.10.jar
#11 53.21 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/postgresql/postgresql/42.7.11/postgresql-42.7.11.jar (1.1 MB at 2.0 MB/s)
#11 53.21 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.3.0/awaitility-4.3.0.jar
#11 53.23 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.7.1/asm-9.7.1.jar (126 kB at 211 kB/s)
#11 53.23 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/3.0/hamcrest-3.0.jar
#11 53.39 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.3.0/awaitility-4.3.0.jar (98 kB at 130 kB/s)
#11 53.39 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/6.0.3/junit-jupiter-6.0.3.jar
#11 53.43 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/3.0/hamcrest-3.0.jar (126 kB at 159 kB/s)
#11 53.43 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/6.0.3/junit-jupiter-api-6.0.3.jar
#11 53.50 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/6.0.3/junit-jupiter-6.0.3.jar (6.4 kB at 7.3 kB/s)
#11 53.50 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar
#11 53.57 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/projectlombok/lombok/1.18.46/lombok-1.18.46.jar (2.0 MB at 2.2 MB/s)
#11 53.57 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/6.0.3/junit-platform-commons-6.0.3.jar
#11 53.60 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar (14 kB at 15 kB/s)
#11 53.60 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar
#11 53.64 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/6.0.3/junit-jupiter-api-6.0.3.jar (251 kB at 250 kB/s)
#11 53.64 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/6.0.3/junit-jupiter-params-6.0.3.jar
#11 53.66 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar (6.8 kB at 6.6 kB/s)
#11 53.66 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/6.0.3/junit-jupiter-engine-6.0.3.jar
#11 53.75 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/6.0.3/junit-platform-commons-6.0.3.jar (171 kB at 154 kB/s)
#11 53.75 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/6.0.3/junit-platform-engine-6.0.3.jar
#11 53.91 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/6.0.3/junit-jupiter-params-6.0.3.jar (297 kB at 233 kB/s)
#11 53.91 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.23.0/mockito-core-5.23.0.jar
#11 53.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/6.0.3/junit-platform-engine-6.0.3.jar (280 kB at 208 kB/s)
#11 53.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.18.10/byte-buddy-agent-1.18.10.jar
#11 54.01 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.27.7/assertj-core-3.27.7.jar (1.4 MB at 1.0 MB/s)
#11 54.01 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.jar
#11 54.02 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/6.0.3/junit-jupiter-engine-6.0.3.jar (356 kB at 257 kB/s)
#11 54.02 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.23.0/mockito-junit-jupiter-5.23.0.jar
#11 54.11 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.23.0/mockito-junit-jupiter-5.23.0.jar (9.4 kB at 6.4 kB/s)
#11 54.11 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.jar
#11 54.12 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.jar (49 kB at 33 kB/s)
#11 54.12 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar
#11 54.17 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.18.10/byte-buddy-agent-1.18.10.jar (268 kB at 174 kB/s)
#11 54.17 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.3.6/commons-logging-1.3.6.jar
#11 54.19 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.jar (31 kB at 20 kB/s)
#11 54.19 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/7.0.8/spring-test-7.0.8.jar
#11 54.19 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar (18 kB at 12 kB/s)
#11 54.19 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.11.0/xmlunit-core-2.11.0.jar
#11 54.27 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.3.6/commons-logging-1.3.6.jar (74 kB at 45 kB/s)
#11 54.27 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/4.1.0/spring-boot-starter-data-jpa-4.1.0.jar
#11 54.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.23.0/mockito-core-5.23.0.jar (721 kB at 439 kB/s)
#11 54.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/4.1.0/spring-boot-starter-4.1.0.jar
#11 54.33 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/4.1.0/spring-boot-starter-4.1.0.jar (4.8 kB at 2.8 kB/s)
#11 54.33 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/4.1.0/spring-boot-starter-logging-4.1.0.jar
#11 54.33 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/4.1.0/spring-boot-starter-data-jpa-4.1.0.jar (4.8 kB at 2.8 kB/s)
#11 54.33 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.34/logback-classic-1.5.34.jar
#11 54.34 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.11.0/xmlunit-core-2.11.0.jar (178 kB at 104 kB/s)
#11 54.34 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.34/logback-core-1.5.34.jar
#11 54.38 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/4.1.0/spring-boot-starter-logging-4.1.0.jar (4.7 kB at 2.7 kB/s)
#11 54.38 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.25.4/log4j-to-slf4j-2.25.4.jar
#11 54.50 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.25.4/log4j-to-slf4j-2.25.4.jar (24 kB at 13 kB/s)
#11 54.50 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.25.4/log4j-api-2.25.4.jar
#11 54.60 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.34/logback-classic-1.5.34.jar (287 kB at 146 kB/s)
#11 54.60 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.18/jul-to-slf4j-2.0.18.jar
#11 54.70 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.18/jul-to-slf4j-2.0.18.jar (6.3 kB at 3.1 kB/s)
#11 54.70 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/4.1.0/spring-boot-autoconfigure-4.1.0.jar
#11 54.74 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.34/logback-core-1.5.34.jar (645 kB at 306 kB/s)
#11 54.74 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/3.0.0/jakarta.annotation-api-3.0.0.jar
#11 54.82 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.25.4/log4j-api-2.25.4.jar (351 kB at 160 kB/s)
#11 54.82 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.6/snakeyaml-2.6.jar
#11 54.85 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/3.0.0/jakarta.annotation-api-3.0.0.jar (26 kB at 12 kB/s)
#11 54.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/4.1.0/spring-boot-starter-jdbc-4.1.0.jar
#11 54.93 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/7.0.8/spring-test-7.0.8.jar (1.1 MB at 484 kB/s)
#11 54.93 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/zaxxer/HikariCP/7.0.2/HikariCP-7.0.2.jar
#11 54.94 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/4.1.0/spring-boot-starter-jdbc-4.1.0.jar (4.8 kB at 2.1 kB/s)
#11 54.94 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-jpa/4.1.0/spring-boot-data-jpa-4.1.0.jar
#11 54.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/4.1.0/spring-boot-autoconfigure-4.1.0.jar (373 kB at 158 kB/s)
#11 54.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-commons/4.1.0/spring-boot-data-commons-4.1.0.jar
#11 55.02 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-jpa/4.1.0/spring-boot-data-jpa-4.1.0.jar (14 kB at 5.9 kB/s)
#11 55.02 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-persistence/4.1.0/spring-boot-persistence-4.1.0.jar
#11 55.08 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-commons/4.1.0/spring-boot-data-commons-4.1.0.jar (30 kB at 12 kB/s)
#11 55.08 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/zaxxer/HikariCP/7.0.2/HikariCP-7.0.2.jar (172 kB at 71 kB/s)
#11 55.08 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/4.1.0/spring-data-commons-4.1.0.jar
#11 55.08 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-hibernate/4.1.0/spring-boot-hibernate-4.1.0.jar
#11 55.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-persistence/4.1.0/spring-boot-persistence-4.1.0.jar (16 kB at 6.5 kB/s)
#11 55.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.6/snakeyaml-2.6.jar (340 kB at 139 kB/s)
#11 55.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jpa/4.1.0/spring-boot-jpa-4.1.0.jar
#11 55.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/persistence/jakarta.persistence-api/3.2.0/jakarta.persistence-api-3.2.0.jar
#11 55.14 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-hibernate/4.1.0/spring-boot-hibernate-4.1.0.jar (28 kB at 11 kB/s)
#11 55.14 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/orm/hibernate-core/7.4.1.Final/hibernate-core-7.4.1.Final.jar
#11 55.16 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jpa/4.1.0/spring-boot-jpa-4.1.0.jar (30 kB at 12 kB/s)
#11 55.16 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/transaction/jakarta.transaction-api/2.0.1/jakarta.transaction-api-2.0.1.jar
#11 55.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/persistence/jakarta.persistence-api/3.2.0/jakarta.persistence-api-3.2.0.jar (196 kB at 74 kB/s)
#11 55.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/transaction/jakarta.transaction-api/2.0.1/jakarta.transaction-api-2.0.1.jar (29 kB at 11 kB/s)
#11 55.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.6.3.Final/jboss-logging-3.6.3.Final.jar
#11 55.28 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/models/hibernate-models/1.1.1/hibernate-models-1.1.1.jar
#11 55.44 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.6.3.Final/jboss-logging-3.6.3.Final.jar (63 kB at 22 kB/s)
#11 55.44 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-runtime/4.0.9/jaxb-runtime-4.0.9.jar
#11 55.60 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/models/hibernate-models/1.1.1/hibernate-models-1.1.1.jar (223 kB at 75 kB/s)
#11 55.60 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-core/4.0.9/jaxb-core-4.0.9.jar
#11 55.86 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-core/4.0.9/jaxb-core-4.0.9.jar (139 kB at 43 kB/s)
#11 55.86 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation/2.0.3/angus-activation-2.0.3.jar
#11 55.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation/2.0.3/angus-activation-2.0.3.jar (27 kB at 8.0 kB/s)
#11 55.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/txw2/4.0.9/txw2-4.0.9.jar
#11 56.04 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.18.10/byte-buddy-1.18.10.jar (4.7 MB at 1.4 MB/s)
#11 56.04 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons-runtime/4.1.2/istack-commons-runtime-4.1.2.jar
#11 56.12 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/txw2/4.0.9/txw2-4.0.9.jar (73 kB at 21 kB/s)
#11 56.12 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.jar
#11 56.12 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons-runtime/4.1.2/istack-commons-runtime-4.1.2.jar (26 kB at 7.4 kB/s)
#11 56.12 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-orm/7.0.8/spring-orm-7.0.8.jar
#11 56.18 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.jar (11 kB at 3.0 kB/s)
#11 56.18 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/4.1.0/spring-data-jpa-4.1.0.jar
#11 56.19 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-runtime/4.0.9/jaxb-runtime-4.0.9.jar (922 kB at 259 kB/s)
#11 56.19 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-tx/7.0.8/spring-tx-7.0.8.jar
#11 56.37 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-orm/7.0.8/spring-orm-7.0.8.jar (226 kB at 60 kB/s)
#11 56.37 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.13.2/antlr4-runtime-4.13.2.jar
#11 56.48 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-tx/7.0.8/spring-tx-7.0.8.jar (292 kB at 76 kB/s)
#11 56.48 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aspects/7.0.8/spring-aspects-7.0.8.jar
#11 56.53 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/4.1.0/spring-data-commons-4.1.0.jar (1.8 MB at 455 kB/s)
#11 56.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.9.25.1/aspectjweaver-1.9.25.1.jar
#11 56.58 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aspects/7.0.8/spring-aspects-7.0.8.jar (50 kB at 13 kB/s)
#11 56.58 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jdbc/4.1.0/spring-boot-jdbc-4.1.0.jar
#11 56.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.13.2/antlr4-runtime-4.13.2.jar (326 kB at 80 kB/s)
#11 56.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/4.1.0/spring-boot-4.1.0.jar
#11 56.85 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jdbc/4.1.0/spring-boot-jdbc-4.1.0.jar (205 kB at 49 kB/s)
#11 56.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-sql/4.1.0/spring-boot-sql-4.1.0.jar
#11 56.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-sql/4.1.0/spring-boot-sql-4.1.0.jar (36 kB at 8.3 kB/s)
#11 56.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-transaction/4.1.0/spring-boot-transaction-4.1.0.jar
#11 57.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-transaction/4.1.0/spring-boot-transaction-4.1.0.jar (21 kB at 4.7 kB/s)
#11 57.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/7.0.8/spring-jdbc-7.0.8.jar
#11 57.70 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/7.0.8/spring-jdbc-7.0.8.jar (481 kB at 95 kB/s)
#11 57.70 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webmvc-test/4.1.0/spring-boot-starter-webmvc-test-4.1.0.jar
#11 57.79 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webmvc-test/4.1.0/spring-boot-starter-webmvc-test-4.1.0.jar (4.8 kB at 921 B/s)
#11 57.79 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jackson-test/4.1.0/spring-boot-starter-jackson-test-4.1.0.jar
#11 57.85 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jackson-test/4.1.0/spring-boot-starter-jackson-test-4.1.0.jar (4.7 kB at 908 B/s)
#11 57.85 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-webmvc-test/4.1.0/spring-boot-webmvc-test-4.1.0.jar
#11 57.98 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-webmvc-test/4.1.0/spring-boot-webmvc-test-4.1.0.jar (46 kB at 8.6 kB/s)
#11 57.98 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-web-server/4.1.0/spring-boot-web-server-4.1.0.jar
#11 57.99 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/4.1.0/spring-boot-4.1.0.jar (1.4 MB at 260 kB/s)
#11 57.99 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-resttestclient/4.1.0/spring-boot-resttestclient-4.1.0.jar
#11 58.09 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-resttestclient/4.1.0/spring-boot-resttestclient-4.1.0.jar (34 kB at 6.2 kB/s)
#11 58.09 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/7.0.8/spring-web-7.0.8.jar
#11 58.26 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-web-server/4.1.0/spring-boot-web-server-4.1.0.jar (172 kB at 30 kB/s)
#11 58.26 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.17.0/micrometer-observation-1.17.0.jar
#11 58.41 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/4.1.0/spring-data-jpa-4.1.0.jar (2.2 MB at 377 kB/s)
#11 58.41 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.17.0/micrometer-commons-1.17.0.jar
#11 58.45 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.17.0/micrometer-observation-1.17.0.jar (84 kB at 15 kB/s)
#11 58.45 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa-test/4.1.0/spring-boot-starter-data-jpa-test-4.1.0.jar
#11 58.52 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa-test/4.1.0/spring-boot-starter-data-jpa-test-4.1.0.jar (4.8 kB at 809 B/s)
#11 58.52 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc-test/4.1.0/spring-boot-starter-jdbc-test-4.1.0.jar
#11 58.53 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.17.0/micrometer-commons-1.17.0.jar (52 kB at 8.8 kB/s)
#11 58.53 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jdbc-test/4.1.0/spring-boot-jdbc-test-4.1.0.jar
#11 58.59 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc-test/4.1.0/spring-boot-starter-jdbc-test-4.1.0.jar (4.8 kB at 800 B/s)
#11 58.59 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-jpa-test/4.1.0/spring-boot-data-jpa-test-4.1.0.jar
#11 58.62 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jdbc-test/4.1.0/spring-boot-jdbc-test-4.1.0.jar (21 kB at 3.5 kB/s)
#11 58.62 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jpa-test/4.1.0/spring-boot-jpa-test-4.1.0.jar
#11 58.65 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.9.25.1/aspectjweaver-1.9.25.1.jar (2.2 MB at 364 kB/s)
#11 58.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-thymeleaf/4.1.0/spring-boot-starter-thymeleaf-4.1.0.jar
#11 58.65 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-data-jpa-test/4.1.0/spring-boot-data-jpa-test-4.1.0.jar (9.4 kB at 1.6 kB/s)
#11 58.65 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-thymeleaf/4.1.0/spring-boot-thymeleaf-4.1.0.jar
#11 58.68 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jpa-test/4.1.0/spring-boot-jpa-test-4.1.0.jar (11 kB at 1.8 kB/s)
#11 58.68 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf-spring6/3.1.5.RELEASE/thymeleaf-spring6-3.1.5.RELEASE.jar
#11 58.69 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-thymeleaf/4.1.0/spring-boot-starter-thymeleaf-4.1.0.jar (4.7 kB at 782 B/s)
#11 58.69 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf/3.1.5.RELEASE/thymeleaf-3.1.5.RELEASE.jar
#11 58.72 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-thymeleaf/4.1.0/spring-boot-thymeleaf-4.1.0.jar (31 kB at 5.0 kB/s)
#11 58.72 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/attoparser/attoparser/2.0.7.RELEASE/attoparser-2.0.7.RELEASE.jar
#11 59.02 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf-spring6/3.1.5.RELEASE/thymeleaf-spring6-3.1.5.RELEASE.jar (195 kB at 31 kB/s)
#11 59.02 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/unbescape/unbescape/1.1.6.RELEASE/unbescape-1.1.6.RELEASE.jar
#11 59.10 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/attoparser/attoparser/2.0.7.RELEASE/attoparser-2.0.7.RELEASE.jar (246 kB at 38 kB/s)
#11 59.10 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webmvc/4.1.0/spring-boot-starter-webmvc-4.1.0.jar
#11 59.20 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webmvc/4.1.0/spring-boot-starter-webmvc-4.1.0.jar (4.7 kB at 722 B/s)
#11 59.20 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jackson/4.1.0/spring-boot-starter-jackson-4.1.0.jar
#11 59.29 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jackson/4.1.0/spring-boot-starter-jackson-4.1.0.jar (4.7 kB at 711 B/s)
#11 59.29 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jackson/4.1.0/spring-boot-jackson-4.1.0.jar
#11 59.31 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/unbescape/unbescape/1.1.6.RELEASE/unbescape-1.1.6.RELEASE.jar (174 kB at 26 kB/s)
#11 59.31 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/4.1.0/spring-boot-starter-tomcat-4.1.0.jar
#11 59.40 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/4.1.0/spring-boot-starter-tomcat-4.1.0.jar (4.8 kB at 704 B/s)
#11 59.40 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat-runtime/4.1.0/spring-boot-starter-tomcat-runtime-4.1.0.jar
#11 59.46 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-jackson/4.1.0/spring-boot-jackson-4.1.0.jar (82 kB at 12 kB/s)
#11 59.46 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/11.0.22/tomcat-embed-core-11.0.22.jar
#11 59.49 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat-runtime/4.1.0/spring-boot-starter-tomcat-runtime-4.1.0.jar (4.7 kB at 691 B/s)
#11 59.49 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/11.0.22/tomcat-embed-el-11.0.22.jar
#11 59.79 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/thymeleaf/thymeleaf/3.1.5.RELEASE/thymeleaf-3.1.5.RELEASE.jar (945 kB at 132 kB/s)
#11 59.79 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/11.0.22/tomcat-embed-websocket-11.0.22.jar
#11 59.97 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/11.0.22/tomcat-embed-el-11.0.22.jar (270 kB at 37 kB/s)
#11 59.97 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-tomcat/4.1.0/spring-boot-tomcat-4.1.0.jar
#11 60.10 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/7.0.8/spring-web-7.0.8.jar (2.2 MB at 297 kB/s)
#11 60.10 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-http-converter/4.1.0/spring-boot-http-converter-4.1.0.jar
#11 60.20 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/11.0.22/tomcat-embed-websocket-11.0.22.jar (287 kB at 38 kB/s)
#11 60.20 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-webmvc/4.1.0/spring-boot-webmvc-4.1.0.jar
#11 60.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-tomcat/4.1.0/spring-boot-tomcat-4.1.0.jar (126 kB at 17 kB/s)
#11 60.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-servlet/4.1.0/spring-boot-servlet-4.1.0.jar
#11 60.22 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-http-converter/4.1.0/spring-boot-http-converter-4.1.0.jar (54 kB at 7.2 kB/s)
#11 60.22 [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/7.0.8/spring-webmvc-7.0.8.jar
#11 60.36 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-servlet/4.1.0/spring-boot-servlet-4.1.0.jar (47 kB at 6.1 kB/s)
#11 60.46 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-webmvc/4.1.0/spring-boot-webmvc-4.1.0.jar (175 kB at 22 kB/s)
#11 60.76 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/orm/hibernate-core/7.4.1.Final/hibernate-core-7.4.1.Final.jar (15 MB at 1.9 MB/s)
#11 61.00 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/7.0.8/spring-webmvc-7.0.8.jar (1.1 MB at 132 kB/s)
#11 61.28 [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/11.0.22/tomcat-embed-core-11.0.22.jar (3.6 MB at 416 kB/s)
#11 61.30 [INFO] Resolved dependency: lombok-1.18.46.jar
#11 61.30 [INFO] Resolved dependency: postgresql-42.7.11.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-starter-thymeleaf-test-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-starter-test-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-test-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-test-autoconfigure-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: json-path-2.10.0.jar
#11 61.30 [INFO] Resolved dependency: slf4j-api-2.0.18.jar
#11 61.30 [INFO] Resolved dependency: jakarta.xml.bind-api-4.0.5.jar
#11 61.30 [INFO] Resolved dependency: jakarta.activation-api-2.1.4.jar
#11 61.30 [INFO] Resolved dependency: json-smart-2.6.0.jar
#11 61.30 [INFO] Resolved dependency: accessors-smart-2.6.0.jar
#11 61.30 [INFO] Resolved dependency: asm-9.7.1.jar
#11 61.30 [INFO] Resolved dependency: assertj-core-3.27.7.jar
#11 61.30 [INFO] Resolved dependency: byte-buddy-1.18.10.jar
#11 61.30 [INFO] Resolved dependency: awaitility-4.3.0.jar
#11 61.30 [INFO] Resolved dependency: hamcrest-3.0.jar
#11 61.30 [INFO] Resolved dependency: junit-jupiter-6.0.3.jar
#11 61.30 [INFO] Resolved dependency: junit-jupiter-api-6.0.3.jar
#11 61.30 [INFO] Resolved dependency: opentest4j-1.3.0.jar
#11 61.30 [INFO] Resolved dependency: junit-platform-commons-6.0.3.jar
#11 61.30 [INFO] Resolved dependency: apiguardian-api-1.1.2.jar
#11 61.30 [INFO] Resolved dependency: junit-jupiter-params-6.0.3.jar
#11 61.30 [INFO] Resolved dependency: junit-jupiter-engine-6.0.3.jar
#11 61.30 [INFO] Resolved dependency: junit-platform-engine-6.0.3.jar
#11 61.30 [INFO] Resolved dependency: mockito-core-5.23.0.jar
#11 61.30 [INFO] Resolved dependency: byte-buddy-agent-1.18.10.jar
#11 61.30 [INFO] Resolved dependency: objenesis-3.3.jar
#11 61.30 [INFO] Resolved dependency: mockito-junit-jupiter-5.23.0.jar
#11 61.30 [INFO] Resolved dependency: jsonassert-1.5.3.jar
#11 61.30 [INFO] Resolved dependency: android-json-0.0.20131108.vaadin1.jar
#11 61.30 [INFO] Resolved dependency: spring-core-7.0.8.jar
#11 61.30 [INFO] Resolved dependency: commons-logging-1.3.6.jar
#11 61.30 [INFO] Resolved dependency: jspecify-1.0.0.jar
#11 61.30 [INFO] Resolved dependency: spring-test-7.0.8.jar
#11 61.30 [INFO] Resolved dependency: xmlunit-core-2.11.0.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-starter-data-jpa-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-starter-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-starter-logging-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: logback-classic-1.5.34.jar
#11 61.30 [INFO] Resolved dependency: logback-core-1.5.34.jar
#11 61.30 [INFO] Resolved dependency: log4j-to-slf4j-2.25.4.jar
#11 61.30 [INFO] Resolved dependency: log4j-api-2.25.4.jar
#11 61.30 [INFO] Resolved dependency: jul-to-slf4j-2.0.18.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-autoconfigure-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: jakarta.annotation-api-3.0.0.jar
#11 61.30 [INFO] Resolved dependency: snakeyaml-2.6.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-starter-jdbc-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: HikariCP-7.0.2.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-data-jpa-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-data-commons-4.1.0.jar
#11 61.30 [INFO] Resolved dependency: spring-boot-persistence-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-data-commons-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-hibernate-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-jpa-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: jakarta.persistence-api-3.2.0.jar
#11 61.31 [INFO] Resolved dependency: hibernate-core-7.4.1.Final.jar
#11 61.31 [INFO] Resolved dependency: jakarta.transaction-api-2.0.1.jar
#11 61.31 [INFO] Resolved dependency: jboss-logging-3.6.3.Final.jar
#11 61.31 [INFO] Resolved dependency: hibernate-models-1.1.1.jar
#11 61.31 [INFO] Resolved dependency: jaxb-runtime-4.0.9.jar
#11 61.31 [INFO] Resolved dependency: jaxb-core-4.0.9.jar
#11 61.31 [INFO] Resolved dependency: angus-activation-2.0.3.jar
#11 61.31 [INFO] Resolved dependency: txw2-4.0.9.jar
#11 61.31 [INFO] Resolved dependency: istack-commons-runtime-4.1.2.jar
#11 61.31 [INFO] Resolved dependency: jakarta.inject-api-2.0.1.jar
#11 61.31 [INFO] Resolved dependency: spring-orm-7.0.8.jar
#11 61.31 [INFO] Resolved dependency: spring-data-jpa-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-context-7.0.8.jar
#11 61.31 [INFO] Resolved dependency: spring-aop-7.0.8.jar
#11 61.31 [INFO] Resolved dependency: spring-tx-7.0.8.jar
#11 61.31 [INFO] Resolved dependency: spring-beans-7.0.8.jar
#11 61.31 [INFO] Resolved dependency: antlr4-runtime-4.13.2.jar
#11 61.31 [INFO] Resolved dependency: spring-aspects-7.0.8.jar
#11 61.31 [INFO] Resolved dependency: aspectjweaver-1.9.25.1.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-jdbc-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-sql-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-transaction-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-jdbc-7.0.8.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-starter-webmvc-test-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-starter-jackson-test-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-webmvc-test-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-web-server-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-resttestclient-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-web-7.0.8.jar
#11 61.31 [INFO] Resolved dependency: micrometer-observation-1.17.0.jar
#11 61.31 [INFO] Resolved dependency: micrometer-commons-1.17.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-starter-data-jpa-test-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-starter-jdbc-test-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-jdbc-test-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-data-jpa-test-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-jpa-test-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-starter-thymeleaf-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-thymeleaf-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: thymeleaf-spring6-3.1.5.RELEASE.jar
#11 61.31 [INFO] Resolved dependency: thymeleaf-3.1.5.RELEASE.jar
#11 61.31 [INFO] Resolved dependency: attoparser-2.0.7.RELEASE.jar
#11 61.31 [INFO] Resolved dependency: unbescape-1.1.6.RELEASE.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-starter-webmvc-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-starter-jackson-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-jackson-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: jackson-databind-3.1.4.jar
#11 61.31 [INFO] Resolved dependency: jackson-annotations-2.21.jar
#11 61.31 [INFO] Resolved dependency: jackson-core-3.1.4.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-starter-tomcat-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-starter-tomcat-runtime-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: tomcat-embed-core-11.0.22.jar
#11 61.31 [INFO] Resolved dependency: tomcat-embed-el-11.0.22.jar
#11 61.31 [INFO] Resolved dependency: tomcat-embed-websocket-11.0.22.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-tomcat-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-http-converter-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-webmvc-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-boot-servlet-4.1.0.jar
#11 61.31 [INFO] Resolved dependency: spring-webmvc-7.0.8.jar
#11 61.31 [INFO] Resolved dependency: spring-expression-7.0.8.jar
#11 61.31 [INFO] ------------------------------------------------------------------------
#11 61.31 [INFO] BUILD SUCCESS
#11 61.31 [INFO] ------------------------------------------------------------------------
#11 61.31 [INFO] Total time:  01:00 min
#11 61.31 [INFO] Finished at: 2026-07-16T03:38:38Z
#11 61.31 [INFO] ------------------------------------------------------------------------
#11 DONE 61.4s

#12 [builder 5/6] COPY src ./src
#12 DONE 0.0s

#13 [builder 6/6] RUN mvn clean package -DskipTests
#13 0.439 [INFO] Scanning for projects...
#13 0.518 [INFO] 
#13 0.518 [INFO] -------------------< com.example:UserManagmentPanel >-------------------
#13 0.518 [INFO] Building  0.0.1-SNAPSHOT
#13 0.518 [INFO]   from pom.xml
#13 0.518 [INFO] --------------------------------[ jar ]---------------------------------
#13 0.648 [INFO] 
#13 0.648 [INFO] --- maven-clean-plugin:3.5.0:clean (default-clean) @ UserManagmentPanel ---
#13 0.668 [INFO] 
#13 0.668 [INFO] --- maven-resources-plugin:3.5.0:resources (default-resources) @ UserManagmentPanel ---
#13 0.698 [INFO] Copying 1 resource from src/main/resources to target/classes
#13 0.702 [INFO] Copying 3 resources from src/main/resources to target/classes
#13 0.703 [INFO] 
#13 0.703 [INFO] --- maven-compiler-plugin:3.15.0:compile (default-compile) @ UserManagmentPanel ---
#13 0.762 [INFO] Recompiling the module because of changed source code.
#13 0.765 [INFO] Compiling 19 source files with javac [debug parameters release 17] to target/classes
#13 1.435 [INFO] -------------------------------------------------------------
#13 1.435 [WARNING] COMPILATION WARNING : 
#13 1.435 [INFO] -------------------------------------------------------------
#13 1.435 [WARNING] /app/src/main/java/com/example/UserManagmentPanel/entity/User.java:[35,21] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
#13 1.435 [INFO] 1 warning
#13 1.435 [INFO] -------------------------------------------------------------
#13 1.435 [INFO] -------------------------------------------------------------
#13 1.435 [ERROR] COMPILATION ERROR : 
#13 1.435 [INFO] -------------------------------------------------------------
#13 1.435 [ERROR] /app/src/main/java/com/example/UserManagmentPanel/service/AuthorizationService.java:[36,21] cannot find symbol
#13 1.435   symbol:   method existsByUserIdAndPermissionActionAndScopeScopeKey(java.lang.Long,java.lang.String,java.lang.String)
#13 1.435   location: variable userPermissionRepository of type com.example.UserManagmentPanel.repository.UserPermissionRepository
#13 1.435 [ERROR] /app/src/main/java/com/example/UserManagmentPanel/service/AuthorizationService.java:[87,17] cannot find symbol
#13 1.435   symbol:   method existsByUserIdAndPermissionActionAndScopeScopeKey(java.lang.Long,java.lang.String,java.lang.String)
#13 1.435   location: variable userPermissionRepository of type com.example.UserManagmentPanel.repository.UserPermissionRepository
#13 1.435 [INFO] 2 errors 
#13 1.435 [INFO] -------------------------------------------------------------
#13 1.436 [INFO] ------------------------------------------------------------------------
#13 1.436 [INFO] BUILD FAILURE
#13 1.436 [INFO] ------------------------------------------------------------------------
#13 1.436 [INFO] Total time:  1.002 s
#13 1.437 [INFO] Finished at: 2026-07-16T03:38:40Z
#13 1.437 [INFO] ------------------------------------------------------------------------
#13 1.437 [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.15.0:compile (default-compile) on project UserManagmentPanel: Compilation failure: Compilation failure: 
#13 1.437 [ERROR] /app/src/main/java/com/example/UserManagmentPanel/service/AuthorizationService.java:[36,21] cannot find symbol
#13 1.437 [ERROR]   symbol:   method existsByUserIdAndPermissionActionAndScopeScopeKey(java.lang.Long,java.lang.String,java.lang.String)
#13 1.437 [ERROR]   location: variable userPermissionRepository of type com.example.UserManagmentPanel.repository.UserPermissionRepository
#13 1.437 [ERROR] /app/src/main/java/com/example/UserManagmentPanel/service/AuthorizationService.java:[87,17] cannot find symbol
#13 1.437 [ERROR]   symbol:   method existsByUserIdAndPermissionActionAndScopeScopeKey(java.lang.Long,java.lang.String,java.lang.String)
#13 1.437 [ERROR]   location: variable userPermissionRepository of type com.example.UserManagmentPanel.repository.UserPermissionRepository
#13 1.437 [ERROR] -> [Help 1]
#13 1.437 [ERROR] 
#13 1.438 [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
#13 1.438 [ERROR] Re-run Maven using the -X switch to enable full debug logging.
#13 1.438 [ERROR] 
#13 1.438 [ERROR] For more information about the errors and possible solutions, please read the following articles:
#13 1.438 [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
#13 ERROR: process "/bin/sh -c mvn clean package -DskipTests" did not complete successfully: exit code: 1
------
 > [builder 6/6] RUN mvn clean package -DskipTests:
1.437 [ERROR] /app/src/main/java/com/example/UserManagmentPanel/service/AuthorizationService.java:[87,17] cannot find symbol
1.437 [ERROR]   symbol:   method existsByUserIdAndPermissionActionAndScopeScopeKey(java.lang.Long,java.lang.String,java.lang.String)
1.437 [ERROR]   location: variable userPermissionRepository of type com.example.UserManagmentPanel.repository.UserPermissionRepository
1.437 [ERROR] -> [Help 1]
1.437 [ERROR] 
1.438 [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
1.438 [ERROR] Re-run Maven using the -X switch to enable full debug logging.
1.438 [ERROR] 
1.438 [ERROR] For more information about the errors and possible solutions, please read the following articles:
1.438 [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
------
Dockerfile:7
--------------------
   5 |     RUN mvn dependency:go-offline -B
   6 |     COPY src ./src
   7 | >>> RUN mvn clean package -DskipTests
   8 |     
   9 |     # 2. Aşama: Uygulamayı Çalıştırma (Run Stage - Apple Silicon uyumlu hafif JRE)
--------------------
ERROR: failed to build: failed to solve: process "/bin/sh -c mvn clean package -DskipTests" did not complete successfully: exit code: 1

View build details: docker-desktop://dashboard/build/desktop-linux/desktop-linux/xo8lgaoi701gh5mhmilouxmdt
