// /* Program to show the concept of method Overloading */
// class Data{
//     int a , b;
//     public void setdata()       // Method 1
//     {
//         a = 3;
//         b = 4;
//     }
//     public void setdata(int x, int y)       // Method 2
//     {
//         a = x;
//         b = y;
//     }
//     public void showdata(){
//         System.out.println("a = "+ a);
//         System.out.println("b = "+b);
//     }
// }
// class Practical2{
//     public static void main(String args[]){
//         Data d1 = new Data();
//         Data d2 = new Data();
//         d1.setdata();
//         d1.showdata();
//         d2.setdata(6,7);
//         d2.showdata();
//     }
// }