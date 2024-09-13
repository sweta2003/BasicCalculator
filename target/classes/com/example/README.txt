ASSUMPTIONS
1. Chaining of operations is allowed only 5 times
2. Only 4  operations are allowed, (+,-,*,/).

------------------------------------------------------
FOLLOWING QUESTIONS HAVE BEEN ANSWERED

1. HOW TO RUN THE APPLICATION - EXAMPLE.
2. HOW TO THE CHAINING OF OPERATION - EXAMPLE
------------------------------------------------------


1. HOW TO RUN THE APPLICATION - EXAMPLE.

sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ javac com/example/App.java 
sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ java com/example/App.java 
Enter the numbers:
1
2
Enter the operator (+,-,*,/):
+
1.0 + 2.0 = 3.0
Do you want to do operator chaining? Enter (Y or N)
N
You entered N. Thanks for using the Calculator!
The final result:
result --> 3.0
sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ 


2. HOW TO THE CHAINING OF OPERATION - EXAMPLE

sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ javac com/example/App.java 
sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ java com/example/App.java 
Enter the numbers:
1
2
Enter the operator (+,-,*,/):
*
1.0 * 2.0 = 2.0
Do you want to do operator chaining? Enter (Y or N)
Y
Enter the number:
3
Enter the operator (+,-,*,/):
+
2.0 + 3.0 = 5.0
Do you want to do operator chaining? Enter (Y or N)
Y
Enter the number:
2
Enter the operator (+,-,*,/):
+
5.0 + 2.0 = 7.0
Do you want to do operator chaining? Enter (Y or N)
Y
Enter the number:
2
Enter the operator (+,-,*,/):
+
7.0 + 2.0 = 9.0
Do you want to do operator chaining? Enter (Y or N)
Y
Enter the number:
2
Enter the operator (+,-,*,/):
+
9.0 + 2.0 = 11.0
The final result:
result --> 11.0
sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ 


3. INVALID INPUT 

sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ javac com/example/App.java 
sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ java com/example/App.java 
Enter the numbers:
1
2
Enter the operator (+,-,*,/):
*
1.0 * 2.0 = 2.0
Do you want to do operator chaining? Enter (Y or N)
uu
You enter wrong input
Do you want to do operator chaining? Enter (Y or N)
N
You entered N. Thanks for using the Calculator!
The final result:
result --> 0.0
sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ ^C

-------------------------------------------------------------

sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ javac com/example/App.java 
sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ java com/example/App.java 
Enter the numbers:
ggg
Do you want to do operator chaining? Enter (Y or N)
You enter wrong input
Do you want to do operator chaining? Enter (Y or N)
Y
Enter the number:
hh
sweta2003@penguin:~/CalculatorApp/demo/src/main/java$ 
