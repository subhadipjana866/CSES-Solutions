import java.util.Scanner;

public class AppleDivision {
    static long findminans(long[] arr, long currsum, long totalsum, int i){
        if(i==0){
            return Math.abs((totalsum-currsum)-currsum);
        }
        return Math.min(findminans(arr,currsum+arr[i],totalsum,i-1),findminans(arr,currsum,totalsum,i-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long totalsum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
            totalsum += arr[i];
        }
        sc.close();
        System.out.println(findminans(arr,0l,totalsum,n-1));
    }
}
