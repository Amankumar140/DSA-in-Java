import java.util.Scanner;

public class problems
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // fibonacci numbers
//        int a=0,b=1;
//        System.out.println("Enter the upper limit: ");
//        int n= input.nextInt();
//        System.out.println(a);
//        System.out.println(b);
//        for(int i=3; i<=n; i++){
//            int temp=a+b;
//            System.out.println(temp);
//            a=b;
//            b=temp;
//
//        }
        // count the occurrence
        long n=123422344234L;
        int count=0;
        while(n!=0){
            long r=n%10;
            if(r==2){count++;}
            n=n/10;
        }
        System.out.println(count);


    }
}
