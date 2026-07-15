class Solution {
    public int search(int[] nums, int target) {
        int index=-1;
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
            index=mid;
            break;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else
            start=mid+1;
        }
        return index;    
    }
}