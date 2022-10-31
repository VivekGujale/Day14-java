package LinkedList;

public class QueueUC4 {
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

    public LinkedList dequeue(LinkedList head) {
        LinkedList tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }

    public static void main(String[] args) {
        System.out.println("welcome to New Queue");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        QueueUC4 queue = new QueueUC4();
        queue.append(firstNode);
        queue.append(secondNode);
        queue.append(thirdNode);
        queue.printLinkedList();
        System.out.println(queue.dequeue(firstNode));
        System.out.println(queue.dequeue(secondNode));
        System.out.println(queue.dequeue(thirdNode));
    }
}
