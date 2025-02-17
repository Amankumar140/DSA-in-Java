public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int top = -1;

    public CustomStack() {
        this(DEFAULT_SIZE); // here this is used for the call the constructor which takes int datatype as integer
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int val) {
        if (isFull()) {
            System.out.println("stack is full");
            return false;
        }
        data[++top] = val;
        return true;
    }

    public boolean isFull() {
        return (top == data.length - 1);
    }

    public int pop() throws ExceptionHandle {
        if (isEmpty()) {
            throw new ExceptionHandle("Cannot pop because it is empty !!");
        }
        return data[top--];
    }

    public int peek() throws ExceptionHandle {
        if (isEmpty()) {
            throw new ExceptionHandle("Cannot pop because it is empty !!");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
