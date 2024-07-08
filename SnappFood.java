package TestProject;
import java.util.Arrays;
import java.util.Scanner;

public class SnappFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        Arrays.sort(prices);
        int maxSpend = 0;
        int index1 = -1, index2 = -1;
        int left = 0, right = n - 1;
        while (left < right) {
            int spend = prices[left] + prices[right];
            if (spend <= 700 && spend > maxSpend) {
                maxSpend = spend;
                index1 = left;
                index2 = right;
            }
            if (spend <= 700) {
                left++;
            } else {
                right--;
            }
        }
        if (maxSpend == 0) {
            System.out.println(-1);
        } else {
            System.out.println(index1 + " " + index2 + " " + maxSpend);
        }
    }
}