import java.util.Scanner;

public class MissingNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[sc.nextInt()]; 
        int[] hash = new int[ar.length]; //Initializing a hash array.
        for(int i=0;i<ar.length-1;i++){
            ar[i] = sc.nextInt();
        }
        sc.close();

        //The idea is :
        // Traverse the input array
        // For each array element assign 1 at that location in the hash table

        // Then return the position which have 0 value in the hash table

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


