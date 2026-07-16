# ==============================================================
# STAGE 1: Maven Build — Java 17 ile derleme
# ==============================================================
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /app

# Önce sadece pom.xml kopyala → dependency cache katmanı
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Kaynak kodu kopyala ve paketle
COPY src ./src
RUN mvn clean package -DskipTests -B

# ==============================================================
# STAGE 2: Lightweight Runtime — sadece JRE
# ==============================================================
FROM bellsoft/liberica-openjre-alpine:17
WORKDIR /app

# Sağlık kontrolü için curl ekle
RUN apk add --no-cache curl

# Derlenen JAR'ı kopyala
COPY --from=builder /app/target/*.jar app.jar

# Container sağlık kontrolü
HEALTHCHECK --interval=30s --timeout=10s --retries=5 --start-period=40s \
  CMD curl -f http://localhost:8080/users || exit 1

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]