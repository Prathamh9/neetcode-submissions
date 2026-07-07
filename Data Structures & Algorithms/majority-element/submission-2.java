class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxcount=0,res=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)>maxcount){
                res=n;
                maxcount=map.get(n);
            }
        }
        return res;
    }
}