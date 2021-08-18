
## Interview Question Lab Checklist



1. Ask clarifying questions
    *   Clarify inputs to function
2. Walk through an example
3. Think of edge cases
    *   Negative numbers
    *   Really large values
    *   Null
4. What is the most brute-force way of solving this? Even if it seems obvious, say it as a possibility
5. Describe approach as you would to a little cousin who does not know anything about computer science terms
6. Analyze how long it will take to run, how much information needs to be stored
7. Based off your description, identify keywords that hint what ds&a you should use in your implementation
8. Write Code
    *   Add comments describing what the code does
    *   Define method signature (what does it return? What are its inputs?)
    *   Handle edge cases
9. List test cases based off edge cases + example and walk through them


## Example

**Problem: **print every nth number from 1 to 100



1. Ask clarifying questions

    _Starting at 1 or at n? Inclusive of 100 or no? Is n an integer?_

2. Walk through an example

    _If n=10, I would print 1,11,21,31,41,51,61,71,81,91_

3. Think of edge cases

_What if n is negative or 0? What should happen? What if n>100?_



4. What is the most brute-force way of solving this? Even if it seems obvious, say it as a possibility and some downsides to it

    _Go through each number and keep count, after I hit n, print the number and restart the count. This would require looking at each number 1-100, so I think we can do better_

5. Describe approach as you would to a little cousin who does not know anything about computer science terms

    _Starting at a value of 1, I add n to the value and print it out until the new value is greater than 100_

6. Analyze runtime/spacetime

    _We would call our logic 100/n times. We are only storing a single value._

7. Based off your description, identify keywords that hint what ds&a you should use in your implementation

    _Starting at a value of 1 -> int i =1;_


    _Add n -> i+=n;_


    _Until ->while loop or for loop_


    _New value greater than 100 -> i>100 (note we will want the opposite of this in our while loop which is i&lt;=100)_

8. Write Code


```
// Prints out every nth number less than 100 starting at 1. 
Public static void printNthNumber(double n){
    // Handle edge cases. 
    if(n<=0){
        System.out.printLn("Invalid n: must be positive");
        Return;
    }
    int i =1; 
    while(i<=100){
        System.out.printLn(i);
        i+=n;
}
}
```


**Alternative Solution**


```
Public static void printNthNumber(Double n){
    if(n<=0){
        System.out.printLn("Invalid n: must be positive");
        Return;
    }
    for(int i=1;i<=100; i+=n){
    System.out.printLn(i);
    }
}

```



9. List test cases based off edge cases + example and walk through them

n=0, n=-10, n=100, n=99, n=25

Walkthrough for n=0:

This is caught by if n&lt;=0 and so prints the error and returns

Walkthrough for n=99:

Value i starts at 1, 1&lt;=100 so we enter the while loop and it gets printed out, then its new value is 1+99 which is 100. 100 is &lt;=100, so we print out 100, i becomes 100+99 which is 199 and not &lt;=100 so we exit our for loop. 


## Interview Question Lab Rubric (100 pts)



1. Ask clarifying questions (2 pts each, max 10 pts)
2. Walk through an example (5pts)
3. Think of edge cases (5 pts each, max 10 pts)
4. What is the most brute-force way of solving this? Even if it seems obvious, say it as a possibility (10 pts)
5. Describe approach as you would to a little cousin who does not know anything about computer science terms (10 pts)
6. Analyze how long it will take to run, how much information needs to be stored (10 pts)
7. Based off your description, identify keywords that hint what ds&a you should use in your implementation (5 pts)
8. Write Code (to be done individually, 30 pts) 
    *   Add comments describing what the code does
    *   Define method signature (what does it return? What are its inputs?)
    *   Handle edge cases
9. List test cases based off edge cases + example and walk through them or implement (5 pts each, max 10 pts)
