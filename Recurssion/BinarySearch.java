public class BinarySearch
{
    public static void main(String[] args) {
        int []arr={1,2,3,4,66,77,89,98};
        int target=71;
        System.out.println(BS(arr,target,0,arr.length-1));
    }
    static int BS(int []arr,int target,int s, int e){
        if(s>e){
            return-1;
        }
        int m= s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return BS(arr,target,s,m-1);
        }
        return BS(arr,target,m+1,e);
    }
}
