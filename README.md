= Lead Service
:docs: https://www.baidu.com
:github: https://www.github.com/qq53182347/trains-user

A mini project for Spring Boot with dependencies of:
- Spring Web,
- Spring Data JPA
- MySQL
- Gradle
- Junit5

The purpose of this app is to build the API consisting of 3 layers (API layer, Service layer, Data Access layer) and connect to real database.


This demo app is the introduction and demonstration of this framework. It aims to use the power of this amazing framework


== Installation and Getting Started
Here is a quick teaser of a complete Spring Boot Trains User application in Java:

[source,java,indent=0]
----
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class LeadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeadServiceApplication.class, args);
	}

}
----



== Getting Help
Are you having trouble with Trains User? We want to help!

* Check the {docs}/html/[reference documentation], especially the {docs}/html/howto.html#howto[How-to's] -- they provide solutions to the most common questions.
* Learn the Spring basics -- Spring Boot builds on many other Spring projects; check the https://spring.io[spring.io] web-site for a wealth of reference documentation.
  If you are new to Spring, try one of the https://spring.io/guides[guides].
* If you are upgrading, read the {github}/wiki[release notes] for upgrade instructions and "new and noteworthy" features.
* Ask a question -- we monitor https://stackoverflow.com[stackoverflow.com] for questions tagged with https://stackoverflow.com/tags/spring-boot[`spring-boot`].
  You can also chat with the community on https://gitter.im/spring-projects/spring-boot[Gitter].
* Report bugs with Spring Boot at {github}/issues[github.com/spring-projects/spring-boot/issues].



== Reporting Issues
Spring Boot uses GitHub's integrated issue tracking system to record bugs and feature requests.
If you want to raise an issue, please follow the recommendations below:

* Before you log a bug, please search the {github}/issues[issue tracker] to see if someone has already reported the problem.
* If the issue doesn't already exist, {github}/issues/new[create a new issue].
* Please provide as much information as possible with the issue report.
  We like to know the Spring Boot version, operating system, and JVM version you're using.
* If you need to paste code or include a stack trace, use Markdown.
  +++```+++ escapes before and after your text.
* If possible, try to create a test-case or project that replicates the problem and attach it to the issue.



== Building from Source
You don't need to build from source to use Spring Boot (binaries in https://repo.spring.io[repo.spring.io]), but if you want to try out the latest and greatest, Spring Boot can be built and published to your local Maven cache using the https://docs.gradle.org/current/userguide/gradle_wrapper.html[Gradle wrapper].
You also need JDK 1.8.

[indent=0]
----
	$ ./gradlew publishToMavenLocal
----

This will build all of the jars and documentation and publish them to your local Maven cache.
It won't run any of the tests.
If you want to build everything, use the `build` task:

[Run Build]
----
	$ ./gradlew build
----

== Building from Dokcer
You don't need to build from source to use Spring Boot (binaries in https://repo.spring.io[repo.spring.io]), but if you want to try out the latest and greatest, Spring Boot can be built and published to your local Maven cache using the https://docs.gradle.org/current/userguide/gradle_wrapper.html[Gradle wrapper].
You also need JDK 1.8.

[Run docker build]
----
	$ docker-compose build
----
Running the containers:
This command will build the docker containers and start them
[Run server with docker]
----
	$ docker-compose up
----

All commands should be run from project root (where docker-compose.yml locates)

If you have to want to see running containers. Checklist docker containers
----
	$ docker container list -a
----

or
----
	$ docker-compose ps
----
== deployment with kubernetes
elow you can see how to apply deployment and service configurations with kubernetes (minikube);

First cd to kubernetes folder

```
cd ./k8s
```

- Apply mysql
```
kubectl apply -f mysql-service.yaml
```

You should get logs like below
```
ervice/mysql-service-database created
deployment.apps/mysql-service-database created
```

Now we should create databases for customers (dbname = payday_customer) and accounts (dbname = payday_accounts) services.
To connect to mysql shell run the command
```
kubectl run -it --rm --image=mysql --restart=Never mysql-client -- mysql -h mysql-database -ppassword
```
After create databases
```
CREATE DATABASE IF NOT EXISTS payday_customers;

CREATE DATABASE IF NOT EXISTS payday_accounts;
```
Check tables
```
show databases;
```

- Apply customers-deployment and customers-service configurations
```
kubectl apply -f test
```




== Documentation
End points:

GET http://localhost:8083/users

Following request will populate and list all records in database.

```json
{
    "content": [
        {
            "id": 51,
            "name": "zhangsan",
            "address": "xxx",
            "email": "xx@xx.com",
            "phoneNumber": "1929292929",
            "createdAt": "2021-09-08T10:54:24.068",
            "updatedAt": null
        },
        {
            "id": 50,
            "name": "zhangsan",
            "address": "xxx",
            "email": "xx@xx.com",
            "age": 29,
            "phoneNumber": "1929292929",
            "createdAt": "2021-09-06T17:24:54.928",
            "updatedAt": null
        }
    ],
    "pageable": {
        "sort": {
            "sorted": true,
            "unsorted": false,
            "empty": false
        },
        "pageNumber": 0,
        "pageSize": 10,
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": true,
    "totalPages": 1,
    "totalElements": 2,
    "first": true,
    "size": 10,
    "number": 0,
    "sort": {
        "sorted": true,
        "unsorted": false,
        "empty": false
    },
    "numberOfElements": 2,
    "empty": false
}
```


== Samples
Groovy samples for use with the command line application are available in link:spring-boot-project/spring-boot-cli/samples[spring-boot-cli/samples].
To run the CLI samples, type `spring run <sample>.groovy` from the samples directory.



== Guides
The https://spring.io/[spring.io] site contains several guides that show how to use Spring Boot step-by-step:

* https://spring.io/guides/gs/spring-boot/[Building an Application with Spring Boot] is an introductory guide that shows you how to create an application, run it, and add some management services.



== License
Trains User is Open Source software released under the https://www.apache.org/licenses/LICENSE-2.0.html[Apache 2.0 license].
