/* Program to calculate sum using function */
import java.util.*;
class Functions{
    public static int calculateSum(int a,int b ){
        int sum = a + b ;
        return sum;
    }
}
class Fsum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int sum = Functions.calculateSum(a, b);
        System.out.println("Sum = "+sum );
        sc.close();
    }
}

// /* Program to calculate square using function */
// import java.util.*;
// class Function{
//     public static int calculateSquare(int a){
//         int sq = a * a ;
//         return sq ;
//     }
// }
// class Fsum{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any number : ");
//         int a = sc.nextInt();
//         int sq = Function.calculateSquare(a);
//         System.out.println("Swuare of "+ a + " is = "+sq);
//         sc.close();
//     }
// }

// /*Program to calculate Cube using function */
// import java.util.*;
// class Function{
//     public static int calculateCube(int a){
//         int cube = a * a * a ;
//         return cube;
//     }
// }
// class Fsum{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number to calculate cube : ");
//         int a = sc.nextInt();
//         int cube = Function.calculateCube(a);
//         System.out.println("Cube of "+a+" is = "+cube);
//         sc.close();
//     }
// }

// /* Program to calculate Square ,cube using function */
// import java.util.*;
// class Function{
//     public static int CalculateSquare(int a){
//         int sq = a * a;
//         return sq;
//     }
//     public static int calculateCube(int a ){
//         int cube = a * a * a ;
//         return cube;
//     }
// }
// class Fsum{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number to calculate cube and square : ");
//         int a = sc.nextInt();
//         int sq = Function.CalculateSquare(a);
//         System.out.println("Suare of "+a+" is = "+sq);
//         int cube = Function.calculateCube(a);
//         System.out.println("Cube of "+a+" is = "+cube);
//         sc.close();
//     }
// }