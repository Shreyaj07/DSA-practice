import java.util.LinkedList;

public class LinkedListQueue<T> {

    private LinkedList<T> list = new LinkedList<T>();

    public void clear() {
        list.clear();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public T firstElement() {
        return list.getFirst();
    }

    public T dequeue() {
        return list.removeFirst();
    }

    public void enqueue(T el) {
        list.addLast(el);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        linkedListQueue.enqueue(1);
        linkedListQueue.enqueue(2);
        linkedListQueue.enqueue(3);
        System.out.println(linkedListQueue.toString());
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue.toString());
        linkedListQueue.clear();
        System.out.println(linkedListQueue.toString());
    }
}
