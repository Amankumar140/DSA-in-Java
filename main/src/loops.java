import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // if - else statement
//        int a=34,b=56;
//        if(a<b){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }



        // loops

//        for(int i=0; i<5; i++){
//            System.out.print(i+" ");
//        }
        System.out.println("Enter the number : ");
        int n= input.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
