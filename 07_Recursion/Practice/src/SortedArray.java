public class SortedArray {

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1,1};
        System.out.println(sorted(arr));
        int[] arr2 = {3,4,5,1,9,9,84};
        System.out.println(sorted(arr2));
        System.out.println(sorted(new int[]{1,2,3,4,5,6}));
        System.out.println(sorted(new int[]{9,8,3,2,1,1,0}));
        System.out.println(sorted(new int[]{}));
        System.out.println(sorted(new int[]{3}));
        System.out.println(sorted(new int[]{3,5,6,2,1,4}));
    }
    public static boolean sorted(int[] arr){
        if(arr.length==0 || arr.length==1){
            return true;
        }
        if(arr[0]>arr[1]){
            return isDescending(arr,1);
        }else {
            return isAscending(arr,1);
        }
    }

    public static boolean isDescending(int[] arr, int i){
        if(i>=arr.length-1){
            return true;
        }
        return isDescending(arr, i+1) && (arr[i]>=arr[i+1]);
    }
    public static boolean isAscending(int[] arr, int i){
        if(i>=arr.length-1){
            return true;
        }
        return isAscending(arr, i+1) && (arr[i]<=arr[i+1]);
    }
}
