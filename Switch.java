import java.util.Scanner;
public class Switch {

    // ****** Usimh else if********

    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Press any button 1,2,3:");
    //     int button = sc.nextInt();
    //     if(button==1){
    //         System.out.println("HEllo Shyam");
    //     }
    //     else if(button==2){
    //         System.out.println("Namaskar Akshay");
    //     }
    //     else if(button==3){
    //         System.out.println("Namaste Rahul");
    //     }
    //     else{
    //         System.out.println("Button is not valid");
    //     }

    // ********* Now Using Switch*******

    public static void main (String[]args){
        try (Scanner sc = new Scanner(System.in)){
        System.out.print("Press Any Button 1,2,3:");
        int Button = sc.nextInt();
        switch (Button) {
            case 1: System.out.println("Hello Akshay");
                break;
            case 2: System.out.println("Hello Rahul");
                break;
            case 3: System.out.println("Hello Shyam");
                break;
            default:
                System.out.println("Button is not Valid");
        }
    }
    }
}  
