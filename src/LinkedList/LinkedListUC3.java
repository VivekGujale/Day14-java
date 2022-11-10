package LinkedList;

public class LinkedListUC3 {
    public static LinkedList head;

    public void append(LinkedList newNode) {
        if (this.head == null) {
            this.head = newNode;
        } else {
            LinkedList tempNode = this.head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(newNode);
        }
    }

    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }


    public static void main(String[] args) {
        System.out.println("welcome to New LinkedList");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListUC3 myLinkedList = new LinkedListUC3();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.printLinkedList();
    }
}