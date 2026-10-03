# LedgerLine

A double-entry payments ledger and transfer engine built with Java 21, Spring Boot, PostgreSQL and Kafka.

## Local setup

Requires Java 21, Docker Desktop and Git.

```powershell
Copy-Item .env.example .env   # then set a real password in both password lines
docker compose up -d
.\mvnw.cmd spring-boot:run
curl.exe http://localhost:8080/actuator/health
```