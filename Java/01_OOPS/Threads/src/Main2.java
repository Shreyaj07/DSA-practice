public class Main2 extends Thread {
    static int amount = 0;

    public static void main(String[] args) {
        Main2 thread = new Main2();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}
