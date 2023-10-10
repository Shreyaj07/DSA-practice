import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Italy");
        hs.add("Cuba");
        hs.add("Russia");
        hs.add(null);
        System.out.println(hs);
        hs.remove("Cuba");
        System.out.println(hs);
        hs.forEach((key) -> {
            System.out.print(key+" ");
        });
        System.out.println("Is Italy present? "+hs.contains("Italy"));
        System.out.println("Iterating over Hash Set: ");
        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
