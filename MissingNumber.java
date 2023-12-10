import java.util.Scanner;

public class MissingNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[sc.nextInt()];
        int[] hash = new int[ar.length];
        for(int i=0;i<ar.length-1;i++){
            ar[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<ar.length;i++){
            if(ar[i] != 0){
                hash[ar[i] - 1] = 1;
            }
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i] == 0){
                System.out.println(i+1);
            }
        } 
    }
}


