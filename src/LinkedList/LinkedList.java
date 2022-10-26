package LinkedList;

public interface LinkedList<T> {
    public T getKey();

    public void setKey(T key);

    LinkedList getNext();

    public void setNext(LinkedList next);
}
