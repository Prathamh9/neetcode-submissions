class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count =new HashMap<>();
        int result=0,maxcount=0;
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
            if(count.get(num)>maxcount){
                result=num;
                maxcount=count.get(num);
            }
        }
        return result;
    }
}