class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>res=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int n=nums[i];
        int diff=target-n;
        if(res.containsKey(diff)){
            return new int []{res.get(diff),i};
        }
        res.put(n,i);
      } 
      return new int []{}; 
    }
}
