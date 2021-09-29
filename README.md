# Simple Scala Server Template
This serves as a starting point for anyone who wants to start a Scala web project with http4s.

## Basic dependencies
Basic library and plugin dependencies are configured for ease of use.

Feel free to replace or delete them.

- cats
- cats-effect
- spotless (for code formatting)
- http4s

## Build the project
```sh
./gradlew build
```

## Run tests
```sh
./gradlew test
```

## Format code
```sh
./gradlew spotlessApply
```

## Upgrade Gradle
```sh
./gradlew wrapper --gradle-version=<version>
```
