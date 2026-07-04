class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> mapn=new HashSet<>();
        for(int n:nums){
            if(mapn.contains(n)) return true;
        mapn.add(n);
        }
        return false;
    }
}