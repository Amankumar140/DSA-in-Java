package human;

public class StaticLearn {
    public static void main(String[] args) {

        //greeting(); can't directly used
//        StaticLearn call=new StaticLearn(); you have to make an object for this use due to static method
//        call.greeting();
//        call.sayHello();


    }
    void sayHello() {
        greeting();
    }

      void greeting() {
          System.out.println("hello there how r u ?");
    }
}
