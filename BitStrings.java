import java.util.Scanner;
import java.math.BigInteger;

public class BitStrings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BigInteger n = BigInteger.valueOf(sc.nextInt());
        BigInteger two = BigInteger.TWO;
        BigInteger mod = BigInteger.valueOf((long) (1e9+7));
        System.out.println(two.modPow(n, mod));
        sc.close();
    }
}


//This method doesn't work that's why used BIgInteger


// import java.util.Scanner;

// public class BitStrings {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         long n = scanner.nextLong();
//         long answer = 1;
//         for (long i = 1; i <= n; i++) {
//             answer *= 2;
//         }
//         System.out.println(answer);
//         scanner.close();
//     }
// }