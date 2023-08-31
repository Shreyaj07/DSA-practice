public class EncodeTheMessage {
    public static void main(String[] args) {
        Solution.encode("aaaabbbccdaa");
    }
    public class Solution {
        public static String encode(String message) {
            StringBuilder sb = new StringBuilder();
            char character = message.charAt(0);
            int count = 1;
            message = message + " ";
            for (int i = 1; i < message.length(); i++) {
                if (message.charAt(i) == character) {
                    count++;
                } else {
                    sb.append(character).append(count);
                    character = message.charAt(i);
                    count = 1;
                }
            }
            System.out.println(sb);
            return sb.toString();
        }
    }
}
