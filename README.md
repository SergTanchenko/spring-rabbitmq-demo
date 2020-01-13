Here you can find an implementation of examples described in the tutorial: <br><b>[Learn RabbitMQ: Asynchronous Messaging with Java and Spring](https://www.oreilly.com/library/view/learn-rabbitmq-asynchronous/9781838646189/)</b>

## How to run

### 1. Prerequisites
RabbitMQ is installed and running on localhost on standard port (5672). <br>In case you use a different host, port or credentials, connections settings would require adjusting. <br>
Installation guide can be found here: [Downloading and Installing RabbitMQ](https://www.rabbitmq.com/download.html) 

### 2. Start application from IDE
<i>Intellij IDEA was used to develop and run application.</i><br>
Find Application.java and run it.<br>
You should see the similar in the console:
````
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.2.RELEASE)

2020-01-13 23:20:02.966  INFO 7692 --- [           main] c.s.spring.rabbitmq.demo.Application     : Starting Application on Sergii-PC with PID 7692 (C:\Users\Sergii\IdeaProjects\spring-rabbitmq-demo\target\classes started by Sergii in C:\Users\Sergii\IdeaProjects\spring-rabbitmq-demo)
2020-01-13 23:20:02.968  INFO 7692 --- [           main] c.s.spring.rabbitmq.demo.Application     : No active profile set, falling back to default profiles: default
2020-01-13 23:20:03.445  INFO 7692 --- [           main] c.s.spring.rabbitmq.demo.Application     : Started Application in 0.678 seconds (JVM running for 0.999)
2020-01-13 23:20:03.448  INFO 7692 --- [           main] o.s.a.r.c.CachingConnectionFactory       : Attempting to connect to: [localhost:5672]
2020-01-13 23:20:03.470  INFO 7692 --- [           main] o.s.a.r.c.CachingConnectionFactory       : Created new connection: rabbitConnectionFactory#2f62ea70:0/SimpleConnection@18b0930f [delegate=amqp://guest@127.0.0.1:5672/, localPort= 51880]
````

If you see the following error:
````
java.lang.IllegalStateException: Failed to execute CommandLineRunner
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:787) [spring-boot-2.2.2.RELEASE.jar:2.2.2.RELEASE]
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:768) [spring-boot-2.2.2.RELEASE.jar:2.2.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:322) [spring-boot-2.2.2.RELEASE.jar:2.2.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1226) [spring-boot-2.2.2.RELEASE.jar:2.2.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1215) [spring-boot-2.2.2.RELEASE.jar:2.2.2.RELEASE]
	at com.stanchenko.spring.rabbitmq.demo.producer.Application.main(Application.java:16) [classes/:na]
Caused by: org.springframework.amqp.AmqpConnectException: java.net.ConnectException: Connection refused: connect
````
It means that your app didn't manage to create a connection.<br>
In this case check of RabbitMQ service is started. Default host and port is used.