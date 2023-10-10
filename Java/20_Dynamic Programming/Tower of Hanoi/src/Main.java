public class Main {
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,'A','C','B');
    }
    static void towerOfHanoi(int n, char from, char to, char aux){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1,from,aux,to);
        System.out.println("Move disk "+n+" from rod "+from+" to rod "+to);
        towerOfHanoi(n-1,aux,to,from);
    }
}