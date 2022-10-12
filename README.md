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
