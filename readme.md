# Getting Started

This is a demo hello world application that is used to test Checkmarx Agent instrumentation in Cloud Foundry environments. It is a Spring Boot app.

The app uses a modified Java Buildpack with a Checkmarx IAST Agent framework. The agent installation is triggered by the presence of a user provided ```checkmarx``` service providing a ```iast_server``` value in the credentials object. 

The buildpack customization is here: https://github.com/benjaminstokes/java-buildpack/tree/checkmarx-iast-agent

## Deployment Steps

Login to the CLI

```$ cf login -a api.run.pivotal.io```

Create a user provided service named checkmarx-iast and specify the uri to your CxIAST server.

```cf cups checkmarx -p '{"iast_server":"http://http://iast30.cx.sekots.org:8380"}''```

On powershell, escape double quotes:

```cf cups checkmarx -p '{\"iast_server\":\"http://http://iast30.cx.sekots.org:8380\"}''```

Push the application

``` cf push```


Bind the checkmarx-iast service to your application

```cf bs cxiast-cloudfoundry-demo checkmarx --binding-name checkmarx```

Restage the application

```cf restage cxiast-cloudfoundry-demo```

Note: Alternatively, use any other supported method to bind the service to the application that Cloud Foundry supports. 

## Timeout
* The agent takes a while to instrument applications and this can exceed the default Cloud Foundry health check timeout of 60 seconds. Try increasing the timeout to its max (180 seconds).

## Health Checks
* If max timeout is not sufficient, try changing the health check type to ```process``` via the app's manifest file or Cloud Foundry CLI. 



## Checkmarx IAST Agent Logs
IAST Agent Logs are written to a log file in the container. They are not streamed to the Cloud Foundry Loggregator.  To view the IAST Agent logs:

ssh to your app

```cf ssh cxiast-cloudfoundry-demo```

cd to the logs folder

```cd ~/app/.java-buildpack/cx_iast_agent/logs```

tail or more the logs

```tail -f java*log``` 

```more java*log```



