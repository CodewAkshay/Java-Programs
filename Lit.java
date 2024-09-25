import java.util.Scanner;
class Lit{
    public static void main(String args[])
    {   
    System.out.println("Taking input from  user");
   try (Scanner sc = new Scanner(System.in)){
    System.out.print("Enter Number 1 = ");
    int a= sc.nextInt();
    System.out.print("Enter Number 2 = " );
    int b= sc.nextInt();
    int sum = a + b;
    System.out.println("Sum Off these Numbers  = "+sum);
    // sc.close(); // use this when you not use try block
    }
  }
}