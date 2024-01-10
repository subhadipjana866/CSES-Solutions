import java.util.Scanner;


public class TowerofHanoi {
    static void towerOfHanoi(int n, int from_rod, int to_rod, int aux_rod) 
    { 
        if(n==0){
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod); 
        System.out.println(from_rod +" "+ to_rod); 
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod); 
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int)Math.pow(2,n)-1);
        towerOfHanoi(n, 1, 3, 2);
        sc.close();
    }
}
