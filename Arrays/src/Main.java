import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         // find max num
        ArrayList<Integer> List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(6);
        List.add(5);
      //  max(List);
        System.out.println(max(List));
    }
    static int max(ArrayList<Integer> y){
        int x=y.getFirst();
        for(int i=0; i<y.size(); i++){
            if(x<y.get(i)){
                x=y.get(i);
            }
        }
        return x;
    }
}