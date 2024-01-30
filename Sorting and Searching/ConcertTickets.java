import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ConcertTickets {
    public static int findClosest(ArrayList<Integer> arr, int target) {
        int n = arr.size();
        // System.out.println(n);
        if (n>0 && target < arr.get(0)) {
            return -1;
        } 
        if (n>0 && target > arr.get(n - 1)) {
            return arr.get(n - 1);
        }
        if(n == 1 && target <= arr.get(0)){
            return arr.get(0);
        }
        if (n==0) {
            return -1;
        }
        

        int i = 0, j = n, mid = 0;

        while (i<j) {
            if (arr.get(i+1) > target) {
                return arr.get(i);
            }else if (arr.get(i+1) == target) {
                return arr.get(i+1);
            }
            i++;
        }
        // while (i < j) {
        //     mid = (i + j) / 2;
        //     if (arr.get(mid) == target) {
        //         return arr.get(mid);
        //     }
        //     if (target < arr.get(mid)) {
        //         if (mid > 0 && target > arr.get(mid - 1)) {
        //             return getClosest(arr.get(mid - 1), arr.get(mid), target);

        //         }
        //         j = mid;
        //     } else {
        //         if (mid < n - 1 && target < arr.get(mid + 1)) {
        //             return getClosest(arr.get(mid), arr.get(mid + 1), target);
        //         }
        //         i = mid + 1;
        //     }
        // }
        return -1;
    }

    public static int getClosest(int val1, int val2, int target) {
        if (target - val1 >= val2 - target) {
            return val2;
        } else {
            return val1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Read the input
        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] tickets = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] customers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // Sort the tickets
        Arrays.sort(tickets);

        ArrayList<Integer> myList = Arrays.stream(tickets).boxed().collect(Collectors.toCollection(ArrayList::new));

        for (int i = 0; i < n[1]; i++) {

            
            int ans = findClosest(myList, customers[i]);
            // System.out.println(ans);
            bw.write(ans+"\n");
            if (ans != -1) {
                myList.remove(myList.indexOf(ans));
            }
            

        }

        bw.flush();

    }
}