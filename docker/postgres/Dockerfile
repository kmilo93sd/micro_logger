FROM postgres:11-alpine

ENV POSTGRES_DB: ${POSTGRES_DB}
ENV POSTGRES_USER: ${POSTGRES_USER}
ENV POSTGRES_PASSWORD: ${POSTGRES_PASSWORD}

COPY ./docker/postgres/init.sql /docker-entrypoint-initdb.d

EXPOSE 5432