# Lambda expressions
## 1. Calculator
### Description
Create a Calculator class.

## 2. Hard worker
### Description
Simulate a situation in which task 33 will end unsuccessfully, and output information about it to the Main class. To do this, create a new functional interface 
OnTaskErrorListener, define the onError() method there. Add an errorCallback variable of the OnTaskErrorListener type to the Worker class. Pass the value of the variable
through the constructor as well. Thus, in the console, after executing your code, all tasks except 33 should end successfully, and 33 will notify you of an error.
