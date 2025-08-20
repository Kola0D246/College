# Compiling and Executing Java

To create and run a Java program -

1. Type the Java program for desired output in text editor. This is called Source code which human can understand, but computer can't.
    Extension -> *.java*

**COMPILATION:**

2. Compile the code using Java compiler. The compiler checks for any syntax error and if no error is found, it converts source code a binary or executable file.
    Extension -> *.class*
3. Java binary file contains byte codes corresponding to the source code. It is not directly executable by CPU; instead it run on *Java Virtual Machine (JVM)*.

**EXECUTION:**

4. JVM translate byte code into machine code specific to underlying operating system. This makes bytes code platform independent and allow same byte code to run on different operating systems.
5. CPU executes the machine code and produce intended output

Thus, running a Java program comprises three main steps:

1. Coding ==> Build Logic --> Write Code --> Modify as needed --> Save Source Code
2. Compiltion ==>  Java Source code --> Java Compiler --> Binary File
3. Execution ==>   Binary file --> JVM --> executable file specific to OS -> CPU -> Execute the program

In comparison, C executable file store machine codes which is directly executable by CPU. However, it is specific to the operating system it is compiled on and same executable file won't run on different operating system.

Since JVM execute code line by line (like an interpretor), **Java is both a compiled and an interpreted language**

## Steps of Execution of Java Code

 However if the source code span more than one file, we need to perform both actions separatly.

There are two ways to run Java program:

- By clicking on Run command in your Java IDE (Create a binary file of same name and execute it on IDE terminal)
- Create and run binary file using command line

1. Open the directory of your source code in terminal
2. Enter `javac <file name>.java`.
3. If there is an error in source code, the Java Compiler (javac) will notify for it
4. If no error is found, javac compile the source code to byte code and save it in binary file of same name and .class extension.
5. Enter `java <file name without extension>` to run that binary file on Terminal

For a single file source code, we can merge compilation and execution process together and execute the file directly. (for Java SE 11 or above).

1. Open the directory of your source code in terminal
2. Enter `java <file name>.java`
3. This, checks for error --> compile code into binary file if no error found --> run binary file on terminal

---

[Source](https://dev.java/learn/getting-started/#compiling)
