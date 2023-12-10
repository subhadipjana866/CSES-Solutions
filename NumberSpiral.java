import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSpiral {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            long x = Long.parseLong(s[0]);
            long y = Long.parseLong(s[1]);


            if(y>x){
                if(y%2==0){
                    sb.append((long)((y-1)*(y-1))+1+(x-1)+"\n");

                }else{
                    sb.append((long)((y*y)-(x-1))+"\n");
                }
            }else{
                if(x%2==0){
                    sb.append((long)((x*x)-(y-1))+"\n");

                }else{
                    
                    sb.append((long)((x-1)*(x-1))+1+(y-1)+"\n");
                }
            }

        }
        System.out.print(sb);
    }
}
