import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CreatingAndPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of nodes: ");
        int n = scanner.nextInt();
        System.out.println("Enter no. of edges: ");
        int e = scanner.nextInt();
        int[][] edges = new int[n][2];
        for (int i = 0; i < e; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }
        System.out.println(Arrays.deepToString(printAdjacency(n, e, edges)));
    }

    public static int[][] printAdjacency(int n, int m, int[][] edges) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(new ArrayList<>(List.of(i)));
        }
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            result.get(u).add(v);
            result.get(v).add(u);
        }
        return result.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue)
                        .toArray())
                .toArray(int[][]::new);
    }
}
