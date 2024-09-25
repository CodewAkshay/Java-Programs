class Command{
    public static void main(String args[]){
        int c = args.length;
        System.out.println("Total command line arguments are : "+c);
        System.out.println("Command line arguments are : ");
        for(int i = 0 ; i < c; i++){
            System.out.println(args[i]);
        }
    }
}