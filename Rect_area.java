// Program to Explain Constructor (Using method showdata only)

class Rect{
    private int L , B ;
    Rect(){
        L = 1;
        B = 1;
    }
    Rect(int x, int y){
        L = x;
        B = y;
    }
    public void showdata(){
        System.out.println("Length = "+L);
        System.out.println("Breadth = "+B);
    }
}
class Rect_area{
    public static void main(String args[]){
        Rect r1 = new Rect();
        Rect r2 = new Rect(3,6);
        r1.showdata();
        r2.showdata();
    }
}