// // Program to Show Method overloading, Constructor Overloading, and Static data members >>>

// class Test{
//     private int L, B,H;
//     static int count;
//     public void setdata(){
//         L = 2;
//         B = 3;
//         count++;
//     }
//     public void setdata(int x,int y){
//         L = x;
//         B = y;
//         count++;
//     }
//     public void setdata(int x,int y,int z){
//         L = x ;
//         B = y;
//         H = z;
//     }
//     public void showdata(){
//         System.out.println("Length ="+ L);
//         System.out.println("Hight ="+ H);
//         System.out.println("Breadth ="+ B);
//     }
//     public static void showcount(){
//         System.out.println("Total number of count = "+ count + "\n");
//     }
//     public void Area(){
//         int ar = L * B;
//         System.out.println("Area of Box ="+ ar);
//     }
//     public void volume(){
//         int val = L * B * H ;
//         System.out.println("Volume off Box ="+ val);
//     }
// }
// class Test2{
//     private int a,b,c;
//     static int count;
//     Test2(){
//         a = 4;
//         b = 3;
//         c = 7;
//         count ++;
//     }
//     Test2(int x,int y, int z){
//         a = x;
//         b = y;
//         c = z;
//         count++;
//     }
//     public void showdata(){
//         System.out.println("Constructor called....");
//         System.out.println("Length = "+ a);
//         System.out.println("Hight ="+ b);
//         System.out.println("Breadth = "+ c);
//     }
//     public void volume(){
//         int val = a * b * c ;
//         System.out.println("Volume of Box ="+ val);
//     }
//     public static void showcount(){
//         System.out.println("Total number of count = "+ count +"\n");
//     }
// }
// class Area{
//     public static void main(String args[]){
        
//         Test.showcount();
//         Test t1,t2,t3;
//         t1 = new Test();
//         t2 = new Test();
//         t3 = new Test();
//         t1.setdata();
//         t1.showdata();
//         t1.Area();
//         Test.showcount();
//         // System.out.println(" ");
//         t2.setdata(5,6);
//         t2.showdata();
//         t2.Area();
//         Test.showcount();
//         // System.out.println("\n");
//         t3.setdata(1,2,3);
//         t3.showdata();
//         t3.volume();
//         Test.showcount();

//         Test2.showcount();
//         Test2 r1,r2;
//         r1 = new Test2();
//         r2 = new Test2(1,1,1);
//         r1.showdata();
//         r1.volume();
//         Test.showcount();
//         r2.showdata();
//         r2.volume();
//         Test.showcount();

//     }
// }