import java.util.*;

public class CreatingStrings{
    static HashSet<String> st = new HashSet<String>();
    static void permutations(String prefix, String suffix){
        if (suffix.length() == 0) {
            st.add(prefix);
            return;
        }
        for(int i=0;i<suffix.length();i++){
            permutations(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permutations("", str);
        sc.close();
        System.out.println(st.size());
        List<String> list = new ArrayList<String>(st);
        Collections.sort(list);
        for (String string : list) {
            System.out.println(string);
        }
    }
}
