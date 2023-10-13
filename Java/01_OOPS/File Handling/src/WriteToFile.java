import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in java might be tricky, but it is fun enough! lol such a lie");
            myWriter.close();
        }catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
