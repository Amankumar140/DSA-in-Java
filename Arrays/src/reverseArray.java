import java.util.ArrayList;

public class reverseArray
{
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        reverse(l);
        System.out.println(l);
    }
    static void reverse(ArrayList<Integer> y){
         int i=0; int j=y.size()-1;
         while(i<j){
             swap(y,i,j);
             i++;
             j--;
         }
    }
    static void swap(ArrayList<Integer>y, int a,int b){
//         
        int temp=y.get(a);
        y.set(a,y.get(b));
        y.set(b,temp);
    }
}
