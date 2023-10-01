import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> lset= new LinkedHashSet<>();
        lset.add("aaa");
        lset.add("bbb");
        lset.add("ccc");
        lset.add("ddd");
        System.out.println(lset);
        System.out.println("Size: "+lset.size());
        System.out.println("Check if ccc is present: "+lset.contains("ccc"));
        System.out.println("Remove ddd"+lset.remove("ddd"));
        lset.add(null);
        System.out.println(lset);
        lset.add("ddd");
        System.out.println(lset);
        
    }
}
