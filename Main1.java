/* Program to implement package in java */
// Now taking inpute from user
import MathOperation.*;     // Direct acces all packages from MathOpearation main Package using "*"
/* we can also import packages in another way...
import MathOpoeartion.Addition;
import MathOperation.Subtraction;
import Mathopeartion.Division;
import Mathoperation.Multiplication; */
import java.util.Scanner;
class Main1{
    public static void main(String args[]){
        Addition a1 = new Addition();
        Subtraction b1 = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();
        Scanner sc = new Scanner(System.in);
        System.out.print("Entr frst number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Addition of "+a+" and " +b+" is = " + a1.add(a,b));
        System.out.println("Subtraction of "+a+" and "+b+" is = "+ b1.sub(a,b));
        System.out.println("Multiplication of "+a+ " and "+b+ "is = "+ m.mul(a,b));
        System.out.println("Division of "+a+" and "+b+" is = "+ d.div(a,b));

        sc.close();
    }
}