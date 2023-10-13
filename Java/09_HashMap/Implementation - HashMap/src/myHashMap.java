import java.util.LinkedList;
import java.util.Objects;

//https://www.codingninjas.com/studio/problems/implementation-hashmap_630343

public class myHashMap {
    private LinkList head;

    public myHashMap() {
        head = null;
    }

    public void insert(String key, int value) {
        if (head == null) {
            head = new LinkList(key, value);
        } else {
            LinkList current = head;
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            current.next = new LinkList(key, value);
        }
    }

    public int get(String key) {
        LinkList current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }

    public void remove(String key) {
        if (head == null) {
            return;
        }
        if (head.key.equals(key)) {
            head = head.next;
            return;
        }
        LinkList prev = head;
        LinkList current = head.next;
        while (current != null) {
            if (current.key.equals(key)) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean search(String key) {
        return get(key) != -1;
    }

    public int getSize() {
        int size = 0;
        LinkList current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

class LinkList {
    String key;
    int value;
    LinkList next;

    LinkList(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
