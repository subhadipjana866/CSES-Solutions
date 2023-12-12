import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoKnights {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        for (long i = 1; i <= n; i++) {
            long ans = (((i*i)*((i*i)-1))/2)-(4*(i-1)*(i-2));
            System.out.println(ans);
        }
    }
}
