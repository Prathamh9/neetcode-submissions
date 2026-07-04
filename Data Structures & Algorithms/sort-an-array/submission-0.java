class Solution {
  private void sort(int []nums){
    HashMap<Integer,Integer> mapn=new HashMap<>();
       int minval=nums[0],maxval=nums[0];
       for(int i=0;i<nums.length;i++){
        minval=Math.min(minval,nums[i]);
        maxval=Math.max(maxval,nums[i]);
        mapn.put(nums[i],mapn.getOrDefault(nums[i],0)+1);
       }
       int index=0;
       for(int val=minval;val<=maxval;++val){
        while(mapn.getOrDefault(val,0)>0){
          nums[index]=val;
          index +=1;
          mapn.put(val,mapn.get(val)-1);
        }
       }
  }
    public int[] sortArray(int[] nums) {
      sort(nums);
      return nums;
    }
}