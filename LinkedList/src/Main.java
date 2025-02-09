public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(3);
        list.insertAtFirst(7);
        list.insertAtFirst(8);
        list.display();
        list.insertAtEnd(9);
        list.insertAtEnd(11);
        list.insertAtEnd(12);
        list.insertAtEnd(13);

        list.insertAtK(56, 3);
        list.display();
        list.insertRec(6, 4);
        list.display();


//         DLL list=new DLL();
//         list.insertAtbeg(4);
//         list.insertAtbeg(9);
//         list.insertAtbeg(8);
//         list.insertAtbeg(3);
//         //list.display();
//         list.insertAtlast(12);
//         list.insertAtlast(19);
//         //list.display();
//         list.insertK(40,3);
//         list.display();
//         list.insertAfterNode(40,78);
//         list.display();

//         CLL list=new CLL();
//         list.insert(8);
//         list.insert(9);
//         list.insert(10);
//         list.insert(11);
//         list.insert(12);
//         list.display();
//         list.delete(10);
//         list.display();
    }
}