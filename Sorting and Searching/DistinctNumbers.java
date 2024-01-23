
import java.util.Arrays;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int j = 0;
        for (int i = 1; i < n; i++) {
            // while (i<n-1 && arr[i] == arr[i+1]) {
            //     i++;
            // }
            // j++;
            if (arr[i] != arr[i-1]) {
                j++;
            }
        }
        j++;
        System.out.println(j);
        sc.close();
    }
}
