public class Main {

    public static void main(String[] args) {
        System.out.println(removeChar("Vaishnavi",'a',0));
        System.out.println(removeChar("Sjtjrjijnjg",'j',0));
    }

    static StringBuilder removeChar(String original, char ch, int start){
        StringBuilder modified = new StringBuilder();
        if(start==original.length()){
            return new StringBuilder(modified.toString());
        }
        if(original.charAt(start)!=ch){
            modified.append(original.charAt(start));
        }
        return modified.append(removeChar(original,ch,start+1));
    }
}