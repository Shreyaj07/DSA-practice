//https://www.codingninjas.com/studio/problems/maximum-meetings_1062658?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        int[] start = {1,3,6};
        int[] end = {4,8,7};
        System.out.println(maximumMeetings(start, end));
    }
    public static int maximumMeetings(int []start, int []end) {
        int n = start.length;
        Meetings[] meetings = new Meetings[n];
        for(int i=0; i<n; i++){
            meetings[i] = new Meetings(start[i], end[i], i);
        }
        Arrays.sort(meetings, (a,b)-> a.end-b.end);
        int count =0;
        int prevEnd = -1;
        for(Meetings m: meetings){
            if(m.start >= prevEnd){
                count++;
                prevEnd = m.end;
            }
        }
        return count;
    }
}
class Meetings {
    int start, end, index;
    Meetings(int start, int end, int index){
        this.start = start;
        this.end = end;
        this.index = index;
    }
}