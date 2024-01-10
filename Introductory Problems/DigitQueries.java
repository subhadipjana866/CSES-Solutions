import java.util.Scanner;

public class DigitQueries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i : nums) {
            int k = i;
            StringBuilder sb = new StringBuilder();
            for (long j = 1; sb.length() - 1 < k; j++) {
                sb.append(j);
            }
            System.out.println(sb.charAt(k - 1));
        }

        sc.close();
        

    }
}
