import java.text.DecimalFormat;
import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        System.out.println(generate(5));
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.2));
    }
    static String generate(int size){
        StringBuilder sb = new StringBuilder(size);
        for(int i=0; i<size; i++){
            Random random = new Random();
           sb.append((char)('a'+(int)(26*random.nextFloat())));
        }
        return  sb.toString();
    }
}
