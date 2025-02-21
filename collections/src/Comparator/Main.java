package Comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(21);
        list.add(12);
        list.add(22);
        list.sort((a,b)->b-a); // for descending..

        System.out.println(list);

        List<String> words=new ArrayList<>();
        words.add("aman");
        words.add("kumar");
        words.add("bihar");
        words.add("up");
        words.add("delhi");
        words.add("haryana");
        words.sort((a,b)->b.length()-a.length()); // sort descending in basis of length;
        System.out.println(words);

    }
}
