# java
Java learning platform
Java is a Object-oriented, robust, high level, platform independent and Secure Programming language

Java is Programming language and Platform also
Platform means any hardware or software which is used to run a program
as Java has JRE and API it is a Platform

Java is used in Desktop applications, Web applications , Mobile Applications , Gamming, Robotics etc

Types of Java Applications:
	1. Standalone application: which is Desktop based or Windows based application
	2. Web application: Runs on server side and helps to generate Dynamic web pages, the Java concepts used here is servlet, JSP, spring etc 
	3. Enterprise applications: This is used in the distributed area like banking , which helps in load balancing , high - level security and clustering, java EJB is used here.
	4. Mobile applications: which is used to run on mobile devices
	

Java platforms/Editions:

	1. Java SE(Standard Edition): This is a Java programming language that included  API's such as Java.lang, java.io,java.net,java.sql, java.math, java.util etc, this has concepts such as OOPS, regex, exceptions, multi threading, strings, , AWT , I/O Streams etc
	2. Java EE(Enterprise Edition): This is used  in enterprise level , used to develop Web and Enterprise based applications. This is built on top of Java SE, this has servlet, EJB, JSP , web Services etc
	3. Java ME: Micro platform for Mobile applications
	4. Java FX: used to develop the Light weight API's
	


Features Of Java:

	1. Simple: Java is a easy language , it has a simple, clean and easy to learn syntax
		a. In Java many rarely used features are removed such as Explicit pointer, operator overloading
		b. In Java we need not clean unreferred objects since it has Automatic garbage collector.
	2. Object-Oriented: Mostly every thing in Java is a Object, so use of Java means we can incorporate both behaviour and data in a single objects, Some of the object oriented basic concepts are
		a. Object
		b. Class
		c. Polymorphism
		d. Abstraction
		e. Interface
		f. Encapsulation
		g. Inheritance
	3. Platform independent: Java is a platform independent programming language since Once java is complied and converted to byte code we can run on any OS as we have JVM(Java virtual machine) on each OS like Linux, windows and Mac. Java allows write once and run any where.
	4. Secured: Java is secured since it has no Explicit pointer and There is a separate virtual machine called JVM used to run the java code. In JVM we have class loader, byte code verifier and Security(used to check if class has rights to access that part of the resources)
	5. Robust: Java is a robust/strong programming language since it is not have explicit pointer, garbage collection, and due to exception handling and type checking mechanism.
	6. Architectural neutral: since this is not having a dependent feature
	7. Portable : since this java facilitates to byte code to carry to any platform since it is platform independent.
	8. High-performance: Since the interpreting the byte code will be close to Navi code but not as fast as C/C++.
	9. Distributed: because it facilitates in distributed systems using EJB and RMI.
	10. Multi thread: Thread is used to run a java program, Java facilitates to run multiple java programmes
	11. Dynamic It supports dynamic loading of classes


Java Simple Program:

Class Simple{
	Public static void main(Strings args[]){
		System.out.println("Hello World!"); //output is Hello World!
	}
}

Above file is saved as Simple.java

To compile: javac Simple.java
To Execute:  java Simple

Keywords used in above program:

	1. Class: Used to declare a class in java
	2. Public: A access modifier which represents visibility, public means visible to all
	3. Static:  if any variable, method is declared as static, then there is no instance or object to be need to use that method or variable, static means it belongs to class rather than instance/object
	4. Main: starting point of the java program.
	5. String args[]: used for the command line arguments.
	6. System.out.println:  used for the print statements.

Internals of Java Program:

1.During the compile time the Java code is converted to byte code


	Simple.java



2.During the Run time:






Q1: Can we have different class name and File name?
Ans. Yes but we have to use following command to compile and execute the java program
	javac Hard.java
	java Simple.class
	


JVM, JRE and JDK:

	1. JVM: Java Virtual machine is a virtual machine(Which does not exists physically) provides a runtime environment in which the Java byte code is executed. JVM provides following
		a. Loads the code
		b. Checks the code
		c. Executes the code
		d. Provides Run TIme Environment
		
	2. JRE:  Java Run time environment is a set of software tools which is used in developing the Java application. This provides the runtime environment . JRE physically exists, JRE is the implementation of JVM. JRE contains set of libraries and other files which are used by JVM during run time.
		a. JRE ---> JVM + Set of libraries
	
	3. JDK: Java Development Kit this contains JRE + development tools. This can be released by many companies.



	


 Heap memory: A Run time data area where objects are stored
Stack: Holds variables and partial results, this plays a important role in method invocation and return

Java Variable:
Variable is a container which hold a value when java program is executed.

Types of variable based on access:
	1. Local variable: this variable can be accessed in the method where it is declared 
	2. Instance variable: This variable will be related to the Instance that is created 
	3. Static variable : this variable is declared using static variable and belongs to class.


Data types of the variable:

There are two types of data types in Java
	1. Primitive data type: Boolean, byte, char, int, float long, double, short
	Type	Default value 	Size	Range
	Boolean	False	1 bit	True/false
	Char	'/u000'	2byte	/u0000 to /uffff
	Byte	0	1 byte	-127 to 128
	Short	0	2 bytes	-32768 to 32767
	Int	0	4 bytes	2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
	Long	0L	8 bytes	-9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
	Float	0.0f	4bytes	32 bit floating number
	Double	0.0d	bytes	64 bit floating number
	2. Non- primitive data type : classes, arrays , string etc
	

Operators:

	1. Unary operator:
		a. Prefix: ++a, --a
		b. Postfix: a++,a--
	Example Program:
		Class Simple{
			Public static void main(String args[]){
				Int a=10;
				System.out.println(a++);//output=10, x=11
				System.out.println(a--);//output=11, x=10
				System.out.println(++a);//output=11,x=11
				System.out.println(--a);//output=10,x=10
			
			}
		
		}
	2. Arithmetic operator: Addition(+), subtraction(-), Multiplication(*), division(/), Remainder(%)
	3. Java shift operator: 

		1. abstract: Java abstract keyword is used to declare an abstract class. An abstract class can provide the implementation of the interface. It can have abstract and non-abstract methods.
	
	2. boolean: Java boolean keyword is used to declare a variable as a boolean type. It can hold True and False values only.
	3. break: Java break keyword is used to break the loop or switch statement. It breaks the current flow of the program at specified conditions.
	4. byte: Java byte keyword is used to declare a variable that can hold 8-bit data values.
	5. case: Java case keyword is used with the switch statements to mark blocks of text.
	6. catch: Java catch keyword is used to catch the exceptions generated by try statements. It must be used after the try block only.
	7. char: Java char keyword is used to declare a variable that can hold unsigned 16-bit Unicode characters
	8. class: Java class keyword is used to declare a class.
	9. continue: Java continue keyword is used to continue the loop. It continues the current flow of the program and skips the remaining code at the specified condition.
	10. default: Java default keyword is used to specify the default block of code in a switch statement.
	11. do: Java do keyword is used in the control statement to declare a loop. It can iterate a part of the program several times.
	12. double: Java double keyword is used to declare a variable that can hold 64-bit floating-point number.
	13. else: Java else keyword is used to indicate the alternative branches in an if statement.
	14. enum: Java enum keyword is used to define a fixed set of constants. Enum constructors are always private or default.
	15. extends: Java extends keyword is used to indicate that a class is derived from another class or interface.
	16. final: Java final keyword is used to indicate that a variable holds a constant value. It is used with a variable. It is used to restrict the user from updating the value of the variable.
	17. finally: Java finally keyword indicates a block of code in a try-catch structure. This block is always executed whether an exception is handled or not.
	18. float: Java float keyword is used to declare a variable that can hold a 32-bit floating-point number.
	19. for: Java for keyword is used to start a for loop. It is used to execute a set of instructions/functions repeatedly when some condition becomes true. If the number of iteration is fixed, it is recommended to use for loop.
	20. if: Java if keyword tests the condition. It executes the if block if the condition is true.
	21. implements: Java implements keyword is used to implement an interface.
	22. import: Java import keyword makes classes and interfaces available and accessible to the current source code.
	23. instanceof: Java instanceof keyword is used to test whether the object is an instance of the specified class or implements an interface.
	24. int: Java int keyword is used to declare a variable that can hold a 32-bit signed integer.
	25. interface: Java interface keyword is used to declare an interface. It can have only abstract methods.
	26. long: Java long keyword is used to declare a variable that can hold a 64-bit integer.
	27. native: Java native keyword is used to specify that a method is implemented in native code using JNI (Java Native Interface).
	28. new: Java new keyword is used to create new objects.
	29. null: Java null keyword is used to indicate that a reference does not refer to anything. It removes the garbage value.
	30. package: Java package keyword is used to declare a Java package that includes the classes.
	31. private: Java private keyword is an access modifier. It is used to indicate that a method or variable may be accessed only in the class in which it is declared.
	32. protected: Java protected keyword is an access modifier. It can be accessible within the package and outside the package but through inheritance only. It can't be applied with the class.
	33. public: Java public keyword is an access modifier. It is used to indicate that an item is accessible anywhere. It has the widest scope among all other modifiers.
	34. return: Java return keyword is used to return from a method when its execution is complete.
	35. short: Java short keyword is used to declare a variable that can hold a 16-bit integer.
	36. static: Java static keyword is used to indicate that a variable or method is a class method. The static keyword in Java is mainly used for memory management.
	37. strictfp: Java strictfp is used to restrict the floating-point calculations to ensure portability.
	38. super: Java super keyword is a reference variable that is used to refer to parent class objects. It can be used to invoke the immediate parent class method.
	39. switch: The Java switch keyword contains a switch statement that executes code based on test value. The switch statement tests the equality of a variable against multiple values.
	40. synchronized: Java synchronized keyword is used to specify the critical sections or methods in multithreaded code.
	41. this: Java this keyword can be used to refer the current object in a method or constructor.
	42. throw: The Java throw keyword is used to explicitly throw an exception. The throw keyword is mainly used to throw custom exceptions. It is followed by an instance.
	43. throws: The Java throws keyword is used to declare an exception. Checked exceptions can be propagated with throws.
	44. transient: Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.
	45. try: Java try keyword is used to start a block of code that will be tested for exceptions. The try block must be followed by either catch or finally block.
	46. void: Java void keyword is used to specify that a method does not have a return value.
	47. volatile: Java volatile keyword is used to indicate that a variable may change asynchronously.
	48. while: Java while keyword is used to start a while loop. This loop iterates a part of the program several times. If the number of iteration is not fixed, it is recommended to use the while loop.


Java Compiler will execute the code from top to bottom, so we have the control statements in java to control the flow of the code

Types of control statements:
	1. Conditional statements
		a. If statements  this is a conditional statement, the flow is controlled based on a specific condition
			i. Simple if: means if condition is satisfied then the code inside the if condition is execute or else the code inside is not execute
			ii. If- else: Same as simple if, but if the condition is not satisfied else code will be execute
		b. Switch statements
			public class SwitchExample {  
			public static void main(String[] args) {  
			    //Declaring a variable for switch expression  
			    int number=20;  
			    //Switch expression  
			    switch(number){  
			    //Case statements  
			    case 10: System.out.println("10");  
			    break;  
			    case 20: System.out.println("20");  
			    break;  
			    case 30: System.out.println("30");  
			    break;  
			    //Default case statement  
			    default:System.out.println("Not in 10, 20 or 30");  
			    }  
			}  
			}  
			
	2. Loop Statements
		a. For : For loop is used to execute a code several times if the number of iterations are fixed.
		b. While: While loop is used to execute the code several time if the number of iterations are not fixed.
		c. Do-while: same as while loop but the condition is checked as end on each loop, so that first loop is executed.
		d. For-each: The for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.
	3. Jump statements
		a. Break : is used to terminate any loop , when break is encountered
		b. Continue : used to skip the current iteration


