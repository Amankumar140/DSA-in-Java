import java.util.Scanner;

public class switchPro
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        System.out.println("Enter the day");
//        int n= input.nextInt();
//        switch (n){
//            case 1-> System.out.println("Monday");
//            case 2-> System.out.println("Tuesday");
//            case 3-> System.out.println("Wednesday");
//            case 4-> System.out.println("Thursday");
//            case 5-> System.out.println("Friday");
//            case 6-> System.out.println("Saturday");
//            case 7-> System.out.println("Sunday");
//            default -> System.out.println("not a valid day");
//        }

        //for weekDays or Weekends
        System.out.println("Enter the day no.");
        int n= input.nextInt();
        switch (n){
            case 1,2,3,4,5-> System.out.println("weekdays");
            case 6,7-> System.out.println("weekends");
            default-> System.out.println("not valid day");
        }
    }
}
