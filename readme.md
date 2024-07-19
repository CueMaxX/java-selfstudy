# Welcome to the Learning Outcomes Evaluation

Dear students,

Welcome to this Learning Outcomes Evaluation session. Over the next two hours, we will be assessing your understanding and mastery of the learning outcomes for this semester. This evaluation is an important opportunity for you to showcase your knowledge and skills.

Please take this evaluation seriously and demonstrate your best work from the last two weeks by using your personal git account as proof. Remember to answer each question thoroughly and provide clear explanations where necessary.

Best regards,
Ghada Hassan and Kay Berkling

## Ethics Section regarding generative and other forms of AI

The student acknowledges and agrees that the use of AI is strictly prohibited during this evaluation. By submitting this report, the student affirms that they have completed the assessment independently and without the assistance of any AI technologies. This agreement serves to ensure the integrity and authenticity of the student's work, as well as their understanding of the learning outcomes.


## Checklist before handing in your work

- [ ] Review the assignment requirements to ensure you have completed all the necessary tasks.
- [ ] Pay careful attention to the requested links that must come from your project.
- [ ] Double-check your links and make sure that links lead to where you intended. Each answer should have links to work done by you in your own git repository
- [ ] Make sure you have at least 10 references to your project code (This is important evidence to prove that your project is substantial enough to support the learning outcome of object oriented design and coding within a larger piece of code.)
- [ ] Include comments to explain your referenced code and why it supports the learning outcome
- [ ] Proofread any accompanying documentation or comments for grammar and clarity.
- [ ] Commit and push this markup file to your personal git repository and hand in the link and a hard-copy via email at the end of the exam.

Remember, this checklist is not exhaustive, but it should help you ensure that your work is complete, well-structured, and meets the required standards.

Good luck with your evaluation!


## Learning Outcomes

| Exam Question | Total Achievable Points | Points Reached During Grading |
|---------------|------------------------|-------------------------------|
| Algorithms    |           4            |                               |
| Data types    |           4            |                               |
| Complex Data Structures |  4            |                               |
| Concepts of OOP |          6            |                               |
| OO Design     |           6            |                               |
| Class concepts |            8           |                               |
| Testing       |           6            |                               |
| Operator/Method Overloading | 6 |                               |
| Templates/Generics |       6            |                               |
| Class libraries |          6            |                               |
| Multi-threading |          6            |                               |
| Lambda expressions |       6            |                               |
| Serialization |            6           |                               |
| Database connectivity |   6            |                               |
| Total        |           80          |                               |



## Evaluation Questions

Please answer the following questions to the best of your ability to show your understanding of the learning outcomes. Please provide examples from your project code to support your answers. Only links to your own git will count. When you explain what you did make sure to explain why you did it this way with clear reasoning relating to your own work and not generic statements that anyone could make.

## Important note from the student:
In case I have time and knowledge in my head left, I, Ephraim, will add code outside of my repository. I am aware that I do not know whether that results in any point for the task, but maybe it does which is why - if there is sufficient time in the end - to insert more code. I oblige to format code that has been created during the exam as markdown code.
Also, I was told that the project is due *after* the exam, which is why I have not started with the project yet and I can therefore only refer to my practice code.

## Evaluation Material


### Algorithms

Algorithms are manyfold and Java can be used to program these. Examples are sorting or search strategies but also mathematical calculations. Please refer to **two** areas in either your regular coding practice or within your project, where you have coded an algorithm. Do not make reference to code written for other classes, like theoretical informatics.

### Algorithms - answer
[algorithms.java:17](https://github.com/CueMaxX/java-selfstudy/blob/main/Advanced/algorithms.java)
and
[algorithms.java:24](https://github.com/CueMaxX/java-selfstudy/blob/main/Advanced/algorithms.java)
are places where I have used algorithms.
<br> I have not written any algorithms in the code, but here would be an example:
```java
public static int linSearch(int[] input, int output) {
  for (int i = 0; i < input.length; i++) {
    if (input[i] == output) {
      return i;
    }
  }
  System.out.println("Not found!");
```



| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |


### Data types

Please explain the concept of data types and provide examples of different data types in Java.
Typical data types in java are int, double, float, char, boolean, long, short, byte, String, and arrays. Please provide one example for each of the **three** following data types in your code. One of these links must be to your project.
* Array
* Strings
* boolean

Regarding the link to your project, explain the context in which you have used this data type being specific to your project.
### Data types - answer
Different data types can be used in most of todays programming languages, including Java, to  - of course - differentiate between different types of data that needs to be stored in memory. This is because
* memory conservation: Not every data type needs a lot of memory so it will save on memory
* expected data: We can specify which data we expect and if other data is stored in a variable with another data type, we will get a useful error
* I have used [strings](https://github.com/CueMaxX/java-selfstudy/blob/main/Advanced/strings.java) to store text,
* [arrays](https://github.com/CueMaxX/java-selfstudy/blob/main/Basics/arrays.java) and [multidimensional arrays](https://github.com/CueMaxX/java-selfstudy/blob/main/Basics/dimarrays.java) to store multiple related data sets of the same data type,
* and [boolean](https://github.com/CueMaxX/java-selfstudy/blob/main/Basics/Types.java) to store e.g. states in "true" or "false"

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           1            |                               |
|           1           |                               |
|           2 (project link)          |                               |



### Complex Data Structures

Examples of complex data structures in Java are ArrayList, HashMap, HashSet, LinkedList, and TreeMap. Please provide an example of how you have used **two** of these complex data structures in your code and explain why you have chosen these data structures. Examples do not have to come from the project.

### Complex Data Structures - answer
* When I was testing out different algorithms (see algorithms), I [used an arraylist](https://github.com/CueMaxX/java-selfstudy/blob/main/Advanced/algorithms.java) because the different algorithms need to search through my provided dataset, and arraylists provide a constant time for search operations.
* Here I implement a linked list in Java:
```java
import java.util.LinkedList;

public class EnlargeList {
  public static void main(String[] args) {
    LinkedList<String> shoppinglist = new LinkedList<String>();

    shoppinglist.add("Apple");
    shoppinglist.add("Banana");
    shoppinglist.add("Fries");
    shoppinglist.add("Sugar");
    shoppinglist.add("Flowers");

    // Print shopping List
    System.out.println(shoppinglist);
  }
}
```


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |



### Concepts of OOP
Concepts of OOP are the basic building blocks of object-oriented programming, such as classes, objects, methods, and attributes.
Explain HOW and WHY your **project** demonstrates the use of OOP by using all of the following concepts:
* Classes/Objects
* Methods
* Attributes
  Link to the code in your project that demonstrates what you have explained above.

### Concepts of OOP - answer
Since I did not start with the project (see note above), I will link to my practice codebase.
* I [have used](https://github.com/CueMaxX/java-selfstudy/blob/main/Advanced/parameters.java) classes/objects
* [Here](https://github.com/CueMaxX/java-selfstudy/blob/main/Advanced/getters.java) is where I wrote different methods for a class
* Also, I made use of [constructors](https://github.com/CueMaxX/java-selfstudy/blob/main/Advanced/constructors.java) to initiate objects with different attributes

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|          2              |                               |
|          2              |                               |
|          2              |                               |



### OO Design
Please showcase **two** areas **where** you have used object orientation in your project. (How and why you use it will be the next question below.)
Examples in Java of good oo design are composition, encapsulation, inheritance, polymorphism, and abstraction.

### OO Design - answer
Again, I will link to my practice code:
* [Inheritance](https://github.com/CueMaxX/java-selfstudy/blob/main/Advanced/inheritance.java)
* [Polymorphism](https://github.com/CueMaxX/java-selfstudy/blob/main/Expert/polymorph.java)

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|              3         |                               |
|              3         |                               |



### Advanced Class Concepts
Advanced class concepts include constructors, abstract classes, interfaces, access modifiers, static methods, and variables. Please provide an example of how you have used **two** of these class concepts in your **project** code and explain why you have chosen these class concepts and how they work within your code.

### Advanced Class Concepts - answer
Again, practice code.
* [Constructors](https://github.com/CueMaxX/java-selfstudy/blob/main/Advanced/constructors.java) can be used to initiate an object in different ways depending on the given parameters during instantiation. In the provided code, this allows you to e.g. instantiate the Object "Machine" with no parameters at all, resulting in String name to be set to "default machine". However, when you hand over a string, that will be used as a name instead. When providing both a string and an integer, the string is still used for the name, and the integer is used for the machine's id.
* [Interfaces](https://github.com/CueMaxX/java-selfstudy/blob/main/Expert/interfaces.java) allow you to provide a general method that can be used by multiple different object types. In the linked example, I have created the interface "Info" with the method "showInfo()". Then, I was able to add "class xxx implements Info" and add the method "showInfo()" to the class itself which can then execute object specific code. This way, I can program machine1.showInfo() to print the id of a machine (which is an integer) and at the same time use person1.showInfo() to print out the persons name, which is a string.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|            4           |                               |
|            4           |                               |

### Testing
Java code is tested by using JUnit. Please explain how you have used JUnit in your project and provide a link to the code where you have used JUnit. Links do not have to refer to your project and can refer to your practice code. If you tested without JUnit, please explain how you tested your code.
Be detailed about what you are testing and how you argue for your test cases.
Test cases usually cover the following areas:
* boundary cases
* normal cases
* error cases / catching exceptions


### Testing - answer
I have not used JUnit to test my project. However, I can use try-catch or try-with to catch exceptions or error cases, boundary case testing with simple if and else if conditions and normal cases through printing expected values to the serial command line.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Operator/Method Overloading
An example of operator overloading is the "+" operator that can be used to add two numbers or concatenate two strings. An example of method overloading is having two methods with the same name but different parameters. Please provide an example of how you have used operator or method overloading in your code and explain why you have chosen this method of coding.
The link does not have to be to your project and can be to your practice code.

### Operator/Method Overloading - answer
I have used method overloading [here](https://github.com/CueMaxX/java-selfstudy/blob/main/Advanced/constructors.java) through the use of constructors, which can be used to initiate an object in different ways depending on the given parameters during instantiation. In the provided code, this allows you to e.g. instantiate the Object "Machine" with no parameters at all, resulting in String name to be set to "default machine". However, when you hand over a string, that will be used as a name instead. When providing both a string and an integer, the string is still used for the name, and the integer is used for the machine's id.


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



### Generics
Generics in java are used to create classes, interfaces, and methods that operate on objects of specified types. Please provide an example of how you have used generics in your code and explain why you have chosen to use generics. The link does not have to be to your project and can be to your practice code.

### Generics - answer
None so far.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Class Libraries
Examples of class libraries in java are the Java Standard Library, JavaFX, Apache Commons, JUnit, Log4j, Jackson, Guava, Joda-Time, Hibernate, Spring, Maven, and many more. Please provide an example of how you have used a class library in your **project** code and explain why you have chosen to use this class library.

### Class Libraries - answer
None so far.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6           |                               |

### Multi-threading
multi-threading is the ability of a CPU to execute multiple processes or threads concurrently. Please explain the concept of multi-threading and provide an example of how you have used multi-threading in your code. The link does not have to be to your project and can be to your practice code.


### Multi-threading - answer
Multi-threading is an interesting concept where we have a parrallel way of code execution. When an operating system / kernel uses multithreading, it can assign a running process to a specific thread, allowing other processes to be executed in another thread. If the hosts CPU supports hardware multithreading (which most of them since, idk, maybe 2004, do...?) and the OS / kernel supports multithreading as well (support was even earlier I think), there is real parrallel code execution. That means that multiple processes can calculate stuff truly at the same time and not after each other (when using single-threading systems, e.g. an arduino maybe?).
<br> However, entire programs within the OS / kernel can also make use of multithreading. In this case, this must be specifically programmed -> when one tasks needs to wait for the input of another task anyways, it does not make sense to implement multithreading there. However, in resource-hungry applications like AAA-Games, video editing or AI training, it is highly useful to split up multiple tasks to different threads (and therefore even multiple cores on a CPU/GPU). 
<br> I have [fiddled](https://github.com/CueMaxX/java-selfstudy/blob/main/Expert/multithreading.java) a bit with multithreading in my practice code.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Lambda Expressions
An example of a lambda expression is the following code:
```java
List<String> list = new ArrayList<>();
list.forEach((String s) -> System.out.println(s));
```
Please explain the concept of lambda expressions and provide an example of how you have used lambda expressions in your code. The link does not have to be to your project and can be to your practice code.

### Lambda Expressions - answer
A Lambda expression is used in Java to express different instances to functional interfaces. They enable us to e.g. treat code as data.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|           6            |                               |


### Serialization

Serialization is the process of converting an object into a stream of bytes to store the object or transmit it to memory, a database, or a file. Please explain why you would use serialization and provide an example of how you have used serialization in your code. The link does not have to be to your project and can be to your practice code.


### Serialization - answer
Why to use serialization has been described pretty well already in the task description. When e.g. passing over multiple datasets through a URL, which is just one large string, I would use serialization. Also, we could use serialization when we want to store objects into a text file:  
```java
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Person implements Serializable {
  private String name;
  private int age;
  private String[] hobbies;

  public Person(String name, int age, String[] hobbies) {
    this.name = name;
    this.age = age;
    this.hobbies = hobbies;
  }
}

public class SerializePerson {
  public static void main(String[] args) {
    Person p1 = new Person("Jonny Depp", 30, {"sailing", "murdering"});
    try {
      FileOutputStream fileOut = new FileOutputStream("depp.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(p1);
      out.close();
      fileOut.close();
      System.out.println("Data serialized!");
    } catch (IOException i) {
      i.printStackTrace();
    }
  }
}
```

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6          |                               |


### Database Connectivity
Web applications use databases to store data. Please explain how you have connected to a database in your project and provide an example of how you have used database connectivity in your code. The link does not have to be to your project and can be to your practice code. Do not use code from other classes, like database programming, Web Engineering, or theoretical informatics.
This topic appeared in your learning agreement as the last point in the table under advanced topics.

### Database Connectivity - answer
None so far.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



