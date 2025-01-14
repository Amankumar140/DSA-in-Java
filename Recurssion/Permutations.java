import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        //permutation("","abc");
        //System.out.println(permutationList("","abc"));
        System.out.println(permutationCount("","abcd"));
    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f=p.substring(0,i);
            String s= p.substring(i);
            permutation(f+ch+s,up.substring(1));
        }

    }


    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();

        char ch=up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f=p.substring(0,i);
            String s= p.substring(i,p.length());
            ans.addAll(permutationList(f+ch+s,up.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f=p.substring(0,i);
            String s= p.substring(i);
            count= count + permutationCount(f+ch+s,up.substring(1));
        }
        return  count;
    }

}
