class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>mapn=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int diff=target-numbers[i];
            if(mapn.containsKey(diff))
            return new int []{mapn.get(diff),i+1};
            mapn.put(numbers[i],i+1);
        }
        return new int []{};
    }
}
