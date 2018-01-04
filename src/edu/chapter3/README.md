# Chapter 3 - Self Test Questions

**Show the general form of the if-else-if ladder.**

```java
if(condition){
    //Statement
}else if(condition){
    //Statement
}else{
    //Statement
}
```

**Given the following sample to what `if` does the last `else` associate?**

```java
if(x < 10){
  if(y > 100){
    if(!done) x = z;
    else y = z;
  }
else System.out.println("error");
```

To the second if statement.

**Show the for statement for a loop that counts from 1000 to 0 by -2.**

```java
for(int i = 1000; i >= 0; i -= 2){
    System.out.println(Integer.toString(i));
}
```

**Is the following fragment valid?**

```java
for(int i = 0; i < num; i++)
    sum += i;

count = i;
```

No, i is not known outside of the **for** loop in which it is declared.

**Explain what break does. Be sure to explain to both of its forms.**

A break without a label causes termination of its immediately enclosing loop or switch statement. A break with a label causes control to transfer to the end of the labeled block.

**In the following fragment, after the break statement executes, what is displayed?**

```java
for(i = 0; i < 10; i++){
  while(running){
    if(x<y) break;
  }
  System.out.println("after while");
}
System.out.println("after for");
```

After **break** executes, "after while" displayed.

**What does the following fragment print?**

```java
for(int i = 0; i < 10; i++){
  System.out.println(i + " ");
  if((i%2) == 0) continue;
  System.out.println();
}

/* Output
0 1 
2 3
4 5
6 7
8 9
*/
```

**What is an infinite loop?**

A loop which does not have a condition which will satisfy to false, so it will continue indefinitely (e.g. `while(true)` or `for(;;)`)

**When using `break` with a label, must the label be on a block that contains the `break`?**

Yes