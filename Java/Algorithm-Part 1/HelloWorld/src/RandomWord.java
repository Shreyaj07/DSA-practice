import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        int i = 0;

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            i++;

            // With probability 1/i, select the current word as the champion
            if (StdRandom.bernoulli(1.0 / i)) {
                champion = word;
            }
        }

        StdOut.println(champion);
    }
}
