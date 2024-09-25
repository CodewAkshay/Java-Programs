import java.util.*;
//Or u can also write this 
//import java.util.scanner;
public class Add1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum of given two numbers is : "+sum);
        sc.close();
    }
}

