public class Student {
    int rno;
    String name;
    float marks;
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    //constructor overloading
    public Student() {
        this(1,"Vaishnavi",39);
    }
}
