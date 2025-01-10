public class prime
{
    public static void main(String[] args) {
        int n=40;
//        for (int i=0; i<=40; i++){
//            System.out.println(i+" "+isPrime(i) );
//        }
        boolean []primes=new boolean[n+1];
        sieve(primes,n);
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    static void sieve(boolean [] primes,int n){
        for(int i=2; i*i<=n; i++){
            if(!primes[i]){
                for(int j=2*i; j<=n; j+=i){
                     primes[j]=true;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
