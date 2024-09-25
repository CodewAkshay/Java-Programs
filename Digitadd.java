// Program for Sum of all digit

public class Digitadd{
    
// Program for Reverse number using do while loop

// public static void main(String args[]){
//     int n, rev, d;
//         n = 341;
//         rev = 0;
//         do {
//             d = n % 10;
//             rev = rev * 10 + d ;
//             n = n / 10 ;
//         } while (n != 0);
//         System.out.println("Reverse nmber is ="+rev);
//    }
// }

// Program for reverse number using While loop

public static void main(String args[]){
    int n , rev, d ;
    n = 432;
    rev = 0;
    while ( n != 0) {
            d = n % 10;
            rev = rev * 10 + d ;
            n = n / 10 ;
    }
    System.out.println("Reverse number is ="+rev);
}
}
