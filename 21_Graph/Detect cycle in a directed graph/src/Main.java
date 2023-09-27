import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> edges= new ArrayList<>();
        edges.add(new ArrayList<>(List.of(1,2)));
        edges.add(new ArrayList<>(List.of(2,3)));
        System.out.println(Solution.detectCycleInDirectedGraph(3,edges));
        edges.add(new ArrayList<>(List.of(3,1)));
        System.out.println(Solution.detectCycleInDirectedGraph(3, edges));

    }
}