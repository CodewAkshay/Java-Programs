// /* Program to Show concept of Inheritance */
// class Data{
//     int a;
//     public void setdata(int x)
//     {
//         a = x;
//     }
//     public void showdata()
//     {
//         System.out.println("a = "+a);
//     }
// }
// class Inner_data extends Data{
//     public void cube(){
//         int cube = a * a * a ;
//         System.out.println("Cube of " + a + " is = "+ cube);
//     }
// }
// class Practical4{
//     public static void main(String ags[]){
//     Inner_data d1 = new Inner_data();
//     d1.setdata(5);
//     d1.showdata();
//     d1.cube();
//     }
// }