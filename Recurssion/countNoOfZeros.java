public class countNoOfZeros {
    public static void main(String[] args) {
        System.out.println(count(1010001,0));
    }
    static int count(int n, int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            return count(n/10,c+1);

        }
        return count(n/10,c);
    }
}
