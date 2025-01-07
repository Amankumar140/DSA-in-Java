import java.util.ArrayList;
import java.util.Scanner;

public class arrayLists
{
    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(3);
//        list.add(7);
//        list.add(8);
//        list.add(6);
//        list.add(2);
//        list.add(31);
//        list.add(33);
//        System.out.println(list);
//        System.out.println(list.contains(4));
//        list.set(2,45);
//        list.remove(3);
//        System.out.println(list);
//        list.addFirst(1);
//        list.addLast(4);
//        System.out.println(list);

        // multi dimensional
        ArrayList<ArrayList<Integer>> List=new ArrayList<>();
        for(int i=0; i<3; i++){
            List.add(new ArrayList<>()) ;
        }

        Scanner in=new Scanner(System.in);
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                List.get(i).add(in.nextInt());
            }
        }
        System.out.println(List);
    }
}
