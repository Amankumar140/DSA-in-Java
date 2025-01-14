import java.util.ArrayList;

public class SubSet {
    public static void main(String[] args) {
        sequence("","abcde");
        System.out.println(sequenceRet("","abcde"));
    }
    static void sequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        sequence(p+ch,up.substring(1));
        sequence(p,up.substring(1));
    }

    static ArrayList<String> sequenceRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=sequenceRet(p+ch,up.substring(1));
        ArrayList<String>right=sequenceRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
