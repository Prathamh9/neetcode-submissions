class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mapn=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(mapn.containsKey(diff)){
                return new int []{mapn.get(diff),i};
            }
            mapn.put(nums[i],i);
        }
        return new int []{};
    }
}
