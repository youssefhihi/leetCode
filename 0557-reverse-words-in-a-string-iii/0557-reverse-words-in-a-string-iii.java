class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            res[i] = new StringBuilder(arr[i]).reverse().toString();
        }

        return String.join(" ",res);
    }
}