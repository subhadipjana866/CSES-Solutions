import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FerrisWheel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] chld = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(chld);
        int sum = 0;
        int i = 0;
        int j = n[0]-1;
        while (i<=j) {
            if(chld[i]+chld[j]>n[1]){
                sum++;
                j--;
            }else{
                sum++;
                i++;
                j--;
            }
            
        }
        // sum++;
        System.out.print(sum);
        
    }
}
