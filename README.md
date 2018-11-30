[![Maven Central](https://img.shields.io/maven-central/v/tools.dynamia.zk.addons/aceditor-zk.svg?label=Maven%20Central)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22tools.dynamia.zk.addons%22%20a%3A%22aceditor-zk%22)

# ACE Editor for ZK

This library let you use Ace Editor (https://ace.c9.io/) in ZK application using pure Java or ZUL. 

## Bulding

This is a regular maven project, download and build it using the following command:


```bash
mvn clean install
```

## Installation

Just add **aceditor-zk-xx.jar** to your project dependencies:

**Maven**

```xml
<dependency>
    <groupId>tools.dynamia.zk.addons</groupId>
    <artifactId>aceditor-zk</artifactId>
    <version>1.0.1</version>
</dependency>
```

**Gradle**
```bash
compile "tools.dynamia.zk.addons:aceditor-zk:1.0.1"
```

## Usage

From **zul**
```xml
 <aceditor mode="java" width="700px" height="400px" theme="ambiance">
    <attribute name="value">
        Aceditor ace = new Aceditor();
        ace.setTheme("ambiance");
        ace.setWidth("500px");
        ace.setHeight("400px");
        ace.setMode("html");
    </attribute>
 </aceditor>
```
Aceditor support ZK MVVM databinding and commands

From **Java**

```java
Aceditor ace = new Aceditor();
ace.setTheme("ambiance");
ace.setWidth("500px");
ace.setHeight("400px");
ace.setMode("html");
ace.setValue("<h1>Hello ZK</h1>");
```


## License

Aceditor-ZK is available under the [Apache 2 License](https://github.com/dynamia-projects/chartjs-zk/blob/master/LICENSE.md).

## Want contribute?
Please read [Contributing Guidelines](https://github.com/dynamia-projects/chartjs-zk/blob/master/CONTRIBUTING.md)

