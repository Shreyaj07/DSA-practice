import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("vaish", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Vaishnavi");
        boolean matchFound = matcher.find();
        System.out.println(matchFound  ? "Match Found": "Match Not found");
    }
}