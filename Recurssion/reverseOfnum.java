public class reverseOfnum {
    public static void main(String[] args) {
        //reversePrint(1273);
        System.out.println(reverse(12739));
    }
    static void reversePrint(int n){
        if(n%10==n){
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        reversePrint(n/10);
    }



    static int reverse(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==0){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}
