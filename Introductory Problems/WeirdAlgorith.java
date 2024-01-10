import java.util.Scanner;

public class WeirdAlgorith {
    public static void compute(long n){
        if(n==1){  //If n==1 then directly print the value of n
            System.out.println(n);
        } else if(n!=1){ //If n is not equal to 1 then apply the logic according the question
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

        //Initializing the Scanner object

        Scanner sc = new Scanner(System.in);

        // Using long variable as the value of n can become very large

        long n = sc.nextLong();

        //Closing the Scanner instance

        sc.close();

        //Calling the compute function with n

        compute(n);
    }
}
