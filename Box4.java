class Box{
    private int L,B,H;
    static int count;
    Box(int x, int y, int z){
        L = x;
        B = y;
        H = z;
        count ++ ;   
    }
    public void showdata(){
        System.out.println("L = "+L);
        System.out.println("B = "+B);
        System.out.println("H = "+H);
    }
    public static void showcount(){

        System.out.println("Total number of Counts ="+count);

    }
    public void volume(){
        int val;
        val = L * B * H;
        System.out.println("Volume of Box is = "+val);
    }
}
  class Box4{
    public static void main(String args[]){
        Box.showcount();
        Box b1,b2;
        b1 = new Box(2,3,4);
        b2 = new Box(5,6,9);
        b1.showdata();
        b1.volume();
        b2.showdata();
        b2.volume();
        Box.showcount();
    }
}