import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class PalindromeReorder {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashMap<Character, Integer> counting = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (counting.containsKey(ch)) {
                counting.put(ch, counting.get(ch) + 1);
            } else {
                counting.put(ch, 1);
            }
        }
        int oddCount = 0;
        char oddChar = 0;

        for (Entry<Character, Integer> itr : counting.entrySet()) {
            if (itr.getValue() % 2 != 0) {
                oddCount++;
                oddChar = itr.getKey();
            }
        }
        if (oddCount > 1 || oddCount == 1 && str.length() % 2 == 0) {
            System.out.println("NO SOLUTION");
        } else {
            String firstHalf = "", lastHalf = "";
            for (Entry<Character, Integer> itr : counting.entrySet()) {

                String ss = "";
                for (int i = 0; i < itr.getValue() / 2; i++) {
                    ss += itr.getKey();
                }
                firstHalf = firstHalf + ss;
                lastHalf = ss + lastHalf;
            }
            System.out.println((oddCount == 1) ? (firstHalf + oddChar + lastHalf) : (firstHalf + lastHalf));
        }

    }
}
