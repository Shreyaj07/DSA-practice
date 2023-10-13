import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        myHashMap hashMap = new myHashMap();
        System.out.println(hashMap.isEmpty());
        hashMap.insert("Vaishnavi",1);
        hashMap.insert("Tanishq",2);
        hashMap.insert("LOL", 3);
        hashMap.insert("HAHAHA",4);
        System.out.println(hashMap.get("Vaishnavi"));
        System.out.println(hashMap.get("Tanishq"));
        System.out.println(hashMap.search("LOL"));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.getSize());
        hashMap.remove("LOL");
        System.out.println(hashMap.getSize());
        System.out.println(hashMap.get("Vaishnavi"));
        System.out.println(hashMap.search("LOL"));
        System.out.println(hashMap.search("HAHAHA"));
        hashMap.remove("Vaishnavi");
        System.out.println(hashMap.search("Vaishnavi"));
        System.out.println(hashMap.get("Tanishq"));
        System.out.println(hashMap.get("LOL"));
    }
}
