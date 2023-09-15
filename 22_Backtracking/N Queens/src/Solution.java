import java.lang.reflect.Array;
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<Integer>> solutions = nQueens(n);
        for(ArrayList<Integer> solution: solutions){
            for(int row: solution){
                for(int i=0; i<n; i++){
                    if(i==row){
                        System.out.print("Q ");
                    }else{
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> nQueens(int n) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        solveQueens(n,0,new ArrayList<>(),al);
        return al;
    }

    private static void solveQueens(int n, int row,ArrayList<Integer> current, ArrayList<ArrayList<Integer>> solution) {
        if(row==n){
            solution.add(new ArrayList<>(current));
            return;
        }
        for(int col=0; col<n; col++){
            if(isValidPlacement(current,row,col)){
                current.add(col);
                solveQueens(n,row+1,current,solution);
                current.remove(current.size()-1);
            }
        }
    }

    private static boolean isValidPlacement(ArrayList<Integer> current, int row, int col) {
        for(int prevRow=0; prevRow < row; prevRow++){
            int prevCol = current.get(prevRow);
            //check if the current queen conflicts with any previously placed queens
            if(prevCol==col || Math.abs(prevRow - row) == Math.abs(prevCol- col)){
                return false;
            }
        }
        return true;
    }

} 
