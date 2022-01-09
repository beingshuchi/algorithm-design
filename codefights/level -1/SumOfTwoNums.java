/**
Write a function that returns the sum of two numbers.

Example

For param1 = 1 and param2 = 2, the output should be
solution(param1, param2) = 3.

Input/Output

[execution time limit] 3 seconds (java)

[input] integer param1

Guaranteed constraints:
-1000 ≤ param1 ≤ 1000.

[input] integer param2

Guaranteed constraints:
-1000 ≤ param2 ≤ 1000.

[output] integer

The sum of the two inputs.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}


*/

public class SumOfTwoNums{
	int solution(int param1, int param2) {
        return param1 + param2;
    }
 }