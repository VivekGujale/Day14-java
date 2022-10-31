package LinkedList;

public class LinkedListUC10 {
    public static void main(String[] args) {

        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(40);
        MyNode<Integer> fourthNode = new MyNode<Integer>(70);

        SortedLinkedListUC10 mySortedLinkedList = new SortedLinkedListUC10();
        mySortedLinkedList.add(firstNode);
        mySortedLinkedList.add(secondNode);
        mySortedLinkedList.add(thirdNode);
        mySortedLinkedList.add(fourthNode);
        System.out.println("Sorted Linked List");
        mySortedLinkedList.printSortedLinkedList();
    }
}
