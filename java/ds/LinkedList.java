package ds;

public class LinkedList<T> {
    class Node<T> {
        T data;
        Node<T> next;
        public Node(T data, Node<T> next, Node<T> previous) {
            this.data = data;
            this.next = next;
        }
    }
    public Node<T> head;
    public Node<T> tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void insert(T data) {
        Node<T> node = new Node<>(data, null, null);
        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> tailOld = this.tail;
            this.tail = node;
            tailOld.next = node;
        }
        if (tail == null) {
            this.tail = this.head;
        }
    }
    public T get(int index) {
        Node<T> last = this.head;
        int i = 0;
        while (i != index) {
            i++;
            last = last.next;
        }
        return last.data;
    }
}
class Test {
    public static void main(String[] args) {
        LinkedList<String> test = new LinkedList<>();
        test.insert("Test");
        test.insert("Test");
        test.insert("Test");
        test.insert("Test");
        System.out.println(test.get(0));
    }
}