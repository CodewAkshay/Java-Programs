import java.util.*;
public class Condition {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){

        //**** Chacking Adult or not adult*****

        // System.out.print("Enter Your age:");
        // int age =sc.nextInt();
    // if(age>18){
    //         System.out.println("Your are adult");
    //     }
    //     else{
    //         System.out.println("Your are not adult");
    //     }

    // *** For Checking Number is even Or Odd*****

    // System.out.print("Enter any number:");
    // int X =sc.nextInt();
    // if(X%2==0){
    //     System.out.println("Number is Even");
    // }
    // else{
    //     System.out.println("Number is odd");
    //}

    // *** Using if else Greater or Equal to Each other ****

    // System.out.print("Enter First Number number:");
    // int a =sc.nextInt();
    // System.out.print("Enter Second number number:");
    // int b =sc.nextInt();
    // if(a==b){
    //     System.out.println("Numbers are Equal to each other");
    // }
    // else{
    //     if(a>b){
    //         System.out.println("a is greater than b");
    //     }
    //     else{
    //     System.out.println("b is grater than a");
    //     }
    // }
    // ******same code using else if*******
    
    System.out.print("Enter First Number number:");
    int a =sc.nextInt();
    System.out.print("Enter Second number number:");
    int b =sc.nextInt();
    if(a==b){
        System.out.println("Numbers are Equal to each other");
    }
    else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
        System.out.println("b is grater than a");
        }    
 }
    
}
}