import java.util.Hashtable;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(5,"D");
        //adding key value pairs
        System.out.println(ht);
        String val = ht.get(1);
        System.out.println(val);
        System.out.println(ht.get(2));
//      //Deleting
        System.out.println(ht.remove(1));
        System.out.println(ht);
        ht.put(2,"Z");
        System.out.println(ht);

        ht.forEach((key,value) -> {
            System.out.print(key + ": "+value+", ");
        });
        System.out.println();
        Iterator<Integer> itr = ht.keySet().iterator();
        while(itr.hasNext()){
            Integer key = itr.next();
            String mapValue = ht.get(key);
            System.out.println("KEY: "+ key+", VALUE: "+mapValue);
        }
    }
}
