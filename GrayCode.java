import java.util.ArrayList;
import java.util.Scanner;

public class GrayCode {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("0");
        arr.add("1");
        sc.close();
        for(int i=2;i<(1<<n);i = i<<1){

            // Enter the previously generated codes again in arr[] in reverse 
            // order. Nor arr[] has double number of codes. 
            for (int j = i-1 ; j >= 0 ; j--)
                arr.add(arr.get(j));

            // append 0 to the first half
            for (int j = 0 ; j < i ; j++)
                arr.set(j, "0" + arr.get(j)); 
     
            // append 1 to the second half 
            for (int j = i ; j < 2*i ; j++)
                arr.set(j, "1" + arr.get(j));
        }
        for (int i = 0 ; i < arr.size() ; i++ ) 
            System.out.println(arr.get(i));
    }
}
