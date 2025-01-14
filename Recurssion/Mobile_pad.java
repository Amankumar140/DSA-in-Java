import java.util.ArrayList;

public class Mobile_pad {
    public static void main(String[] args) {
        System.out.println(Pad("","12"));
    }
    static ArrayList<String> Pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit =up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        for(int i= (digit-1)*3; i<digit*3; i++){
            char ch=(char)('a'+i);
            ans.addAll(Pad(p+ch,up.substring(1)));
        }
        return ans;
    }
//    public List<String> letterCombinations(String digits) {
//
//    }
}
