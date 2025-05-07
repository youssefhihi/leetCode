class Solution {
    public  boolean strongPasswordCheckerII(String password) {

        int l = password.length();
        if( l < 8){
            return false;
        }
        boolean isUpper = false;
        boolean isLower = false;
        char y = ' ';

        if(hasD(password) && hasSc(password)){
            for(int i = 0; i < l; i++ ){
                if(Character.isLowerCase(password.charAt(i))){
                    isLower = true;
                }
                if(Character.isUpperCase(password.charAt(i))){
                    isUpper = true;
                }
                if (password.charAt(i) != y){
                    y = password.charAt(i);
                }else{
                    return false;
                }
            }
            return isLower && isUpper;

        }
        return false;
    }
    public boolean hasSc( String password){
        String sc = "!@#$%^&*()-+";
        char[] chars = sc.toCharArray();
        for(int i = 0; i < chars.length; i++ ){
            if(password.contains(chars[i] + "")){
                return true;
            }
        }
     
        return false;
    }
    public boolean hasD( String password){
        String l = "0987654321";
        char[] chars = l.toCharArray();
        for(int i = 0; i < chars.length; i++ ){
            if(password.contains(chars[i]+ "")){
                return true;
            }
        }
        return false;
    }

}