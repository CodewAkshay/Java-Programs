// /* Program to implement interface,all type of keywords,this/super/abstract, 
//   Constructor overloading/Overriding,single level inheritance,multilevel inheritace,
//   method overloading/Overriding
//  */
// interface Method    // Interface 1
// {
//     int a = 5;
//     void showdata();
//     void setdata(int x,int y);

// }
// interface Calculate   // interface 2
// {
//   int b = 6;
//   void square();
//   void cube();
// }
// class Data implements Method  // Base class
// {
//   int m,n;
//   public void showdata()
//   {
//     System.out.println("a= "+a);
//   }
//   public void setdata(int x,int y)
//   {
//     m = x;
//     n = y;
//   }
//   Data(int p,int q) // Parameterize Constructor
//   {
//     m = p;
//     n = q;
//     int div = m / n ;
//     System.out.println("Division = "+div);
//   }
// }
// class Inner_Data extends Data implements Calculate  // Derived class
// {
//  // int z;
//   public void square()
//   {
//     int sq = m * n ;
//     System.out.println("Square = "+sq);
//   }
//   public void cube()
//   {
//     int c = b * b ;
//     System.out.println("Cube = "+c);
//   }
//   // Inner_Data(int x) // Base class constructor
//   // {
//   //   z = x ;
//   //   int cub = z * z * z;
//   //   System.out.println("Cube of z = "+cub);

//   // }
// }
// class Universal
// {
//   public static void main(String args[]){
//     Method ref;
//     Data d1 = new Data(5,9);
//     ref = d1 ;
//     ref.showdata();
//   }
// }