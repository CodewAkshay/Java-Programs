// // Program to implement Defaulat Exception Handling
// public class HaException {
//     public static void main(String args[]){
//         int a,b,c;
//         a = 10;
//         b = 0;
//         System.out.println("Before exception:");
//         c = a/b;
//         System.out.println("Division = "+c);
        
//     }
// }

// // Program to implement User Exception Handaling using try,catch,finnaly block
// public class HaException {
//     public static void main(String args[]){
//         try{
//             int a,b,c;
//             a = 10;
//             b = 0;
//             System.out.println("Before exception:");
//             c = a/b;
//             System.out.println("Division = "+c);
//         }
//         catch(Exception obj){
//             System.out.println("Exception occur : "+obj);
//         }
//         finally{
//             System.out.println("Program run normally:");
//         }
        
//     }
// }

// Program to implement User Exception Handaling using try,catch,finnaly blockand Provinding solution
public class HaException {
    public static void main(String args[]){
        try{
            int a,b,c;
            a = 10;
            b = 0;
            System.out.println("Before exception:");
            c = a/b;
            System.out.println("Division = "+c);
        }
        catch(Exception obj){
            System.out.println("Exception occur : "+obj);
        }
        finally{
            System.out.println("Program run normally:");
        }
        
    }
}

