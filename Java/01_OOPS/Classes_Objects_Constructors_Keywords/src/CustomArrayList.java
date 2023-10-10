import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //also working as index value
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length *2];
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
    }

    private boolean isFull() {
        return size==data.length;
    }

    public int remove(){
        return data[--size];
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }
    @Override
    public String toString(){
        return "Custom Array List {"+
                "data="+ Arrays.toString(data)+
                ", size"+size+"}";
    }
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(3);
        list.add(5);
        System.out.println(list);
        for(int i=0; i<13; i++){
            list.add(2*i);
        }
        System.out.println(list);
    }
}
