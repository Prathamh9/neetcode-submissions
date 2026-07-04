class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>count=new HashSet<>();
        for (int n:nums){
            count.add(n);
        }
        int longestseq=0;
        for(int n:nums){
            if(!count.contains(n-1)){
                int length=0;
                while(count.contains(n+length)){
                    length++;
                }
                longestseq=Math.max(longestseq,length);
            }
        }
        return longestseq;
    }
}
