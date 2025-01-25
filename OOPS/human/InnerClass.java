//package human;
//class Test{
//    static String name;   // there should be a static for using test.name=name;
//    Test(String name){
//        Test.name=name;
//    }
//}
//public class InnerClass {
//
//    public static void main(String[] args) {
//        Test obj=new Test("amankumar");
//        Test obj2=new Test("aman");
//        System.out.println(obj.name);
//        System.out.println(obj2.name);
//    }
//}

package human;

public class InnerClass {
    // here static means this class not depend on the outer class named " inner class" and that's why it not give error in  this class
    static class Test {
        String name;

        Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test obj = new Test("amankumar");
        Test obj2 = new Test("aman");
        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}