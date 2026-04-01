# microservicios-futfem-matchdayplayersvisitante

`microservicios-futfem-matchdayplayersvisitante` stores and serves the player records associated with the away side on matchday flows. It complements the local matchday player service and allows the Tikitakas backend to keep matchday-specific visitor data isolated from the generic player catalog.

The application is built with Java 21, Spring Boot, Spring Data JPA, MySQL, Springdoc OpenAPI, and Maven Wrapper. It inherits common CRUD behavior from `microservicios-common`, registers in Eureka, and is exposed to clients through the API gateway. This keeps its runtime behavior aligned with the rest of the backend microservices and simplifies operations in Docker-based environments.

Typical local execution:

```bash
./mvnw spring-boot:run
```

Gateway route:

- `/api/futfem/matchdayplayersvisitante/**`

In the current `v0.1.0` release, the repository includes CI pipeline automation, Docker packaging, and gateway-aware Swagger metadata. As a result, its OpenAPI documentation can be consumed correctly from the central gateway UI instead of pointing to internal service coordinates.

Use this service whenever the application needs to manage visitor-side matchday players separately from the home lineup and from the broader, reusable player directory maintained elsewhere in the platform.
