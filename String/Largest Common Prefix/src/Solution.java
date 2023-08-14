class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length==0){
            return prefix;
        }
        if(strs.length==1){
            return strs[0];
        }
        for(int i =0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            boolean present = true;
            for(int j=1; j<strs.length; j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    present = false;
                }
            }
            if(!present){
                return prefix;
            }else{
                prefix += ch;
            }
        }
        return prefix;
    }
}
