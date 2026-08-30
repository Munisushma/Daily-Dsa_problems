class Solution {
    public int maxProduct(int[] nums) {
        int maxPro = nums[0];
        int minpro = nums[0];
        int result = nums[0];
        for(int i=1;i<nums.length;i++){
           if(nums[i]<0){
            int temp = maxPro;
            maxPro=minpro;
            minpro = temp;
           }
           maxPro = Math.max(nums[i],maxPro*nums[i]);
           minpro = Math.min(nums[i],minpro*nums[i]);
            result = Math.max(result,maxPro);
        }
       
        return result;
    }
}