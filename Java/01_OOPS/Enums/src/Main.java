class Main{
    enum Level {
        LOW,MEDIUM,HIGH;
    }

    public static void main(String[] args) {
        Level myVaar = Level.MEDIUM;
        System.out.println(myVaar);

        for(Level myVar: Level.values()){
            System.out.println(myVar);
        }
    }
}