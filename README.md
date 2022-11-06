# 1. Lambda expressions
## 1.1 Calculator
### Description
Create a Calculator class.

## 1.2 Hard worker
### Description
Simulate a situation in which task 33 will end unsuccessfully, and output information about it to the Main class. To do this, create a new functional interface 
OnTaskErrorListener, define the onError() method there. Add an errorCallback variable of the OnTaskErrorListener type to the Worker class. Pass the value of the variable
through the constructor as well. Thus, in the console, after executing your code, all tasks except 33 should end successfully, and 33 will notify you of an error.

# 2. Stream API
## 2.1 Work with numbers
### Description
Make an ArrayList from a set of numbers and perform the following actions on it:

1. Filter out positive numbers.
2. Find even numbers among these positive numbers.
3. Sort the filtered numbers in ascending order.
4. Display the result on the screen.

## 2.2 Population cencus
### Description
In this task, it is proposed to analyze an array of data with information about people using streams from the Stream API library.

To work, you need to prepare several classes - Person, Sex, Education.

From the collection of Person objects, you must:
1. Find the number of minors (i.e. people under the age of 18).
2. Get a list of names of conscripts (i.e. men from 18 to 27 years old).
3. Get a list of potentially able-bodied people with higher education sorted by last name in the sample (i.e. people with higher education from 18 to 60 years old for women and up to 65 years old for men).

# 3. I/O streams. Working with files. Serialization
## 3.1 Installation
### Description
First, you need to manually create a 'Games' folder in a convenient place for you. It is important that the 'Games' folder must have write and read permissions.

In this task, you need to simulate the process of installing the game on your computer's hard drive:
1. Create several directories in the Games folder: src, res, savegames, temp.
2. Create two directories in the src directory: main, test.
3. In the main subdirectory, create two files: Main.java, Utils.java.
4. Create three directories in the res directory: drawable, vector, icons.
5. In the temp directory, create a file temp.txt.

File temp.txt it will be used to write information about the successful or unsuccessful creation of files and directories.

## 3.2 Conservation
### Description
In this task, it is necessary to serialize the Java class using the Serializable interface, write the serialized files to the hard disk and package them into an archive. To do this, you will need to do the following steps:
1. Create three instances of the Game Progress class.
2. Save serialized GameProgress objects to the savegames folder from the previous task.
3. The created save files from the savegames folder should be packed into a zip archive.
4. Delete the save files that are outside the archive.

## 3.3 Loading
### Description
In this task, it is necessary to perform the reverse operation of unzipping the archive and deserializing the saved game file into a Java class.

Thus, to complete the task, you will need to do the following steps:
1. Unpack the archive in the savegames folder.
2. Read and deserialize one of the unzipped save.dat files.
3. Output the saved game status to the console.

# 4. Maven & Gradle
## 4.1 Multi-moduleMaven
### Description
In this task, you need to build a project consisting of modules using Maven:
1. db - a database module;
2. api - module for working with the web;
3. service - service layer.

## 4.2 Multi-moduleGradle
### Description
In this task, you need to build a project consisting of modules using Gradle:
1. db - a database module;
2. api - module for working with the web;
3. service - service layer.

# 5. Parsers-CSV-XML-JSON
## 5.1 CSV - JSON parser
### Description
You have to write to the JSON file of the object obtained from the CSV file.

To work with the project, auxiliary libraries will be required, so you need to create a new project using the Gradle or Maven project builder. Next, write the dependencies for the following libraries: opencv, json-simple and gson.

As the initial information, create a file `data.csv` with the following contents and place it in the root of the created project:
```csv
1,John,Smith,USA,25
2,Ivanov,Petrov,RU,23
```
In addition, you will need the `Employee` class, which will contain information about employees. Note that parsing Java classes from CSV will require an empty class constructor.
```java
public class Employee {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

    public Employee() {
        // Пустой конструктор
    }

    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }   
}
``` 
As a result of the program, the file `data' should appear in the root of the project.json` with the following content:
```json
[
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Smith",
    "country": "USA",
    "age": 25
  },
  {
    "id": 2,
    "firstName": "Inav",
    "lastName": "Petrov",
    "country": "RU",
    "age": 23
  }
]
```
## 5.2 XML - JSON parser
### Description
In this task, you have to write an object obtained from an XML file to a JSON file.

Perform this task within the framework of the project created in the previous task.

As the initial information, create a file data.xml with the following contents (put this file in the root of the project):
```xml
<staff>
    <employee>
        <id>1</id>
        <firstName>John</firstName>
        <lastName>Smith</lastName>
        <country>USA</country>
        <age>25</age>
    </employee>
    <employee>
        <id>2</id>
        <firstName>Inav</firstName>
        <lastName>Petrov</lastName>
        <country>RU</country>
        <age>23</age>
    </employee>
</staff>
```
As a result of the program, a data2 file should appear in the root of the project.json with content similar to the json file from the previous task

## 5.3* JSON parser
### Description
In this task, you will have to read the JSON file, parse it and convert JSON objects into Java classes.

During the execution of the program in the console, you should see the following lines
```
Employee{id=1, firstName='John', lastName='Smith', country='USA', age=25}
Employee{id=2, firstName='Inav', lastName='Petrov', country='RU', age=23}
```
# 6. Code Testing - JUnit + Hamcrest
## 6.1 Using JUnit
### Description
In this task you need:
1. Write unit tests that automatically check the functionality of the program

### Realization
I used:
1. <a href="https://github.com/imLIVI/Abstract-classes"> Project "Bank accounts"</a>
2. JUnit - framework

```xml
<dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.9.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```
3. Maven

```xml
<build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
            </plugin>
        </plugins>
    </build>
```
## 6.2 JUnit + Hamcrest
### Description
In this task you need:
1. Rewrite the tests from the <a href="https://github.com/imLIVI/UsingJUnit.git"> UsingJUnit task </a> in the Hamcrest style
2. Add at least 2 more tests, trying to use those Hamcrest features that are not in the standard JUnit asserts

### Realization
I used:
1. Project <a href="https://github.com/imLIVI/UsingJUnit.git"> UsingJUnit task </a>
2. JUnit - framework
```xml
<dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.9.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```
3. Maven
```xml
<build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
            </plugin>
        </plugins>
    </build>
```
4. Hamcrest
```xml
<dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>java-hamcrest</artifactId>
            <version>2.0.0.0</version>
        </dependency>
```
# 7. Mockito
## 7.1 TestingMessageService-Mockito
### Description
1. Clone the remote repository of the <a href=https://github.com/netology-code/geo-service>service</a> or make it a fork (preferably) or download it to yourself as an archive;
2. Connect junit and **mockito** dependencies to the maven project (they need to be added to the pom ```file.xml```);
3. Create a class for tests in the ```src/test/java``` folder (you can also create subfolders according to the package of the class you will be testing);
4. Create tests according to the task (for the ```MessageSenderImpl``` service, you must create stubs (mock) in the form of ```GeoServiceImpl``` and ```LocalizationServiceImpl```) at least 4 unit tests;
5. Submit the task for review.

### Realization
I used:

1. Project <a href=https://github.com/netology-code/geo-service>service</a>
2. JUnit - framework
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.9.1</version>
    <scope>test</scope>
</dependency>
```
3. Mockito
```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-junit-jupiter</artifactId>
    <version>4.8.0</version>
    <scope>test</scope>
</dependency>
```
5. Maven
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M5</version>
        </plugin>
    </plugins>
</build>
```
## 7.2 TestingHealthService-Mockito
### Description
1. Clone the remote repository of the <a href=https://github.com/neee/healthcare-service>service</a> or make it a fork (preferably) or download it to yourself as an archive;
2. Connect junit and **mockito** dependencies to the maven project (they need to be added to the pom ```pom.xml```);
3. Create a class for tests in the ```src/test/java``` folder (you can also create subfolders according to the package of the class you will be testing);
4. Create tests according to the task (for the ```MedicalServiceImpl``` service, you must create stubs (mock) in the form of ```PatientInfoFileRepository``` and ```SendAlertService```) at least 3 unit tests:
- Check the message output during the ```checkBloodPressure```
- Check the message output during the ```checkTemperature``` 
- Check that the messages are not displayed when the indicators are normal.
6. Submit the task for review.

### Realization
I used:

1. Project <a href=https://github.com/neee/healthcare-service>service</a>
2. JUnit - framework
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.9.1</version>
    <scope>test</scope>
</dependency>
```
3. Mockito
```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-junit-jupiter</artifactId>
    <version>4.8.0</version>
    <scope>test</scope>
</dependency>
```
5. Maven
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M5</version>
        </plugin>
    </plugins>
</build>
```
# 8. Model OSI
## 8.1 ClientServerApp-OSI
### Description
Create a server using ```Serversocket```.
When an incoming connection is made to the server, accept it, read a line from it. Display it on the screen along with the port number from which this connection came.
At the same time, in another method (it can be another class with a second main method or a separate thread), connect to this server and send it one line.
## 8.2 ClientServerApp-OSI*
### Description
To complete the task, you need:
1. To edit the ```hosts``` file so that requests to the ```netology.homework``` address are redirected to your local computer (```127.0.0.1```)
2. Improve the <a href="https://github.com/imLIVI/ClientServerApp-OSI.git">previous task</a> so that it works through the address ```netology.homework```, and communication took place in several (3-5) steps, in the form of a dialogue
### Realization
My application consists of:
1. ServerThread
![diagram (1)](https://user-images.githubusercontent.com/63547457/199311254-f4e8e419-3f4d-4022-8a18-af118dbfcfed.png)
2. Two ClientThreads
3. Databases with registered users

# 9. Protocol HTTP
## 9.1 RequestForListOfCats-HTTP
### Description
<a href ="https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats">There is</a> a list of facts about cats. Our task is to make a request to this resource and filter out the facts that no one voted for (the upvotes field).
The format of each entry is as follows:
```json
{
  "id": "5b4910ae0508220014ccfe91",
  "text": "Кошки могуть создавать более 100 разных звуков, тогда как собаки только около 10.",
  "type": "cat",
  "user": "Alex Petrov",
  "upvotes": null
},
```
```text
id - уникальный идентификатор записи
text - сообщение
type - тип животного
user - имя пользователя
upvotes - голоса
```
We need to:
1. Read the entire list and return only those facts for which the upvotes field is not `null'

### Realization
1. Looked at the <a href ="https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats">data</a>
2. Created a `maven`project and add to ```pom.xml``` httpclient library:
```text
<dependency>
   <groupId>org.apache.httpcomponents</groupId>
   <artifactId>httpclient</artifactId>
   <version>4.5.12</version>
</dependency>
```
3. Created httpClient:
```text
CloseableHttpClient httpClient = HttpClientBuilder.create()
    .setDefaultRequestConfig(RequestConfig.custom()
        .setConnectTimeout(5000)    // максимальное время ожидание подключения к серверу
        .setSocketTimeout(30000)    // максимальное время ожидания получения данных
        .setRedirectsEnabled(false) // возможность следовать редиректу в ответе
        .build())
    .build();
```
4. Added the request object ```HttpGet request = new HttpGet("https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats")``` and
called the remote service `CloseableHttpResponse response = httpClient.execute(request)`;
5. Added to pom.xml library for working with json
```text
<dependency>
   <groupId>com.fasterxml.jackson.core</groupId>
   <artifactId>jackson-databind</artifactId>
   <version>2.11.1</version>
</dependency>
```
6. Created a class into which I converted the json response from the server;
7. Converted json to a list of java objects;
8. Filtered the list - using the stream api, using the method ;
9. Displayed the result on the screen.

## 9.2 ReadDataAPI_NASA-HTTP
### Description
In this task you need:
1. Get the key for the NASA API at: https://api.nasa.gov/
2. Make a request from the code: https://api.nasa.gov/planetary/apod?api_key=YOUR_KEY
3. Create a response class and parse the json response using Jackson or Gson
4. Find the url field in the response and download the byte array to save to a file
5. The file name should be taken from the url part

### Realization
1. Created a `maven` project and added to pom.xml the apache httpclient library:
```text
<dependency>
   <groupId>org.apache.httpcomponents</groupId>
   <artifactId>httpclient</artifactId>
   <version>4.5.12</version>
</dependency>
```
2. Added to pom.xml a library for working with json:
```text
<dependency>
   <groupId>com.fasterxml.jackson.core</groupId>
   <artifactId>jackson-databind</artifactId>
   <version>2.11.1</version>
</dependency>
```
3. Created a class into which the json response from the server will be converted;
4. Converted json to java object;
5. Found the url field in the java object and made another http request with it using the already created ```HttpClient```;
6. Saved the response body to a file with the name of the url part;
7. I checked that the file is downloaded and opened;

# JVM
## 10.1 UnderstandingJVM
### Description
Review the code below and describe (in text or with pictures) each line from the point of view of what is happening in the JVM
```java

public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1
        Object o = new Object();        // 2
        Integer ii = 2;                 // 3
        printAll(o, i, ii);             // 4
        System.out.println("finished"); // 7
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5
        System.out.println(o.toString() + i + ii);  // 6
    }
}

```
### Realization
<a href="https://github.com/imLIVI/UnderstandingJVM/blob/master/JVM.pdf">
  <img src="https://user-images.githubusercontent.com/63547457/200143389-0c867ecd-878c-438a-93f2-3c8c435755d4.png">
</a>

## 10.2 ExploringJVMviaVisualVM
### Description
Take this <a href="https://github.com/Arsennikum/jvm-visualvm-experience">project</a> and research memory usage through VisualVM.

You need:
1. Take screenshots of the graphs and mark on them with a simple graphic editor and text, at which moments what actions of the program took place.
2. Mark on the timeline of graphs each line that the program has output to the console and explain it in your own words in the text

### Realization
#### Сonsole output

![IDEA](https://user-images.githubusercontent.com/63547457/200165301-3adc6759-e1bf-4d74-a6f2-a7b6a0ecd285.png)
#### VisualVM analysis
![VisualVM](https://user-images.githubusercontent.com/63547457/200202001-88745347-0936-4ee7-bb6b-a6ddd78b0ea2.png)
|  №  |                                            Classes                                                                                                     |                                                         Metaspace                                                   |                                                                                                                 Heap                                                                                                               |
|:---:| :------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------- |:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1-2 |загрузка 529 классов io.vertx и вспомогательных, так как число классов увеличилось на 814                                                               |подгрузка классов Loader-ом, увеличение Metaspace до 7,5 МБ, используется 6,86 МБ                                    |увеличение размера используемого пространства с 14 МБ до 34 МБ. При этом размер выделенной памяти не меняется и равен 128 МБ.                                                                                                       |
| 3-4 |загрузка 2081 классов io.netty. Однако по выходным данным работы программы должно было добавиться 2117 классов. Видимо, 36 классов были добавлены ранее |подгрузка классов Loader-ом, увеличение Metaspace до 11,63 МБ, используется 11,09 МБ                                 |срабатывание Garbage Collector (сборщика мусора), после чего объем используемой памяти сначала уменьшается. Однако затем оно увеличивается до 69,49 МБ. При этом размер выделенной памяти не меняется и равен 128 МБ                |
| 5-6 |загрузка 869 классов org.springframework и вспомогательных, так как число классов увеличилось на 892                                                    |подгрузка классов Loader-ом, увеличение Metaspace до 22,92 МБ, используется 22,15 МБ                                 |срабатывание Garbage Collector (сборщика мусора), после чего объем используемой памяти уменьшился до 10,58 МБ, а размер выделенной памяти уменьшился до 24 МБ. Cокращение heap может быть вызвано неиспользованием объектов классов |
| 7-9 |загрузка новых классов не происходила. Их число осталось на прежнем уровне                                                                              |подгрузка классов Loader-ом, увеличение размера до 24 МБ, используется 23,36 МБ                                      |создание 5000000 объектов, в связи с чем размер heap увеличился до 327 МБ, используется 182 МБ                                                                                                                                      |                                                                                                                                                                              |
|10-11|загрузка новых классов не происходила. Их число осталось на прежнем уровне                                                                              |подгрузка классов Loader-ом, увеличение используемого размера до 23,4 МБ, выделенный размер остался прежним - 24 МБ  |создание 5000000 объектов, в связи с чем размер heap увеличился до 981 МБ, используется 423,1 МБ                                                                                                                                    |
|12-13|загрузка новых классов не происходила. Их число осталось на прежнем уровне                                                                              |подгрузка классов Loader-ом, увеличение используемого размера до 23,42 МБ, выделенный размер остался прежним - 24 МБ |создание 5000000 объектов, в связи с чем размер heap увеличился до 981 МБ, используется 677,1 МБ                                                                                                                                    |
|13...|загрузка новых классов не происходила. Их число осталось на прежнем уровне                                                                              |подгрузка классов не происходила, объем памяти остался на прежнем уровне                                             |рост числа объектов привел к увеличению размера кучи до 1032 МБ, однако в этот же момент сработал Garbage Collector (сборщика мусора) и используемая память heap уменьшилась до 617 МБ                                              |

