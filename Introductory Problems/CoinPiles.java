import java.util.Scanner;

public class CoinPiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[n*2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i+2 <= arr.length; i+=2) {
            int min = Math.min(arr[i],arr[i+1]);
            int max = Math.max(arr[i],arr[i+1]);
            if(((max+min)%3 == 0)&&(max <= min*2)){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }
    
}