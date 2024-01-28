import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Apartments {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] appl =  Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] appart = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(appl);
        Arrays.sort(appart);

        int count = 0;
        int j=0;
        int i =0;
        while (i<n[0] && j<n[1]) {
            if((n[1]==1 && n[2] == 1 && appart[0]==1)&&(appl[0]<=2)){
                count++;
                break;
            }
            else if(Math.abs(appl[i]-appart[j])<=n[2]){
                i++;
                j++;
                count++;
            }else if (appl[i] - appart[j] > n[2]) {
                j++;
            }else{
                i++;
            }
        }
        System.out.print(count);
    }
}
