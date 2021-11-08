# Calculator Project

## Create a basic calculator using the Java skills you have learned so far.

# Overview
Modern computers are capable of an incredibly varied set of operations and behaviors, from analyzing data to playing movies to supporting complex three-dimensional games.  At the core of all these programs, however, is the central talent of computers—processing data and performing mathematical operations.  We will utilize this basic skill to implement a calculator program that will perform a variety of real-number operations.

# Details
Behavior
 - `Main()`: 
 ```
 Your program should begin by welcoming the user to the program (in main()).

A template .java file is provided that has main, startCalc, testCalc, and calculate() methods. 
You will start with this template. 
You can then modify main() by commenting out startCalc() if you want the app to run all test cases, 
or comment out testCalc() (and uncomment startCalc) if you want to run an interactive calculator in the console. You don't need to understand how the code in testCalc() works – just know that it tests your calculate() method with lots of different expressions.
 ```
 
 - Driver Loop method - `startCalc()`
```
When main() calls startCalc(), it contains a “driver loop” that executes the various steps of the program repeatedly until the user chooses to exit (a sentinel value is entered like "quit"). 

Your driver loop inside startCalc() will operate as follows:

Ask for an expression (see “Expressions” and “Operations” below).
Get the expression, and call calculate: String answer = calculate(expression);
Look at the answer (could be "quit", "ERROR", or the answer)
print out appropriate text based on the above 3 options from calculate()
Go back to step 1 for next expression, or stop if "quit"
Make sure your code here is concise (probably around 10-15 lines of code), meaning that you're mostly making a bunch of method calls like:

String input = getInput();
```

 - `calculate(String Expression) Method`
```
The calculate(String expression) method MUST return a String that contains one of the following:

"quit" if the user entered any form of quit
"ERROR" if there are any errors in the expression entered
"5.2" (or the actual result) if the expression is valid, return the actual answer
 

The calculate (String expression) method should should ignore case when checking the expression 
(i.e. “quit,” “QUIT,” “Quit,” and “qUiT” should all end the program).
```

```
A test case file (problems.txt) is also provided. This file needs to be downloaded from the Google drive, then copied or moved to the folder:

        C:\Users\[username]\ideaproject\[project_name]

When you call the testCalc() method from main, a variety of expressions are loaded from the problems.
txt file and tested against the calculate() method that you write code for. Open the problems.txt file to see all of the types of expressions you are expected to handle, along with their expected results.
```

```
The calculate method should also call other methods to accomplish its work (procedural decomposition). 
Examples would be calling a method twoOperation or threeOperation to calculate the answer based on the 
number of tokens. You may add other methods as well, but it's not necessary to add a method for 
each math operation – i.e., add(), subtract(), etc.

Expressions
A valid expression for the calculator is either:

A one-operand operator followed by a number, or
A number, then a two-operand operator, then another number
In both cases, the entire expression should be typed as one line, and 
each part of the expression (number or operator) should be separated from the others by spaces.  
Any real number (positive or negative, integer or not) is valid and should be accepted. 
Anything input not properly formatted should produce an error denoted by the result "ERROR".
```
# Operations

 - Operations
Your calculator must support the following operations:

 - Two-operand: Addition (+), Subtraction (-), Multiplication (*), Division (/), Modulus (%) and Exponentiation (^)
One-operand: Absolute Value (|), Square Root (v), Round to closest integer (~), Sine (s), Cosine (c), and Tangent 
- (t). For sine, cosine, and tangent, the operand is in radians.
Regardless of how numbers are entered (as ints or doubles), the values are treated as doubles, and results will always be shown (and tested) as doubles. Thus 1 / 3 is, in this case, going to be: 0.3333333333333333

 - Implementation Details

 - Your startCalc() method should contain only the driver loop for your program. You should use procedural decomposition to break the other parts of your program into appropriate methods to reduce redundancy and to make your code more readable/organized.  
 
 - Remember that startCalc() should be a concise summary of the program’s behavior (mostly just a loop with various/appropriate method calls). After startCalc() collects input from the user, it needs to send that information to the calculate() method, which takes a single String as a parameter, and returns a string with any of the following:

 - the answer, i.e., "5.0" if the expression was "3 + 2"
 - "ERROR" if there is any error in the expression
 - "quit" if the expression was "quit" in ANY form of capitalization
 - 
 Since expressions will be typed entirely on one line, you will need to be able to parse the user's input for tokens.

 - You must use a Scanner for this.  You cannot use arrays and the split method.

 - You may need to use more than one instance of Scanner to fully parse the input. Experiment with .hasNext, .hasNextInt, .hasNextDouble, and the associated .next, .nextInt, and .nextDouble.  You should probably have 2 projects – one for the official project, and one to "try out" pieces of code to see how things work.

 

 - You also need to detect and issue error messages for invalid input – you should handle all cases of invalid input, and should test out and validate giving the program lots of types of bad input. Errors should return "ERROR" from the calculate() method. You can do this with if statements, or if you're feeling bold, investigate try-catch;
 - 
 Extras
If you finish early, or want a deeper challenge, start by implementing additional features beyond those that are required. Possible extra features include (but are not limited to):

Adding additional operations
Handling multiple operations at once (e.g 3 + 4 * 5)
More extra credit for doing this and respecting order of operations!
Handling fractions as numbers:
Fractions are entered as: 1_3/4
Fractions are converted to real numbers
More credit if you can keep fraction notation (an option) and output the result as a fraction. Perhaps if the first character is an “f” then return result as a fraction (assuming no real numbers such as 3.14 were entered anywhere)
Creating a Reverse Polish Notation (RPN) calculator that accepts an arbitrary number of operands and operators. This notation does not require parentheses. Note that it must still perform the requirements listed above, but in another way. It will require research and the use of some advanced (HL) concepts, and will be a big challenge, but will also be very interesting and rewarding should you choose to take it on.
Describe extra features that you add in comments at the top of your file.

 - Required Checkpoints
 - Create two flowcharts:
 - One for the main driver loop (simpler, described above, probably about 10 blocks). At some point this calls calculate(String expression), checks the return value (an answer, "ERROR", or "quit") and does the appropriate action.
 - Another, detailed flow for how the calculate(String expression) works.

 Review the PowerPoint titled Flowcharting.PPTX for guidelines.  Get your flowcharts signed off before doing ANY coding.

 

Be able to parse the input and echo the operand(s) and operator back to the console separately. Get signed off from Parker or a mentor before proceeding.
Sample Execution Log

Although not shown above, you will lose points for not handling bad input. Consider all of the possible ways a user could enter data that would make your code break, and add code to handle showing an error instead of crashing.

 

You must also add comments your code! Check the rubric!

