/* Program to implement package in java  */
import MathOperation.*;
/* we can also import packages like this...
 * import MathOperation.Addition;
 * import MathOperation.Subtraction;
 * import MathOperation.Division;
 * import MAthoperation.Multiplication;
 */
class Main{
    public static void main(String args[]){
        Addition a1 = new Addition();
        Subtraction b1 = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();
        int a = 10;
        int b = 20;
        System.out.println("Addition of 10 and 20 is = " + a1.add(a,b));
        System.out.println("Subtraction of 10 and 20 is = "+ b1.sub(a,b));
        System.out.println("Multiplication of 10 and 20 is = "+ m.mul(a,b));
        System.out.println("Division od 10 and 10 is = "+ d.div(a,b));

    }
}

