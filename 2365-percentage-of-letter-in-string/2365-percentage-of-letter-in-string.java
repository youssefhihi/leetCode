class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        int length = s.length();
        for(int i = 0; i < length; i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }
        int res = (count * 100) / length;
        return res;
    }
}