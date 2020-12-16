class demoThread extends Thread{
    
    String thread;

    demoThread(String threadName){
        thread = threadName;
    }

    public void run(){
        try {
            for(int i=0; i<10; i++){
                System.out.println(thread +" is working for "+i+"th time.");
                Thread.sleep(500);
            }
            System.out.println(thread+ " stops executing.");
        } catch (InterruptedException e) {
            System.out.println("Exception Occured");
            //TODO: handle exception
        }
    }
}

public class SimultaenousThread {
    public static void main(String[] args) {
        try {
            demoThread thread1 = new demoThread("First thread");
            demoThread thread2 = new demoThread("second thread");
            demoThread thread3 = new demoThread("Third thread");

            thread1.start();
            thread2.start();
            thread3.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
}