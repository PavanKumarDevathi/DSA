import java.util.ArrayList;
// printing subsequences of a string using recursion 
public class subSequence2 {
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqList(p + ch, up.substring(1));
        ArrayList<String> right = subseqList(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        // subseq("", "abc");
        ArrayList<String> ans = subseqList("", "abc");
        System.out.println(ans);
    }
}
