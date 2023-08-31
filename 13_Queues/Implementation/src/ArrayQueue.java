import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayQueue {
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(10);
        aq.enqueue(100);
        aq.enqueue(339);
        System.out.println(aq);
        System.out.println(aq.dequeue());
        System.out.println(aq);
    }
    int first, last, size;
    Object[] storage;

    ArrayQueue() {
        this(100);
    }

    ArrayQueue(int n) {
        size = n;
        storage = new Object[size];
        first = last = -1;
    }

    boolean isFull(int n) {
        return first == 0 && last == size - 1 || first == last + 1;
    }

    void enqueue(Object el){
        if(last==size-1 || last==-1){
            storage[0] = el;
            last=0;
            if(first==-1){
                first=0;
            }
        }
        else storage[++last] = el;
    }
    Object dequeue(){
        Object tmp = storage[first];
        if(first==last){
            last=first=-1;
        }else if(first==size-1){
            first=0;
        }else {
            first++;
        }
        return tmp;
    }
    public String toString(){
        return Arrays.toString(storage);
    }
}
