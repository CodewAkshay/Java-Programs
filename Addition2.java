// import java.util.*;
// class Addition2{
//     public static void main(String args[]){
//         int n ,cube;
//         Scanner s = new Scanner (System.in);
//         System.out.print("Enter any number : ");
//         n = s.nextInt();
//         cube = n * n * n ;
//         System.out.print("Cube = "+cube);
//     }
// }

import java.util.*;
class Addition2{
    public static void main(String args[]){
       int n ,m ,mul;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter any number : ");
        n = s.nextInt();
        System.out.print("Enter second number :");
        m = s.nextInt();
        mul = n * m ;
        System.out.print("Multiplication = "+mul);
        s.close();
    }
}