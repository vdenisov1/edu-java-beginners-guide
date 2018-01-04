# Chapter 2 - Self Test Questions

**Why does Java strictly specify the range and behavior of its primitive types?**

Java strictly specifies a range and behavior for each primitive type, which all implementations of the Java Virtual Machine must support because of **Java's Portability Requirement**.

**What is Java's character type, and how does it differ from the character type used by some other programming languages?**

Java characters are not **8-bit quantities like** they are in many other computer languages. Instead, Java uses **Unicode**. Unicode defines a character set that can represent all of the characters found in all human languages. In Java, **char** is an unsigned **16-bit type** having a range of 0 to 65,536.

**A boolean value can have any value you like because any non-zero value is true. True or False?**

**False**. The value can only be **true** or **false** (or a conditional statement that results in such).

**Given this output, using a single string, show the `println` statement that produced it.**

```java
/* OUTPUT:
    One
    Two
    Three
 */
 
 System.out.println("One\nTwo\nThree");
```

**What is wrong with this fragment?**

```java
for(i = 0; i < 10; i++){
    int sum;
    sum = sum + i;
}

System.out.println("Sum is: " + sum);
```

1. Sum is created on each for loop block and destroyed after. It is also not initialized so adding to it can produce unexpected results.
2. Sum is not known outside the for loop so it will not be able to be printed.

**Explain the difference between the prefix and postfix forms of the increment operator.**

The prefix form (++i) **first, increments** the variable i and then returns the result. The postfix (i++) **first, returns** the value of i and then increments it.

**Show how a short-circuit AND can be used to prevent a divide-by-zero error.**

```java
if(x != 0 && y/x == 12){
    // Statement
}
```

**In an expression, what type are byte and short promoted to?**

**Byte** and **short** are promoted to **int**.

**In general, when is a cast needed?**

When doing assignments or operations with mixed type variables. The small capacity types need to be casted up to the higher capacity types in the operations.

**Does the use of redundant parentheses affect program performance?**

No

**Does a block define a scope?**

Yes