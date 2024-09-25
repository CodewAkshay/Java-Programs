// Program to show concept of Thread
class Demo extends Thread{
    public void run(){
    for(int i = 1; i <= 10; i++){
        System.out.print("D"+i);
    }
}
}
class MTest{
    public static void main(String args[]){
        Demo t1 = new Demo();
        t1.start();
        for(int i = 1; i<= 10;i++){
            System.out.print("M"+i);
        }

    }
}