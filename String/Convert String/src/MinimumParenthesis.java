import java.util.*;
public class MinimumParenthesis {
    public static void main(String[] args) {
        System.out.println(Solution.minimumParentheses(")(("));
        System.out.println(Solution.minimumParentheses("((((("));
    }
    public class Solution {
        public static int minimumParentheses(String pattern) {
            int count = 0;
            Stack<Character> st = new Stack<>();
            for(int i =0; i<pattern.length(); i++){
                char ch = pattern.charAt(i);
                if(ch=='('){
                    st.add(ch);
                }else{
                    if(!st.isEmpty()){
                        st.pop();
                    }else{
                        count++;
                    }
                }
            }
            count+=st.size();
            return count;
        }
    }
}
