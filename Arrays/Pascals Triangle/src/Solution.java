import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows==1){
            return al;
        }
        al.add(new ArrayList<>(Arrays.asList(1,1)));
        if(numRows==2){
            return al;
        }
        for(int row=2; row<numRows; row++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int col=1; col<row; col++){
                int value = al.get(row-1).get(col-1)+al.get(row-1).get(col);
                temp.add(value);
            }
            temp.add(1);
            al.add(temp);
        }
        return al;
    }
}
