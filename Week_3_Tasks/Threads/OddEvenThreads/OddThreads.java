package Week_3_Tasks.Threads.OddEvenThreads;

public class OddThreads implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=20;i+=2){
            System.out.println("odd : "+i);
        }
    }
    
}
