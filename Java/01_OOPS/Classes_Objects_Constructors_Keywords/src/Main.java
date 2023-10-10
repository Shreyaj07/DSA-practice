import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        Student vaishnavi;
        students[0] = new Student();
        students[0].rno = 1;
        students[0].name = "vaishnavi";
        students[0].marks = 10;
        //new => dynamically allocates memory and returns reference to it and that ref is stored in teh variable
        //objects are stored in heap memory
        //all objects should be dynamically allocated
//        students[0] = new Student(1,"Vaishnavi",30);
        System.out.println(Arrays.toString(students));
        System.out.println(students[0].rno);
        System.out.println(students[0].name);
        System.out.println(students[0].marks);
        System.out.println(students[1]);

        students[2] = new Student();
//        when a primitiveness is final, you can't reassign it
        System.out.println(students[2].rno+" "+students[2].name+" "+students[2].marks);
        final A vk= new A("Vaishnavi Kale");
        A obj;
        for(int i=0; i<1000000000; i++){
            obj = new A("Random name");
        }

    }

}

 class A{
    final int num = 10;
    String name;

    public A(String name){
        System.out.println("Object created");
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}