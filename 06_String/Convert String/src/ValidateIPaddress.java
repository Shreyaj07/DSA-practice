public class ValidateIPaddress {
    public static void main(String[] args) {
        System.out.println(Solution.isValidIPv4("122.122.122.122"));
        System.out.println(Solution.isValidIPv4("12.32.k"));
    }

    public class Solution {

        public static boolean isValidIPv4(String ipAddress) {
            String[] host = ipAddress.split("\\.");
            if(host.length!=4){
                return false;
            }
            for(int i =0; i<host.length; i++){
                try{
                    int n = Integer.parseInt(host[i]);
                    if(n<0 || n>255){
                        return false;
                    }
                }catch(Exception e){
                    return false;
                }
            }
            return true;
        }

    }

}
