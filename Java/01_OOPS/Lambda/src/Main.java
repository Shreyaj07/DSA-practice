import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.forEach(System.out::print);
        System.out.println();
        numbers.forEach((n)->{
            System.out.print(n+" ");
        });
    }
}