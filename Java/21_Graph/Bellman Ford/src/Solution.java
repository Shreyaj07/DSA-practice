import java.security.interfaces.EdECKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(List.of(3, 3, 1)));
        edges.add(new ArrayList<>(List.of(1, 2, 2)));
        edges.add(new ArrayList<>(List.of(1, 3, 2)));
        edges.add(new ArrayList<>(List.of(2, 3, -1)));
        System.out.println(Arrays.toString(bellmonFord(4, 4, 1, edges)));
    }

    /*
    https://www.codingninjas.com/studio/problems/bellmon-ford_2041977
    n -> nodes
    m -> edges
    * */
    public static int[] bellmonFord(int n, int m, int src, List<List<Integer>> edges) {
        int[] distance = new int[n+1];
        Arrays.fill(distance, (int)Math.pow(10, 8));
        distance[src] = 0;
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                int u = edges.get(j).get(0);
                int v = edges.get(j).get(1);
                int weight = edges.get(j).get(2);
                if(distance[u] != Integer.MAX_VALUE && (distance[u] + weight < distance[v])){
                    distance[v] = distance[u] + weight;
                }
            }
        }
        return distance;
    }
}
