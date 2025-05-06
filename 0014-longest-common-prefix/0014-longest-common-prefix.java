class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        boolean found = true;
        StringBuilder res = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
       
        for (String s : strs) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }

        for (int j = 0; j < minLength && found; j++) {
            char currentChar = str.charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != currentChar) {
                    found = false;
                    break;
                }
            }
            if (found) {
                res.append(currentChar);
            }
        }
        return res.toString();
    }
}