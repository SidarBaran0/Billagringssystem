# Billagringssystem
# Billagringssystem

Dette prosjektet er et Spring Boot-basert system for lagring og håndtering av informasjon om biler. Systemet bruker en MySQL-database og er konfigurert for bruk med Docker og Kubernetes.

## Funksjonalitet

- **Hente informasjon**: Få en liste over alle biler i systemet.
- **Legge til biler**: Legg til nye biler med validering.
- **Oppdatere biler**: Endre informasjon om eksisterende biler.
- **Slette biler**: Fjern biler fra systemet.

## Teknologi

- **Backend**: Spring Boot (Java)
- **Database**: MySQL
- **Containere**: Docker
- **Orkestrering**: Kubernetes (Minikube for lokal testing)

## Kom i gang

### Lokalt

1. Klon repositoryet:
   ```bash
   git clone https://github.com/SidarBaran0/Billagringssystem.git
   cd Billagringssystem
   ```

2. Start MySQL og opprett databasen `bilinfo`.

3. Konfigurer `application.properties` med riktige databaseinnstillinger.

4. Bygg og kjør applikasjonen:
   ```bash
   mvn spring-boot:run
   ```

### Med Docker Compose

1. Bygg containerne:
   ```bash
   docker-compose build
   ```

2. Start containerne:
   ```bash
   docker-compose up
   ```

3. Applikasjonen er tilgjengelig på:
   ```
   http://localhost:8080
   ```

### Med Kubernetes

1. Start Minikube:
   ```bash
   minikube start
   ```

2. Bygg Docker-bildet:
   ```bash
   eval $(minikube docker-env)
   docker build -t springboot-app .
   ```

3. Deploy applikasjonen:
   ```bash
   kubectl apply -f kubernetes/mysql-deployment.yaml
   kubectl apply -f kubernetes/springboot-deployment.yaml
   ```

4. Få tilgang til applikasjonen:
   ```bash
   minikube service springboot-service
   ```

