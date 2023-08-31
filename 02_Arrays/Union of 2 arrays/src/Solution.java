import java.util.HashSet;

class Solution{
    public static int doUnion(int a[], int n, int b[], int m)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<n; i++){
            if(!hs.contains(a[i])){
                hs.add(a[i]);
            }
        }
        for(int i=0; i<m; i++){
            if(!hs.contains(b[i])){
                hs.add(b[i]);
            }
        }
        return hs.size();
    }
}