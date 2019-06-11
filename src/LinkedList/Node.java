package LinkedList;

public class Node<Libro> {
    Node next;
    Libro value;

    public Node(Libro value){
        this.value = value;
        Node next = null;
    }

    public Node() {
        this.value = null;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Libro getValue() {
        return value;
    }

    public void setValue(Libro value) {
        this.value = value;
    }
}
