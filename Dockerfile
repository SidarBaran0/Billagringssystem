# Bruk det offisielle MySQL Docker-bildet
FROM mysql:latest

# Angi MySQL root-passord (endre dette med ønsket passord)
ENV MYSQL_ROOT_PASSWORD=mittpassord

# Angi en bruker og passord (endre dette med ønsket brukernavn/passord)
ENV MYSQL_USER=dbuser
ENV MYSQL_PASSWORD=dbpassword

# Opprett en database (endre dette med ønsket databasenavn)
ENV MYSQL_DATABASE=bilinfo

# Eksponer MySQL-porten
EXPOSE 3306
