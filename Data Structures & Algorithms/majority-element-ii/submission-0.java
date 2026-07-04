class Solution {
    public List<Integer> majorityElement(int[] nums) {
       HashMap<Integer,Integer>mapn=new HashMap<>();
        for(int n:nums){
            mapn.put(n,mapn.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int key:mapn.keySet()){
            if(mapn.get(key)>nums.length/3){
                res.add(key);
            }
        } 
        return res;       

    }
}