class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            if(totsum(accounts[i])>max){
                max=totsum(accounts[i]);
            }
            else continue;
        }
        return max;
    }
    static int totsum(int[] num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        return sum;
    }
}