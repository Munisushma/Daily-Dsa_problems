class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left=0;
        int right = n*m-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int midvalue =matrix[mid/m][mid%m];
            if(midvalue==target){
                return true;
            }
            else if(midvalue<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;

    }
}