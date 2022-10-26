package LinkedList;

class MyNode<T> implements LinkedList<T> {
    private T key;
    private LinkedList<T> next;

    public MyNode(T key) {

        this.key = key;
        this.next = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }

    public LinkedList<T> getNext() {
        return next;
    }

    @Override
    public void setNext(LinkedList next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append("" + "").append(key).append("");
        if (next != null) {
            myNodeString.append("->").append(next);
        }
        return myNodeString.toString();
    }
}
