package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(12);
        list.add(7);
        list.add(9);
        list.add(19);
        list.add(29);
        list.add(39);
//        System.out.println(list);
//        System.out.println(list.size());
//        String [] array= {"Apple","banana","cherry"};
//         List<String> l=Arrays.asList(array);
//        System.out.println(l);

        Object [] arr =list.toArray();
        Integer[] ae= list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ae));

    }
}
