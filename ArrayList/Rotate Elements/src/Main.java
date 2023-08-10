import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(1,2,3)));
        al.add(new ArrayList<>(Arrays.asList(4,5,6)));
        al.add(new ArrayList<>(Arrays.asList(7,8,9)));
        al.add(new ArrayList<>(Arrays.asList(10,11,12)));
        for(ArrayList<Integer> a: al){
            System.out.println(a.toString());
        }
        System.out.println("After rotation: ");
        Solution.rotateMatrix(al, al.size(), al.get(0).size());
        for(ArrayList<Integer> a: al){
            System.out.println(a.toString());
        }
    }
}