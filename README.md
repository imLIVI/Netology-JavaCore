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

