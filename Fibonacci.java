/* writee a Program in java to print Fibonacci sseries using Function */
import java.util.*;
class Function{
	public void fSeries(int num){
	int firstTerm = 0;
	int secondTerm = 1;
	for(int i = 0; i <= num; ++i){
		System.out.println(firstTerm + " ");
		int nextTerm = firstTerm + secondTerm;
		firstTerm = secondTerm ;
		secondTerm = nextTerm ;
		}
	}
}
class Fibonacci{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number to Fibonacci Series : ");
	int num = sc.nextInt();
	
	Function f1 = new Function();
	f1.fSeries(num);
	sc.close();
	}
}

// Save : Fibonacci.java
// Compile : javac Fibonacci.java
// Run : java Fibonacci