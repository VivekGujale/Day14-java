package LinkedList;

public class StackUC1 {
    private static LinkedList head;

    public StackUC1() {
        this.head = head;
    }

    public void add(LinkedList newNode) {
        if (this.head == null) {
            this.head = newNode;
        } else {
            LinkedList tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void push(LinkedList newNode) {
        add(newNode);
    }

    private LinkedList peak() {
        return head;
    }

    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }

    public static void main(String[] args) {
        System.out.println("welcome to New Stack");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        StackUC1 stack = new StackUC1();
        stack.push(firstNode);
        System.out.println("First Node added : " + stack.peak());
        stack.push(secondNode);
        System.out.println("Second Node added: " + stack.peak());
        stack.push(thirdNode);
        System.out.println("Third Node added: " + stack.peak());
        stack.printLinkedList();
    }
}
