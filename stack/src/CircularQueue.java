
public class CircularQueue {

    private static final int DEFAULT_SIZE = 10;
    public int[] data;
    public int end = 0;
    public int front = 0;
    public int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int val) {
        if (isFull()) {
            System.out.println("The queue is full");
            return false;
        }
        data[end++] = val;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        int i = front;
        do {
            System.out.print(data[i]+" -> ");
            i++;
            i = i % data.length;
        } while (i != end);
        System.out.println("End");
    }

    public boolean isFull() {
        return (size == data.length);
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
