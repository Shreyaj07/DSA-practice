package CodingNinjas;

import java.util.Arrays;

public class CompareVersion {
    //    compare version nos.
    public static void main(String[] args) {
        System.out.println(CompareVersion.compareVersions("1.0.0","1"));
        System.out.println(CompareVersion.compareVersions("1.2.3","1.2.4"));
    }

    public static int compareVersions(String a, String b) {
        String[] aStr = a.split("\\.");
        String[] bStr = b.split("\\.");
        int num1=0,num2=0;
        for(String s: aStr){
            num1 = num1*10+ Integer.parseInt(s);
        }
        for(String s: bStr){
            num2 = num2*10+ Integer.parseInt(s);
        }
        if(num1>num2){
            return 0;
        }
        return 1;
    }
}
