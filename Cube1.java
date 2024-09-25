/* Program to calculate cube , input passing from command line */
class Cube1{
public static void main(String args[]){
	int n ,cub;
	String data = args[0];
	n = Integer.parseInt(data);
	cub = n * n * n;
	System.out.println("Cube of "+n+" is = "+cub);
	}
}

// Save : Cube1.java
// Compile : javac Cube1.java
// Run : java Cube1