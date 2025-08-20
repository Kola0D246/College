# Java Class

Java is an object-oriented language. It means that the entire code written in *.java* file is to be held inside a Java class.
The name of source code file (without .java extension) must be same as the name of the class that it contains.

**Example:**

```java
public class MyFirstClass{

}
```

Here,

1. `public` -> see [class modifier](./Java%20modifier.md)
2. `class` -> keyword for declaring class name
3. `MyFirstClass` -> name of our class
4. `{ }` -> Enclose the block of code inside our class

## Naming Convintions for a Java class

**Rules:**

1. A class name can only contain letters, numbers, underscore (_) and dollar sign ($).
2. It should not start with numbers
3. A class name is case sensitive
4. It must not be a Java keyword
5. The name of source code file (before .java extension) must be same as the name of the public class (topmost class) that it contains.

**Best Practices:**

6. A class name should use PascalCase in which first letter of every word is capital and there is no underscores between words
7. Class name should be short but descriptive about purpose of class
8. Use abbreviation only when they are universally understood
9. Although, rule 5 is not applicable if topmost class is a non-public type, its best practice as we do not need to open a file to know what class is written in it

## Complete SYNTAX:

```java
[modifiers] class ClassName [extends SuperclassName] [implements InterfaceName1, InterfaceName2, ...] {
    // Fields (variables)
    [modifiers] dataType fieldName;

    // Constructors
    [modifiers] ClassName(parameters) {
        // Constructor body
    }

    // Methods
    [modifiers] returnType methodName(parameters) {
        // Method body
    }
}
```

Here,

1. [...] - optional code
2. { } - enclose a block of code for a class/ sub class
3. ; - Mark end of Java statement (a line of code)
4. `[modifiers] class ClassName` -> This is class declaration line. It contains:
    1. [modifier] -> These are keyword that define class's visibility, behavior, or features:

    2. `class ClassName`

5. `[extends SuperclassName]` -> This is inheritance
6. `[implements Interface1, Interface2, ...]` ->
7. `[modifiers] Fields (Variables)` ->
    1. [modifier] ->

    2.
