/* Program to demonstrate Exception Hnadaling */
public class Ex_main{
    public static void main(String args[]){
    try{
    int []myNumber={1,2,3};
    System.out.println(myNumber[5]);
    }
    catch(Exception er){
    System.out.println("Something went wrong"+er);
    }
    }
    }
    
    // Save : Ex_main.java
    // Compile : javac Ex_main.java
    // Run : java Ex_main