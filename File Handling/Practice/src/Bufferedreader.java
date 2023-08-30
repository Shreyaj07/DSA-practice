import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Bufferedreader {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //byte to char stream and then reading char stream
            System.out.println("You typed: "+br.readLine());

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
