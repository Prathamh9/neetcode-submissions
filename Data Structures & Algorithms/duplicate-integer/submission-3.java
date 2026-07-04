class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet<Integer> mapn=new HashSet<>();
     for(int num:nums){
        if(mapn.contains(num)) return true;
        mapn.add(num);
     }
     return false;
    
    }
}