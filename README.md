## Javalin
* [Home Page](https://javalin.io/)
* [Tutorials](https://javalin.io/tutorials/)
* [Documentation](https://javalin.io/documentation)


## Initial Setup
Before get started, it is required to install:
* [Java](https://www.java.com/en/download/help/download_options.html)
* [Docker](https://docs.docker.com/engine/install/)


## Getting Started
Build the Application and Generate Docker Image:
```shell
$ mvn package
```

Run Docker Image:
```shell
$ docker run -it --rm -p 8080:8080 -t javalin-demo:1.0.0-SNAPSHOT
```

Test the Application
```shell
$ curl localhost:8080

Hello World from Javalin!
```