public class Main {
    public static void main(String[] args) {
        /*mutable seq of characters
        Advantages over string:
        1. mutable
        2. efficient
        3. thread safe -> Slower
        StringBuilder isn't thread safe
         */
        //constructor 1
        StringBuffer  sb= new StringBuffer();
        //constructor 2
        StringBuffer sb2 = new StringBuffer("Vaishnavi Kale");
        //constructor 3
        StringBuffer sb3 = new StringBuffer(50);

        sb.append("vaishnavi");
        sb.insert(2,"Kale");
        sb.replace(1,5,"Queen");
        sb.delete(1,6);
        sb.reverse();
        System.out.println(sb2.capacity());
        String str = sb.toString();
        System.out.println(str);

    }
}