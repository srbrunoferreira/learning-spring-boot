FROM alpine:3.22

RUN apk add --no-cache \
    openjdk21 \
    maven \
    git \
    openssh-client \
    bash \
    curl

ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk
ENV PATH="${JAVA_HOME}/bin:${PATH}"

WORKDIR /app
