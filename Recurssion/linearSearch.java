import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9,6, 7,9};
        System.out.println(search(arr, 0, 9));
        System.out.println(searchIndex(arr, 0, 9));
        System.out.println(findIndex(arr,0,9,new ArrayList<>()));
    }

    static boolean search(int[] arr, int i, int target) {
        if (i == arr.length) {
            return false;
        }
        return (arr[i] == target) || search(arr, i + 1, target);
    }

    static int searchIndex(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return searchIndex(arr, i + 1, target);
        }
    }
    static ArrayList findIndex(int []arr,int i, int target , ArrayList<Integer> list){
        if(i== arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }

            return findIndex(arr,i+1,target,list);
         
    }
}
