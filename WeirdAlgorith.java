import java.util.Scanner;

public class WeirdAlgorith {
    public static void compute(long n){
        if(n==1){
            System.out.println(n);
        } else if(n!=1){
            if (n%2 == 0) {
            System.out.print(n+" ");
            n = n/2;
            compute(n);
        } else {
            System.out.print(n+" ");
            n = (n*3)+1;
            compute(n);
        }
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        compute(n);
    }
}
