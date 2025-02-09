// doubly linked list

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertAtbeg(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertK(int value, int index) {
        Node newnode = new Node(value);
        if (index == 0) {
            insertAtbeg(value);
        }
        if (index == size - 1) {
            insertAtlast(value);
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next = newnode;
        size++;

    }

    public void insertAfterNode(int nodeVal, int val) {

        Node p = find(nodeVal);
        if (p == null) {
            System.out.println("not exist");
        }
        Node newNode = new Node(val);
        newNode.next = p.next;
        newNode.prev = p;
        p.next = newNode;
        if (newNode.next != null) {
            p.next.prev = newNode;
        }

    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAtlast(int val) {
        Node newnode = new Node(val);
        newnode.next = null;
        if (head == null) {
            newnode.prev = null;
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
        newnode.prev = temp;
        size++;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");

//        System.out.println("Reverse printing");
//        while (last!=null){
//            System.out.print(last.val+" -> ");
//            last=last.prev;
//        }
//        System.out.println("START");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int value) {
            this.val = value;
        }

        public Node(int value, Node next, Node prev) {
            this.val = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
