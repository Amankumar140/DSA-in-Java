package singleton;

public class Main {
    public static void main(String[] args) {
        singleton obj1=singleton.getInstance();
        singleton obj2=singleton.getInstance();
        System.out.println(obj1==obj2);
    }
}
