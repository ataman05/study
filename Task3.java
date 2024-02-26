public class Task3 {
        public static void main(String[] args){
            String[] strs = new String[]{"forward", "follower", "flith"};
            System.out.println(longestCommonPrefix(strs));
        }
        public static String longestCommonPrefix(String[] strs){
            if (strs.length == 0){
                return "";
            }
            if (strs.length == 1){
                return strs[0];
            }
            String prif = strs[0];

            for (int i = 0; i < strs.length; i++) {
                String word = strs[i];
                int count = 0;
                int len_prif = 0;
                while (count < prif.length() && count < word.length()){
                    if(prif.charAt(count) == word.charAt(count)){
                        len_prif++;
                    }else {
                        break;
                    }
                    count++;
                }
                prif = prif.substring(0,len_prif);
            }
            return prif;
        }
    }
