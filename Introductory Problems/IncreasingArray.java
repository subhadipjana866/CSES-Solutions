import java.util.Scanner;

public class IncreasingArray {
    public static void main(String args[]){
        long min = 0l;  // taking long variable as the result can grow larger
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[sc.nextInt()];
        for(int i=0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        sc.close();

        //Traverse the input array
        for(int i=1;i<ar.length;i++){
            if(ar[i]<ar[i-1]){ //check if the next number is smaller
                min = min + ar[i-1]-ar[i]; //add the difference between them to min variable
                ar[i] = ar[i-1]; //update the currect element
            }
        }
        System.out.println(min);
    }
}
