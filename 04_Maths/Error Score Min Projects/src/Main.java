import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int errorScoreSize = sc.nextInt();
        int[] errorScore = new int[errorScoreSize];
        for(int i=0; i<errorScoreSize; i++){
            errorScore[i] = sc.nextInt();
        }
        int compP = sc.nextInt();
        int othQ = sc.nextInt();
        int minProjects = 0;

        for(int i=0; i<errorScoreSize; i++){
            if(errorScore[i] <=0){
                continue;
            }else if(errorScore[i] <= compP){
                minProjects += errorScore[i];
                errorScore[i] = 0;
            }else{
                minProjects += compP;
                errorScore[i] -= compP;
            }
        }
        for(int i=0; i<errorScoreSize; i++){
            if(errorScore[i] > 0){
                minProjects += (errorScore[i] + othQ - 1)/othQ;
            }
        }
        System.out.println(minProjects);
    }
}