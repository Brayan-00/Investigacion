package LinkedList;
public class LinkedList<Libro> {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = new Node();
        this.tail = this.head;
        this.size = 0;
    }
    public void insert(Libro libro){
        if (this.size == 0){
            this.head = new Node(libro);
            this.tail = this.head;
            size++;
        }else{
            Node tmp = this.tail;
            tmp.next = new Node(libro);
            this.tail = tmp.next;
            size++;
        }
    }
    public Node access(int index){
        Node tmp = this.head;
        for (int i = 0; i <= index; i++){
            tmp = tmp.next;
        }
        return tmp;
    }
}
