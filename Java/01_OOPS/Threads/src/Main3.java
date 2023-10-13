public class Main3 extends Thread{
    public static  int amt = 0;

    public static void main(String[] args) {
        Main3 thread = new Main3();
        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        //update amt and print value
        System.out.println("Main: "+amt);
        amt++;
        System.out.println("Main: "+amt);
    }
    public void run(){
        amt++;
    }
}
