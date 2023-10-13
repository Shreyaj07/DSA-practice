import java.util.*;
//https://www.codingninjas.com/studio/problems/maximum-meetings_1062658?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
public class Solution {
    public static int maximumMeetings(int[] start, int[] end) {
        int n = start.length;
        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(start[i], end[i], i);
        }
        Arrays.sort(meetings, Comparator.comparingInt(a -> a.end));
        int count = 0;
        int prevEnd = -1;
        for (Meeting m : meetings) {
            if (m.start > prevEnd) { 
                count++;
                prevEnd = m.end;
            }
        }
        return count;
    }
}

class Meeting {
    int start, end, index;

    Meeting(int start, int end, int index) {
        this.start = start;
        this.end = end;
        this.index = index;
    }
}
