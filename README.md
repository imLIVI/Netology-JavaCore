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
