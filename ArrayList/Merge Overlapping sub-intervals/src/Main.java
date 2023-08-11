import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3},
                {2,4},
                {2,6},
                {8,9},
                {8,10},
                {9,11},
                {15,18},
                {16,17}
        };
        List<List<Integer>> temp = Solution.mergeOverlappingIntervals(arr);
        for(List<Integer> l: temp){
            System.out.println(l.toString());
        }
    }
}