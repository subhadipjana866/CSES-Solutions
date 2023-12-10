import java.util.Scanner;

public class Permutations {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder str = new StringBuilder();  // Use stringbuilder or you will encounter TLE
        sc.close();
        if (n==1) {
            
            System.out.println(1);
        }else if(n<4){
            System.out.println("NO SOLUTION");
        }
        else if(n == 4){
            System.out.print("2 4 1 3");
        }
        else {
            for (long i = 2; i <= n; i+=2) {  //First print the even numbers
                str.append(i+" ");
            }
            for (long i = 1; i <= n; i+=2) {  //Then print the odd numbers
                str.append(i+" ");
            }
            System.out.print(str);
        }

    }
}
