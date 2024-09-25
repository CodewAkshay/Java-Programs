// // /* Program to print Fibonacci series */
// // class Fseries{
// //     public static void main(String args[]){
// //         int firstTerm = 0, secondTerm = 1;
// //         int num = 10;
// //         for(int i = 0; i <= num ; ++i){
// //             System.out.println(firstTerm +" ");
// //             int nextTerm = firstTerm + secondTerm;
// //             firstTerm = secondTerm;
// //             secondTerm = nextTerm;
// //         }
// //     }
// // }

// /* Program to print FibonacciSeries Using function */
// import java.util.*;
// class Function{
//     public void FibonacciSeries(int a){
//        int firstTerm = 0;
//        int secondTerm = 1;
//         for(int i = 0; i <= a; ++i){
//             System.out.println(firstTerm + " ");
//             int nextTerm = firstTerm + secondTerm;
//             firstTerm = secondTerm;
//             secondTerm = nextTerm;

//         }
//     }

//     }
// class Fseries{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number to Print Fibonacci series : ");
//         int a = sc.nextInt();
//         Function f1 = new Function();
//         f1.FibonacciSeries(a);
//         sc.close();
//     }
// }