import java.util.*;
import java.io.*;
//https://www.codingninjas.com/studio/problems/merge-intervals_699917?leftPanelTab=1&count=25&search=&sort_entity=order&sort_order=ASC&page=2
class Interval {
    int start, finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class Solution {
    public static void main(String[] args) {
        Interval[] intervals = new Interval[5];
        intervals[0] = new Interval(1, 4);
        intervals[1] = new Interval(3, 5);
        intervals[2] = new Interval(6, 8);
        intervals[3] = new Interval(10, 12);
        intervals[4] = new Interval(8, 9);
        List<Interval> al = mergeIntervals(intervals);
        for (Interval i : al) {
            System.out.println(i.start + " " + i.finish);
        }
    }

    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval> al = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparing(a -> (a.finish-a.start)));
//        for(Interval i: intervals){
//            System.out.println(i.start + " "+i.finish);
//        }
        int i = 0;
        while (i < intervals.length) {
            if (i == intervals.length - 1) {
                al.add(new Interval(intervals[i].start, intervals[i].finish));
                break;
            }
            if (intervals[i].start <= intervals[i + 1].start && intervals[i + 1].start <= intervals[i].finish) {
                int updatedStart = Math.min(intervals[i].start, intervals[i + 1].start);
                int updatedFinish = Math.max(intervals[i].finish, intervals[i + 1].finish);
                al.add(new Interval(updatedStart, updatedFinish));
                i += 2;
            } else {
                al.add(new Interval(intervals[i].start, intervals[i].finish));
                i++;
            }
        }
        for (Interval value : intervals) {
            boolean flag = false;
            for (Interval interval : al) {
                if (value.start >= interval.start && value.finish <= interval.finish) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                al.add(new Interval(value.start, value.finish));
            }
        }
        return al;
    }
}







