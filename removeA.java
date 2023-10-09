// using recurssion we will remove all the available A's : 
public class remove2A {
    static String remove(String ps , String up){
        if(up.isEmpty()){
            return ps;
        }
        if(up.charAt(0) == 'a'){
            return remove(ps, up.substring(1));
        } 
        return remove(ps + up.charAt(0), up.substring(1)) ;
    }

    public static void main(String[] args) {
        String ans = remove("", "aabababahhkhkhakhajkhfkjhsfhauihiuy");
        System.out.println(ans);
    }
    
}
