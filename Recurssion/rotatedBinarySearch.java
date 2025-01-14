public class rotatedBinarySearch {
    public static void main(String[] args) {
        int []arr={5,6,7,8,9,1,2,3,4};
        System.out.println(BS(arr,1,0, arr.length-1));
    }
    static int BS(int []arr,int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(arr[s]<=target && target<=arr[m]){
                return BS(arr,target,s,m-1);
            }
            else{
                return BS(arr,target,m+1,e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return BS(arr,target,m+1,e);
        }
        return BS(arr,target,s,m-1);
    }
}
