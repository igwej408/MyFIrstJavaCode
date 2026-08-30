# --- Stage 1: compile ---
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app
COPY src/ ./src/
RUN javac -d out src/Main.java

# --- Stage 2: run ---
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/out .

# Interactive CLI app reading from stdin - must be run with `docker run -it`
ENTRYPOINT ["java", "Main"]
