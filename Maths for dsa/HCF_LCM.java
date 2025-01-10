public class HCF_LCM
{
    public static void main(String[] args) {
        System.out.println(hcf(5,30));
        System.out.println(lcm(5,30));
    }
    static int hcf(int a,int b){
        if(a==0){
            return b;
        }
        return  hcf(b%a,a);
    }
    static int lcm(int a, int b){
        int x= a*b/hcf(a,b);
        return x;
    }
}
