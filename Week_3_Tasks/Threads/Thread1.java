package Week_3_Tasks.Threads;

public class Thread1 extends Thread{
    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();
    }

    @Override
    public void run(){
        System.out.println("Hello,Java!");
    }
}
