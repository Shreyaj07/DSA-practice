class Solution {
    public static void main(String[] args) {
        Solution.bitwiseComplement(5);
    }
    public static int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder newBinary = new StringBuilder();
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='0'){
                newBinary.append('1');
            }else{
                newBinary.append('0');
            }
        }
        System.out.println(Integer.parseInt(newBinary.toString(),2));

        return Integer.parseInt(newBinary.toString());
    }
}