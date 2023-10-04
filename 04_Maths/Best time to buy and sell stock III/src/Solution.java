import java.util.* ;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,3,4,5,6));
        System.out.println(maxProfit(arr,arr.size()));
    }
	public static int maxProfit(ArrayList<Integer> prices, int n)
	{
		if (n <= 1) {
        return 0;
    }

    int[] buy1 = new int[n]; // Maximum profit after the first buy
    int[] sell1 = new int[n]; // Maximum profit after the first sell
    int[] buy2 = new int[n]; // Maximum profit after the second buy
    int[] sell2 = new int[n]; // Maximum profit after the second sell

    buy1[0] = -prices.get(0);
    sell1[0] = 0;
    buy2[0] = -prices.get(0);
    sell2[0] = 0;

    for (int i = 1; i < n; i++) {
        buy1[i] = Math.max(buy1[i - 1], -prices.get(i));
        sell1[i] = Math.max(sell1[i - 1], buy1[i - 1] + prices.get(i));
        buy2[i] = Math.max(buy2[i - 1], sell1[i - 1] - prices.get(i));
        sell2[i] = Math.max(sell2[i - 1], buy2[i - 1] + prices.get(i));
    }

    return sell2[n - 1];
	}
}
