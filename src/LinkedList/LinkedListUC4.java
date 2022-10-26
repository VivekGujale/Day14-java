package LinkedList;

public class LinkedListUC4 {
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

    public void insertNode(int key, LinkedList newNode) {

        LinkedList previousNode = search(key);
        if (previousNode.getKey().equals(key)) {
            LinkedList tempNode = previousNode.getNext();
            previousNode.setNext(newNode);
            newNode.setNext(tempNode);
        } else {
            System.out.println("Key Node Found");
        }

    }

    public LinkedList search(int key) {
        LinkedList tempNode = head;
        boolean flag = false;
        while (tempNode != null && flag == false) {
            if (tempNode.getKey().equals(key)) {
                flag = true;
            } else {

                tempNode = tempNode.getNext();
            }
        }
        if (flag)
            return tempNode;
        else {
            return head;
        }
    }


    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }

    public static void main(String[] args) {
        System.out.println("welcome to New LinkedList");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(70);
        MyNode<Integer> nextNode = new MyNode<Integer>(30);
        LinkedListUC4 myLinkedList = new LinkedListUC4();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.printLinkedList();
        int previousNode = 56;
        System.out.println("New node inserted : " + nextNode);
        myLinkedList.insertNode(previousNode, nextNode);
        myLinkedList.printLinkedList();
    }
}

