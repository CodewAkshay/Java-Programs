public class Patterns{
    // Program to print Solid square in java

    // public static void main(String args[]){
    
    //     for(int i=1;i<=4;i++){
    //         for(int j = 1; j<=4;j++){
    //             System.out.print("*");
    //         }
    //     System.out.println("*");
    //     }
    // }

    // Program to print hollow square in java
    public static void main(String args[]){
        int m,n;
        m=4;
        n=5;
        for(int i = 1; i<= m; i++){
            for(int j = 1; j<= n; j++){
                if(i == 1 || j == 1 || i == m || j == n){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
