// Program to explain Constructor
class Box2{
    private int L,B,H;
    Box2 (){
        L = 1;
        B = 2;
        H = 3;
    }
    public void showdata(){
        System.out.println("length = "+L);
        System.out.println("Breath = "+B);
        System.out.println("Hight = "+H);
    }
    public void Volume(){
        int val = L * B * H ;
        System.out.println("Volume of Box is = "+val);
    }
}
class Constructor{
    public static void main(String args[]){
        Box2 d1;
        d1 = new Box2();
        d1.showdata();
        d1.Volume();
    }
}    