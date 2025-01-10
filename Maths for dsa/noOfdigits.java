public class noOfdigits
{
    public static void main(String[] args) {
        int n=2;
        int base=8;
        int x=(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(x);
    }
}
