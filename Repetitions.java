import java.util.Scanner;

public class Repetitions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //Initialize two integers with 1

        int ans = 1;
        int temp = 1;
        sc.close();

        //Checking if the subsequent characters if they are same or not
        //If same then increase temp
        //Compare temp and ans for max value for each step 

        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                temp++;
            }else{
                temp = 1;
            }
            ans = Math.max(ans, temp);
        }
        System.out.println(ans);

    }
}
