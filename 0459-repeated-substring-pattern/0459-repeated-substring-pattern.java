class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String str = (s + s).substring(1, 2 * s.length() - 1);
        return str.contains(s);
    }
}