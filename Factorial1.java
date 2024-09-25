/* Program to calculate Factorial ,number pass From command line */
class Factorial1{
public static void main(String args[]){
	int fact,num;
	fact = 1;
	String data = args[0];
	num = Integer.parseInt(data);  // parseInt is a method to convert string type data into interger data
	for(int i = 1; i <= num; i++){
		fact = fact * i ;
	}
	System.out.println("Factorial of "+num+" is = "+fact);
	}
}


// Save : Factorial1.java
// compile : javac Factorial1.java
// Run : java Factorial1 