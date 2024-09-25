public class Program {
    public static void main(String[] args) {
        int c = args.length;
        System.out.println("Total command line arguments are: " + c);
        System.out.println("Command line arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
