class Solution {
    public boolean isPalindrome(int x) {
       int copy=x; int x1=0;
       while(x>0){
        x1=x1*10+(x%10);
        x/=10;
       } 
       if(x1==copy)
       return true;
       return false;
    }
}