import java.util.Scanner;

public class Repetitions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 1;
        int temp = 1;
        sc.close();

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
