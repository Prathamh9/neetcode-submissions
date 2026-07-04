class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> result=new HashSet<Integer>();
       for(int num:nums){
       if(result.contains(num)){
            return true;
       } 
       result.add(num);
       }
       return false;
    }
}