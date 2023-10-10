import java.util.* ;
import java.io.*; 
public class Solution {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getAllStrings("112")));
	}

	public static String[] getAllStrings(String s) {
		ArrayList<String> al = solve("",s);
		return convertToWord(al);
	}
	public static ArrayList<String> solve(String p, String up){
		ArrayList<String> al = new ArrayList<>();
		if(up.isEmpty()){
			if(!p.isEmpty()){
				al.add(p);
			}
			return al;
		}
		char c = up.charAt(0);
		al.addAll(solve(p+c, up.substring(1)));
		al.addAll(solve(p, up.substring(1)));
		return al;
	}
	public static String[] convertToWord(ArrayList<String> al){
		String[] s = new String[al.size()];
		for(int i=0; i<al.size(); i++){
			s[i] = convert(al.get(i));
		}
		return s;
	}
	public static String convert(String s){
		StringBuilder word = new StringBuilder();
		for(int i=0; i<s.length(); i++){
			int temp = Integer.parseInt(String.valueOf(s.charAt(i)));
			char ch = (char) (int)('a'+temp-1);
			word.append(ch);
		}
		return word.toString();
	}
}