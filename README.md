# java21-high-throughput-api

Proyecto mínimo Java 21 + Spring Boot WebFlux diseñado para manejar alta concurrencia.

## Qué incluye

- WebFlux + Netty (endpoint reactivo `/api/ping`)
- Base Datos (R2DBC)
- Actuator + Prometheus micrometer
- Dockerfile

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

## Add Item

```
curl --location 'http://localhost:8080/api/items' \
--header 'Content-Type: application/json' \
--data '{
"name": "javi"
}'
```

## All items

```
curl --location 'http://localhost:8080/api/items'
```

## Métricas

| Métricas   |                                           |
|------------|-------------------------------------------|
| Prometheus | http://localhost:8080/actuator/prometheus |
| Health     | http://localhost:8080/actuator/health     |
| Metrics    | http://localhost:8080/actuator/metrics    |

## Ejecutar como contenedor Docker

```
docker build -t java21-high-throughput-api .
docker run -p 8080:8080 java21-high-throughput-api
```

## Test de carga (ejemplo con wrk, 100 conexiones, 10 seg)

wrk -t12 -c100 -d10s http://localhost:8080/api/ping