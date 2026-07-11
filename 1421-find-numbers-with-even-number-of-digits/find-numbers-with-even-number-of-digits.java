class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(iseven(nums[i])==true)
            c++;
            else continue;
        }
        return c;
        }
    static boolean iseven(int n){
            int c=0;
            while(n>0){
                c++;
                n/=10;
            }
            if(c%2==0) return true;  
            return false;  
    }
}