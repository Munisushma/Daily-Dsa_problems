class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(getDigitSum(nums[i])==i){
                return i;
            }  
    }
    return -1;
    }
    private int getDigitSum(int num){
        int sum=0;
        while(num>0){
            int digit= num%10;
            sum+=digit;
            num=num/10;
        }
        return sum;
    }
}