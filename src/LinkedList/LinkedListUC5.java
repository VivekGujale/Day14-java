package LinkedList;

public class LinkedListUC5 {
    public static LinkedList head;

    public void append(LinkedList newNode) {
        if (this.head == null) {
            this.head = newNode;
        } else {
            LinkedList last = this.head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }
    }

    public LinkedList pop(LinkedList head) {
        LinkedList tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }


    public static void main(String[] args) {
        System.out.println("welcome to New LinkedList");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListUC5 myLinkedList = new LinkedListUC5();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.pop(firstNode);
        myLinkedList.printLinkedList();
    }
}
