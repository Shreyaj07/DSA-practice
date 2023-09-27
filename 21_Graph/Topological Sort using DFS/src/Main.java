import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int v = 4;

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(0, 1)));
        edges.add(new ArrayList<>(Arrays.asList(0, 3)));
        edges.add(new ArrayList<>(Arrays.asList(1, 2)));
        edges.add(new ArrayList<>(Arrays.asList(3, 2)));
        edges.add(new ArrayList<>(Arrays.asList(2,0)));
        int e = edges.size();
        ArrayList<Integer> result = Solution.topologicalSort(edges, v, e);

        if (!result.isEmpty()) {
            System.out.println("Topological Sort Order: " + result);
        } else {
            System.out.println("The graph contains a cycle. No valid topological ordering.");
        }
        System.out.println("Using Kahn's algorithm: ");
        ArrayList<Integer> result1 = KahnsAlgorithm.topologicalSort(edges, v, e);

        if (!result1.isEmpty()) {
            System.out.println("Topological Sort Order: " + result1);
        } else {
            System.out.println("The graph contains a cycle. No valid topological ordering.");
        }
    }
}
