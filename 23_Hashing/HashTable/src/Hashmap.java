import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("john",3000);
        hm.put("fredrick",4000);
        hm.put("mack",3450);
        hm.put("amy",4455);
        System.out.println(hm);
        System.out.println("Size of hm: "+hm.size());
        hm.put("amy",3000);
        System.out.println(hm);
        
        if(hm.containsKey("mack")){
            Integer val = hm.get("mack");
            System.out.println("Value of key: "+val);
        }
        //creating a copy of a hashmap
        HashMap<String, Integer> hmap = new HashMap<>(hm);
        System.out.println(hmap);
    }
}
