# Chapter 1 - Self Test Questions
**What is bytecode and why is it important to Java's use for Internet programming?**

Bytecode is an optimized set of instructions for use by the JVM - it is machine independent and the specific implementation of the JVM for different hardware/OS implementations knows how to translate that bytecode efficiently to machine code for execution.

**What are the three main principles of object-oriented programming?**

1. **Encapsulation**: Bind together code and the data it manipulates, and that keeps both safe from outside interference and misuse.
2. **Polymorphism**: Allows one interface to access a general class of actions.
3. **Inheritance**: A process by which one object can acquire the properties of another object.

**Where do Java programs begin execution?**

In the static class function called `main` of the class which is being run in the JVM.

**What is a variable?**

It is a memory location to store information/data.

**Which of the following variable names is invalid?**

1. count
2. $count
3. count27
4. ~~67count~~

**How do you create a single-line comment? How do you create a multi-line comment?**

```java
// Single line comment

/*
    Multi-line comment
 */
```

**Show the general form of the `if` statement. Show the general form of the `for` loop.**

```java
if(condition){
    // Statement
}

for(initialization; condition; post-run increment/variable manipulation){
    // Statement
}
```

**How do you create a block of code?**

```java
{
    //block of code
}
```

**If you make a typing mistake when entering your program, what sort of error will result?**

Compile-time error

**Does it matter where on a line you put a statement?**

Indentation, and spacing doesn't matter.