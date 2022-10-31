package LinkedList;

public class StackUC2 {
    private static LinkedList head;

    public StackUC2() {
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

    public LinkedList pop(LinkedList head) {
        LinkedList tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void printLinkedList() {
        System.out.println("My Nodes: " + head);
    }

    public static void main(String[] args) {
        System.out.println("welcome to New Stack");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        StackUC2 stack = new StackUC2();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.peak();
        stack.printLinkedList();
        System.out.println(stack.pop(thirdNode));
        System.out.println(stack.pop(secondNode));
        System.out.println(stack.pop(firstNode));
        stack.printLinkedList();
    }
}
