public class Main {
    public static void main(String[] args) throws ExceptionHandle {
        CustomStack stack1 = new CustomStack(5);
        stack1.push(9);
        stack1.push(19);
        stack1.push(29);
        stack1.push(8);
        stack1.push(7);
        stack1.push(90);
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        DynamicStack stack = new DynamicStack(5);

        stack.push(9);
        stack.push(19);
        stack.push(29);
        stack.push(8);
        stack.push(7);
        stack.push(90);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}