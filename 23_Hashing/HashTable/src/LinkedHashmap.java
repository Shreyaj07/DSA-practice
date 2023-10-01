import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhmap = new LinkedHashMap<>();
        lhmap.put("Oman", "Muscat");
        lhmap.put("India", "Delhi");
        lhmap.put("Russia","Moscow");
        lhmap.put("Japan", "Tokyo");
        System.out.println(lhmap.size());
        System.out.println("Is Russia key present" + lhmap.containsKey("Russia"));
        System.out.println("Value of key Russia: "+lhmap.containsKey("Russia"));
        System.out.println("Deleting an element"+lhmap.remove("Oman"));
        System.out.println("Mapped linkedhashmap" + lhmap);
        lhmap.put(null,"Tokyo");
        System.out.println(lhmap);
        lhmap.put(null,"xyz");
        System.out.println(lhmap);
    }
}
