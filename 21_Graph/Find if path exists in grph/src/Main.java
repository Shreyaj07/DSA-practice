public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{2,0}};
        int source = 0, destination = 32;
        System.out.println(Solution.validPath(n,edges,source,destination));
    }
}