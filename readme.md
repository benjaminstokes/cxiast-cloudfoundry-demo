# Getting Started


## Pivotal Cloud Foundry

Login to the CLI

```$ cf login -a api.run.pivotal.io```

Push the application

``` cf push```

## Notes
* The agent takes a while to instrument applications and this will likely trigger Cloud Foundry health checks at 60 seconds. Try setting to the maximum (180s) timeout or switch the health check type to 'process'

## Logs
ssh to your app container

```cf ssh cxiast-cloudfoundry-demo```

cd to the logs folder

```~/app/.java-buildpack/cx_iast_agent/logs```

tail or more the logs

```tail -f java*log``` 

```more java*log```




## Todo
Change buildpack to find CxServer from a CF User Provided Service. Detect will use this and pull the Agent zip file from it.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

