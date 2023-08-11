import java.util.ArrayList;
//first and last position of an elmeent in a sorted array
//gfg
class Solution {
    ArrayList<Long> find(long arr[], int n, int x) {
        ArrayList<Long> ans = new ArrayList<>();
        boolean first = false;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x && !first) {
                ans.add(Long.valueOf(i));
                first = true;
            }
            if (arr[i] == x) {
                index = i;
            }
        }
        if (!first) {
            ans.add(Long.valueOf(-1));
        }
        ans.add(Long.valueOf(index));
        return ans;
    }
}