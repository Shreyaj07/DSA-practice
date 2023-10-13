public class Main1 implements Runnable{
    public void run(){
        System.out.println("The code is running in a thread");
    }

    public static void main(String[] args) {
        Main1 obj = new Main1();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
}
