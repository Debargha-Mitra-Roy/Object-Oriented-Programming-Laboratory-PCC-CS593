# Object Oriented Programming LAB (PCC-CS591)

LAB assignment and Notes of Object Oriented Programming.

## Steps :-

* Install **JAVA**

  ```bash
  sudo apt install default-jdk
  ```

* Check if `JAVA` installed successfully or not.

  ```bash
  javac --version # version check
  ```

* Open Terminal. (Press `Ctrl + Alt + t`)

* Go to any folder location or create a new.

  ```bash
  cd <folder name> # go to an existing folder
  ```
  ```bash
  mkdir <folder name> # create a folder
  cd <folder name> # go to the above folder
  ```

* Create a file.

  ```bash
  touch code.java # create a sample file
  ```

* Write the code on the sample.l file.

  ```bash
  nano code.java
  ```

* Type below argument to run the program.

  ```bash
  javac code.java
  java code.class
  ```

## Questions :-

* ### Question-01

  Find the greatest of three numbers.

* ### Question-02
  
  Arrange String in Ascending Order.

* ### Question-03

  Factorial of a given number.

* ### Question-04

  Array List

* ### Question-05
  
  Define a class ArrayList and its members are :-

  **a.** Variables :-

  1. `int arr[]` reference variable
  2. `int size`

  Both variables numbers are `static`.

  **b.** Create a static block which initializes the size of the array anf=d reserves space for array.
  
  **c.** Define static methods for following operations :-

  1. `input()` for filling array
  2. `output()` for displaying elements in array
  3. `search()` for aearching an item in array
  4. `sort()` for arranging all elements in array in ascending order.
    
  Define another class `ArrayDemo` which contains `main()` which can access all the methods define in `ArrayList` class. Write a menu driven program :-

  ```bash
  1 -> input()
  2 -> output()
  3 -> search()
  4 -> sort()
  5 -> exit()
  ```

* ### Question-06

  Define a class StackList which contains following variables and methods. All variables and methods are : `top`, `size`, `st[]`

  Methods are :-

  1. `set()` which initializes `top`, `size`, and `st`
  2. `push()`
  3. `pop()`
  4. `display()`

  Now create another class StackDemo which contains main(). The main() access all these methods defined in StackList.
  
  Write a menu driven program to implement the following operations :-

  ```bash
  1 -> push()
  2 -> pop()
  3 -> display()
  4 -> exit()
  ```

* ### Question-07

  Define a class pattern in C++. Data members in pattern class is :-
  
  `n = number of line`

  Methods / Patterns in class are :-

  a.  `set()` to initialize the value of n.

  b. `pattern()` prints the following 3 patterns in a menu driven program.
  
  ```
  *
  * *
  * * *
  * * * *
  * * * * *
  ```

  ```
      *
     * *
    * * *
   * * * *
  * * * * *
  ```

  ```
        *
       * *
      * * *
     * * * *
      * * *
       * *
        *
  ```

* ### Question-08

  Addition and Multiplication of a Complex Number.

* ### Question-09

  Overload `+` & `*` operators for matrix addition & multiplication where each matrix is an object of user defined class **Matrix**.

* ### Question-10

  Overload `+` & `*` operators for matrix addition & matrix multiplication using **Friend** function.

* ### Question-11

  Create a class student 
  Attributes are :-

    name,
    roll,
    department,
    avarage marks

  **NOTE :-** All members are private
  
  Create another class statements
  1. List of 


* ### Question-12

  Define a class `Employees` :-
  The attributes are :
  1. Name
  2. Age
  3. Salary

  Define a class `EmployeeList` that contains a set of methods operate these variables like 
  1. display all records
  2. Search a particular records
  3. Initialze all records etc.

  Here all Employee records should be maintained by **Linked List**.


* ### Question-13

  * Define class Stack(abstract)
     
    Attributes are :-

    ```
    size is an int variable
    list[] is an array of int
    top is an int variable
    push()
    pop() 
    display()
    ```


  * Inherite Stack class into **Simple Stack** & **Growable Stack** class and perform `push`, `pop` & `display` operation concurrently on ***Simple Stack Class Object*** & ***Growble Stack Class Object***.

* ### Question-14

  Write a program to implement the ***Multiple Inheritence***.


* ### Question-15

  Write a program to display different access controls.


* ### Question-16

  Define two classes in package p1 :-

  * Array class :- `input()`, `output()`.
  * Linked List class :- `create()`, `display()`.

  Define Array class and Linked List classes for different packages.


* ### Question-17

  Define user define exception classes :-

  * `OverflowException`
  * `UnderflowException`

  Define `push()`, `pop()`, where the array representation of stack is `Overflow` then `push()` throw `OverflowExceptionObject` and when stack is underflow then `pop()` throw `UnderflowExceptionObject`.

* ### Question-18

  Write a program to implement the `push` & `pop` operation on stack using Array.

  `push()` when the stack is full and `pop()` when the stack is empty then throw `StackOverflowException` & `StackUnderflowException` respectively.

* ### Question-19

  1. Create a MultiThreaded program to implement the following :-

     * Generate all even numbers between `1 to N`.
     * Generate all odd numbers between `1 to N`.
     * Generate first `n` Fibbonacci Numbers.
     * Generate all Prime numbers between `1 to N`.

  2. Implement Thread Syncronization.

  3. Impement **Producer & Consumer** Problem.