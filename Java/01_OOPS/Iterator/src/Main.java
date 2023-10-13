import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //iterator
        Iterator<String> it = cars.iterator();
        System.out.println(it.next());
        //looping thru collection
        System.out.println("Iterating thru entire collection: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}