import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        pattern1(4,0);
        pattern2(4,0);
        System.out.println();
        int[] arr = {4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {7,8,4,2};
        selection(arr2,arr2.length,0,0);
        System.out.println(Arrays.toString(arr2));
    }
/*=================
 Pattern 1: triangle
    * * * *
    * * *
    * *
    *
 =====================*/
    public static void pattern1(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            pattern1(row,col+1);
        }else{
            System.out.println();
            pattern1(row-1,0);
        }

    }
    /*=================
 Pattern 1: triangle
    *
    * *
    * * *
    * * * *
 =====================*/
    public static void pattern2(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            pattern2(row,col+1);
            System.out.print("*");
        }else{
            pattern2(row-1,0);
            System.out.println();
        }
    }

    public static void selection(int[] arr, int row, int col, int max){
        if(row==0){
            return;
        }
        if(col < row){
            if(arr[col]>arr[max]){
                selection(arr,row,col+1,col);
            }else{
                selection(arr,row,col+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selection(arr,row-1,0,0);
        }
    }

    public static void bubble(int[] arr, int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                //swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubble(arr,row,col+1);
        }else{
            bubble(arr,row-1,0);
        }
    }

}