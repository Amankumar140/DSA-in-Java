import java.util.ArrayList;

public class TargetedDiceNumber {
    //Question is how many ways to create target on dice
    public static void main(String[] args) {
        Dice("",4);
        System.out.println(dice("",4));
    }
    static void Dice(String p, int target){
        if( target==0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=6 && i<=target; i++){
            Dice(p+i,target-i);
        }
    }

    static ArrayList<String> dice(String p, int target){
        if(target==0){
            ArrayList<String> l=new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> ans= new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i++){
            ans.addAll(dice(p+i,target-i));
        }
        return ans;
    }
}
