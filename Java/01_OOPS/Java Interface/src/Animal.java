interface Animal{
    void animalSound();
    void slep();
}
class Pig implements Animal{

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void slep() {
        System.out.println("Zzzzzz......");
    }
}