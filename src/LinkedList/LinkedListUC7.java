package LinkedList;

public class LinkedListUC7 {
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

    public void search(int data) {
        LinkedList current = this.head;
        int i = 1;
        boolean flag = false;
        //Checks whether list is empty
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                //Compares node to be found with each node present in the list
                if (Integer.parseInt(current.getKey().toString()) == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.getNext();
            }
        }
        if (flag)
            System.out.println("Element is present at position : " + i);
        else
            System.out.println("Element is not present in the list");
    }

    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }

    public static void main(String[] args) {
        System.out.println("welcome to New LinkedList");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListUC7 myLinkedList = new LinkedListUC7();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.printLinkedList();
        myLinkedList.search(30);
    }

}
