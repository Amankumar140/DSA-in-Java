package human;

public class StaticBlock {
    static int a=5;
    static int b;
    static {
        System.out.println("i m in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj= new StaticBlock();
        System.out.println(obj.b+" "+obj.a);
        obj.b+=10;
        System.out.println(obj.b+" "+obj.a);
    }
}
