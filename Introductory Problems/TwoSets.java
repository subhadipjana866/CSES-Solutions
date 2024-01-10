import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSets {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder A = new StringBuilder();
        StringBuilder B = new StringBuilder();
        long n = Long.parseLong(br.readLine());
        if((((n*(n+1))/2)%2 == 0)){
            System.out.println("YES");
            if (n%4 == 0) {
                for (long i = 1; i <= n; i+=4) {
                    A.append(i+" ");
                    A.append(i+3+" ");
                    B.append(i+1+" ");
                    B.append(i+2+" ");
                }
            }else if (n%4 == 3) {
                
                for (long i = n; i > 3; i-=4) {
                    A.append(i+" ");
                    A.append(i-3+" ");
                    B.append(i-1+" ");
                    B.append(i-2+" ");
                }
                A.append(2+" ");
                A.append(1+" ");
                B.append(3+" ");
            }

            String[] nA =  A.toString().split(" ");
            String[] nB =  B.toString().split(" ");

            System.out.println(nA.length);
            System.out.println(A);
            System.out.println(nB.length);
            System.out.println(B);
        }else{
            System.out.println("NO");
        }
    }
}
