# java21-high-throughput-api

Proyecto mínimo Java 21 + Spring Boot WebFlux diseñado para manejar alta concurrencia.

## Ejecutar local
1. Compilar:
   ```
   mvn -DskipTests package
   ```
2. Ejecutar:
   ```
   java -jar target/java21-high-throughput-api-0.0.1-SNAPSHOT.jar
   ```
3. Probar:
   ```
   curl http://localhost:8080/api/ping
   ```

## Docker
```
docker build -t java21-high-throughput-api .
docker run -p 8080:8080 java21-high-throughput-api
```

## Qué incluye
- WebFlux + Netty (endpoint reactivo `/api/ping`)
- Actuator + Prometheus micrometer
- Dockerfile
# java21-high-throughput-api
