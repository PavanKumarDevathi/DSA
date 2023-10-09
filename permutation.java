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
        occurance(p + ch, up.substring(1));
        occurance(ch + p, up.substring(1));
    }

    static ArrayList<String> occuranceList(String p, String up) {         // output : [abc, cab, bac, cba, abc, cab, bac, cba]
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = occuranceList(p + ch, up.substring(1));
        ArrayList<String> right = occuranceList(ch + p, up.substring(1));

        left.addAll(right);
        return left;
    }

}
