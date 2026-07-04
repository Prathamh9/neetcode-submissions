class Solution {
    public int[] getConcatenation(int[] nums) {
        int num=nums.length;
        int[] ans=new int [2*num];
        for(int i=0;i<num;i++){
            ans[i]=ans[i+num]=nums[i];
        }
        return ans;
    }
}