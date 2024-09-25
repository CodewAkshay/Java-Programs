public class Square {
    public static void main(String args[]){
        int i,sum,sq;
        sum = 0;
        for(i=1;i<=5;i++){
            sq= i*i;
            System.out.println(sq);
            sum=sum+sq;

        }
        System.out.println("Sum of Sqare is = " + sum);
    }
}