import java.util.ArrayList;
// prints all the possible permutations of a string 

public class permutations {
    public static void main(String[] args) {
        occurance("", "abc");
        ArrayList<String> ans = occuranceList("", "abc");           
        System.out.println(ans);
    }

    static void occurance(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            occurance(f + ch + s, up.substring(1));
        }
    }

}
