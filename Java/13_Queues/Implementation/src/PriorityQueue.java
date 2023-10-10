import java.util.Comparator;

class PersonComparator implements Comparator<Person>{
    public int compare(Person p1, Person p2){
        if(p1==p2){
            return 0;
        }
        return p1.age - p2.age;
    }
}

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class PriorityQueue {
    public static void main(String[] args) {
        int[] intArr1 = {4,6,7,4,2};
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        for(int i=0; i<intArr1.length; i++){
            pq.add(intArr1[i]);
        }
        System.out.println(pq);
        while(pq.peek()!=null){
            System.out.println(pq.poll()+" ");
        }
        System.out.println();

        Person dan = new Person("Dan", 44),
                john=new Person("John",66);

        Person[] person = {dan, new Person("Josh",55), new Person("Bill",33)};

        java.util.PriorityQueue<Person> pq2 = new java.util.PriorityQueue<>();
        for(int i =0; i<person.length; i++){
            pq2.add(person[i]);
        }
        System.out.println(pq2);
        System.out.println(pq2.comparator()); //null
        System.out.println(pq2.contains(dan));
        System.out.println(pq2.contains(john)); //false
        System.out.println(pq2.poll()); //true
        System.out.println(pq2);
        System.out.println(pq2.add(dan));
        System.out.println(pq2);
        System.out.println(pq2.offer(dan));
        System.out.println(pq2);
        System.out.println(pq2.remove(dan)); //true
        System.out.println(pq2);
        System.out.println(pq2.remove(john)); //false
        System.out.println(pq2);
        while(pq2.peek()!=null){
            System.out.println(pq2.poll()+" ");
        }
        System.out.println();
    }
}
