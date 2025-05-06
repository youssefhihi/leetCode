class Solution {
    public boolean areOccurrencesEqual(String s) {
        char[] chars = s.toCharArray();
        List<Integer> num = new ArrayList<>();
        int count = 0;
        for(int i = 0; i< chars.length; i++){
            count = 0;
            for(int j=0; j< chars.length; j++){
                if(chars[i] == chars[j]){
                    count++;
                }
            }
            num.add(count);          
        }


    for(Integer n : num){
        if(!n.equals(num.get(0))){
            return false;
        }
    }
    return true;
 }
}