class Solution {
    public boolean isPalindrome(int x) {
        String y = "" + x;
       return String.join("", reverseErray(y.split(""))).equals(y);
    }
    private String[] reverseErray(String[] nums){
        String[] reversed = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }
        return reversed;
    }
}