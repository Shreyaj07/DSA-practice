interface firstInterface{
    void myMethod();
}
interface secondInterface{
    void myOtherMethod();
}

class DemoClass implements firstInterface, secondInterface{

    @Override
    public void myMethod() {
        System.out.println("Some text...");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class Main{
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}