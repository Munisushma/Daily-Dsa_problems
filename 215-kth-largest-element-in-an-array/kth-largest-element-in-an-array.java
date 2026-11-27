class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
        }
        for(int num:nums){
            while(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}