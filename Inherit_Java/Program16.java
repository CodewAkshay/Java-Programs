// class Data{
//     protected int L,B,H;
//     public void setdata(){
//         L = 1;
//         B = 3;
//         H = 4;
//     }
//     public void setdata(int x, int y, int z){
//         L = x ; 
//         B = y ;
//         H = z ;
//     }
//     public void volume(){
//         int val = L * B * H ;
//         System.out.println("Volume of box = "+val);
//     }
//     public void showdata(){
//         System.out.println("Value of L = "+L );
//         System.out.println("Valiue of B = "+B);
//         System.out.println("Valiue of H = "+H);
//     }
   
// }
// class XData extends Data{
//     public void area(){
//         int ar = L * B;
//         System.out.println("area = "+ar);
//     } 
// }
// class Program16{
//     public static void main(String args[]){
//         XData x1 = new XData();
//         x1.setdata(3,4,5);
//         x1.area();
//         x1.volume();
//         x1.showdata();
//     }
// }