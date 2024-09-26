/* program to print multiplication table in java */

class Table1{
    public static void main(String args[]){
        int row , column , y;
        System.out.println("Multiplaction table \n "); 
        row = 1;
        do{
            column = 1;
            do{
                y = row * column;
                System.out.print(" " + y);
                column = column + 1 ;

            }
            while (column <= 10);
            System.out.println("\n");
            row = row + 1 ;
        }
        while (row <= 10);

    }
}