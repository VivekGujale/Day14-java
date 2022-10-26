package LinkedList;

public class LinkedListUC1 {
    public static void main(String[] args) {
        System.out.println("welcome to New LinkedList");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListUC1 myLinkedList = new LinkedListUC1();
        System.out.print(firstNode + "," + secondNode + "," + thirdNode);
    }
}
