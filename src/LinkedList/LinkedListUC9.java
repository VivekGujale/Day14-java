package LinkedList;

public class LinkedListUC9 {
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
            LinkedList temporaryNode = previousNode.getNext();
            previousNode.setNext(newNode);
            newNode.setNext(temporaryNode);
        } else {
            System.out.println("Key Node Found");
        }
    }

    public LinkedList deleteNode(int key) {

        LinkedList previousNode = search(key);

        if (previousNode != null) {

            LinkedList tempNode = head;
            while (tempNode != null && tempNode.getNext() != previousNode) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(previousNode.getNext());
            return previousNode;
        } else {
            System.out.println("Key Node Found");
            return null;
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

    public int size() {
        int numOfNode = 0;
        LinkedList tempNode = this.head;
        while (tempNode != null) {
            tempNode = tempNode.getNext();
            numOfNode++;
        }
        return numOfNode;
    }

    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }

    public static void main(String[] args) {
        System.out.println("welcome to New LinkedList");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        MyNode<Integer> nextNode = new MyNode<Integer>(40);
        LinkedListUC9 myLinkedList = new LinkedListUC9();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.printLinkedList();
        System.out.println();
        int previousNode = 30;
        System.out.println("New inserted node is : " + nextNode);
        myLinkedList.insertNode(previousNode, nextNode);
        myLinkedList.printLinkedList();
        System.out.println();
        LinkedList deletedNode = myLinkedList.deleteNode(40);
        System.out.println("The deleted node is : " + deletedNode.getKey());
        myLinkedList.printLinkedList();
        System.out.println();
        int sizeOfLinkedList = myLinkedList.size();
        System.out.println("The size of the linked list is : " + sizeOfLinkedList);
    }
}

