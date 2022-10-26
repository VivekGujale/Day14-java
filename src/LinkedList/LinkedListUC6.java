package LinkedList;

public class LinkedListUC6 {
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

    public LinkedList popLast(LinkedList head) {
        if (this.head == null)
            return null;

        if (head.getNext() == null) {
            return null;
        }
        // Find the second last node
        LinkedList tempNode = head;
        while (tempNode.getNext().getNext() != null)
            tempNode = tempNode.getNext();

        // Change next of second last
        tempNode.setNext(null);
        return head;

    }


    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }


    public static void main(String[] args) {
        System.out.println("welcome to New LinkedList");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListUC6 myLinkedList = new LinkedListUC6();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.popLast(firstNode);
        myLinkedList.printLinkedList();
    }
}
