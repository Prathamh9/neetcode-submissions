class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>prefixsum=new HashMap<>();
       int ccsum=0,res=0;
       prefixsum.put(0,1);
       for(int num:nums){
        ccsum +=num;
        int diff=ccsum-k;
        res+=prefixsum.getOrDefault(diff,0);
        prefixsum.put(ccsum,prefixsum.getOrDefault(ccsum,0)+1);

       }
        return res;
    }
   
}