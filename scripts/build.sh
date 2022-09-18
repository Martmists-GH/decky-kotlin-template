#!/usr/bin/env bash

docker run \
    -it \
    --rm \
    -v $PWD:/src \
    -v $PWD/.docker/gradle:/root/.gradle \
    -v $PWD/.docker/konan:/root/.konan \
    build-image \
    bash -c "cd /src && export GRADLE_OPTS=-Dorg.gradle.project.buildDir=/src/.docker/build && ./gradlew build"
