class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder builder = new StringBuilder();
        int h = 0;
        boolean found = false;
        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i) == ch) {
                found = true;
            }
        }
        if(!found){
            return word;
        }
        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i) != ch) {
                builder.append(word.charAt(i));
            }else if(word.charAt(i) == ch){
                builder.append(word.charAt(i));
                h = i + 1;
                break;
            }
        }
       return builder.reverse().append(word.substring(h, word.length())).toString();
    }
}