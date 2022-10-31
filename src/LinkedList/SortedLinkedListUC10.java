package LinkedList;

public class SortedLinkedListUC10<K extends Comparable<K>> {
    LinkedList<K> head;
    LinkedList<K> tail;
    int positionOfLastNode;

    public SortedLinkedListUC10() {
        head = null;
        tail = null;
        positionOfLastNode = -1;
    }


    public void add(LinkedList<K> newNode) {
        K newNodeKey = newNode.getKey();
        if (head == null) {
            head = newNode;
            tail = head;
        } else if (head.getKey().compareTo(newNodeKey) > 0) {
            newNode.setNext(head);
            head = newNode;
        } else if (tail.getKey().compareTo(newNodeKey) < 0) {
            tail.setNext(newNode);
            tail = newNode;
        } else {
            LinkedList<K> temporaryPrevious = head;
            LinkedList<K> temporaryCurrent = head.getNext();

            while ((temporaryCurrent != tail) && (temporaryCurrent.getKey().compareTo(newNodeKey) < 0)) {
                temporaryPrevious = temporaryCurrent;
                temporaryCurrent = temporaryCurrent.getNext();
            }
            temporaryPrevious.setNext(newNode);
            newNode.setNext(temporaryCurrent);

        }
        positionOfLastNode++;
    }

    public void printSortedLinkedList() {
        System.out.println("My Nodes: " + head);
    }


}
