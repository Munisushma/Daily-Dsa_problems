class Solution {
    public int reverseDegree(String s) {
        int totalDegree =0;
        for(int i=0;i<s.length();i++){
            int reversedIndex = 26-(s.charAt(i)-'a');
            int index = i+1;
            totalDegree+=reversedIndex*index;
        }
        return totalDegree;
    }
}