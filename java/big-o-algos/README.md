# Big O and Algorithms - Mon Jan 25, 2021

## What is Big O?

Big O refers to Big O Notation. It is the languge programmers use to desribe an algorithm's time-space complexity.

## How do we use it? 

We take an operation and factor it into the notation. For example, 

### The Worst Case Scenario

No matter the amount of operations and constants in your Big O, you will always want to simplify down to the worst case scenario!

### Visualization
https://www.bigocheatsheet.com/

### Caveats

Keep in mind that you can fall victim to over-optimization, wasting time and effort due to attempting to calculate Big Os and accounting for them. 

## Definitions 

- runtime - the phase describing a program lifecycle
- algorithm - set of rules to complete a process
- Big O Notation
- Space Complexity - the amount of space the algorithm takes in memory
- Time Complexity - the amount of time the algorithm takes to complete

## etc.. 

### Yusuf provided explainers:
```
Lets say  O is a constant time like O = 1 second and n is how many methods are in your code (operations) . Lets say we have 2 methods right now so n = 2 and O = 1 sec 

O(n) =  1 sec(2) = 2 sec to complete 

O(1)  =  1(1) = 1 sec  to complete

O(log n)  = 1(log 2) = 0.30102999566 sec to complete  <----this is for binary trees 

O(n log n) = 1( 2 log 2) = 0.60205999132 sec to complete  to complete

O(2^n)  = 1 (2 ^ 2) = 4 sec to complete <-- 2 is a constant and will only be exponents of 2 .....   ex) 1( 2 ^(3)) =8 sec   <--if we had 3 methods

O(n^2)  = 1( 2^ 2) = 4 sec to complete  <-- this would get larger  than the previous Big O over time  .... ex)  1(3)^2)  = 9 sec <-if we had 3 methods

O(n!) = 1( 2!) = 2 <--- factorial very large over time  ex) 1 ( 10!) = 3628800 sec to complete <-- stay away from these ( infinite loops )
```


```
BIG O NOTATION -->	EXAMPLE ALGORITHM
O(log n) --->	Binary search
O(n)	---->Simple search
O(n * log n)->	Quicksort
O(n2)	---->Selection sort
O(n!)	--->Traveling salesperson
```

### Links

https://www.explainxkcd.com/wiki/index.php/1667:_Algorithms
https://www.baeldung.com/java-algorithm-complexity
https://visualgo.net/bn/sorting?slide=1