import java.util.HashMap;

class Solution
{
    static int majorityElement(int a[], int size)
    {
        int majorityElement=-1;
        int maxFrequency = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0; i<size; i++){
           hm.put(a[i],hm.getOrDefault(a[i],0)+1);
           if(hm.get(a[i]) >= maxFrequency){
               maxFrequency = hm.get(a[i]);
               majorityElement = a[i];
           }
        }
       if(maxFrequency > a.length/2){
           return majorityElement;
       }
       return -1;
    }
}