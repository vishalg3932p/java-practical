class Practical2
{
public static void main(String[] args) 
{

       int a = 10;//Initialization
       int b = 5;
       

        // Arithmetic Operators is defined as the operators that are used to perform mathematical operations on operands.
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition = " + (a + b));//15
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        // Relational Operators is defined as the operators that are used to compare two values. 
        // The result of a relational operator is always a boolean value (true or false).
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        // Logical Operators are used to perform logical operations on boolean values. 
        // They are used to combine multiple boolean expressions and return a single boolean result.
        boolean x = true;//default value for boolean data type is false, so we have to assign true or false value to boolean data type variable
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));// Logical or
        System.out.println("!x = " + (!x));

      
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

        // Assignment Operators are used to assign values to variables. 
        // They are used to perform an operation and assign the result to a variable in a single step.
        int c = 20;
        c += 5;
        System.out.println("\nAssignment Operator (c += 5): " + c);

        // Increment and Decrement Operators are used to increase or decrease the value of a variable by 1.
        int d = 10;//initialization of variable d with value 10
        System.out.println("\nIncrement and Decrement:");
        System.out.println("d++ = " + (d++));
        System.out.println("After d++ = " + d);
        System.out.println("--d = " + (--d));

        // Conditional (Ternary) Operator are used to evaluate a boolean expression and return one of two values based on the result of the expression.
        String result = (a > b) ? "a is greater" : "b is greater";
        //Ternary operator is a shorthand for if-else statement, 
        // it takes three operands: a condition, a result for true, and a result for false.
        System.out.println("\nTernary Operator:");
        System.out.println(result);
        
    }
}