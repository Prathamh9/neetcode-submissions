class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int [] res=new int [n];
        for(int i=0;i<nums.length;i++){
            int prog=1;
            for(int j=0;j<nums.length;j++){
                if(i !=j)
                prog *= nums[j];
            }
            res[i]=prog;
        }
        return  res;
        
    }
}  
