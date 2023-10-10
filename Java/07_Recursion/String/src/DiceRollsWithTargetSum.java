import java.util.ArrayList;

public class DiceRollsWithTargetSum {
    public static void main(String[] args) {
        dice("",4);
        System.out.println();
        System.out.println(diceCount("",4));
        System.out.println(diceList("",4));
    }
    static void dice(String p, int target){
        if(target==0){
            System.out.print(p+" ");
            return;
        }
        for(int i =1; i<=6 && i<=target; i++){
            dice(p+i,target-i);
        }
    }
    static int diceCount(String p, int target){
        if(target==0){
            return 1;
        }
        int count =0;
        for(int i =1; i<=6 && i<=target; i++){
            count+=diceCount(p+i,target-i);
        }
        return count;
    }
    static ArrayList<String> diceList(String p, int target){
        ArrayList<String> al = new ArrayList<>();
        if(target==0){
            al.add(p);
            return al;
        }
        for(int i =1; i<=6 && i<=target; i++){
            al.addAll(diceList(p+i,target-i));
        }
        return al;
    }
}
