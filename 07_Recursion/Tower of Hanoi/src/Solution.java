import java.util.ArrayList;
public class Solution {
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) {
        ArrayList<ArrayList<Integer>> moves = new ArrayList<>();
        helper(n, 1,2,3, moves);
        return moves;
    }
    public static void helper(int n, int from,int to, int aux, ArrayList<ArrayList<Integer>> moves){
       if(n==1){
            ArrayList<Integer> move = new ArrayList<>();
            move.add(from);
            move.add(to);
            moves.add(move);
            return;
       }
       helper(n-1,from,aux,to,moves);
       ArrayList<Integer> move = new ArrayList<>();
            move.add(from);
            move.add(to);
            moves.add(move);
        helper(n-1,aux,to,from,moves);
    }
}






