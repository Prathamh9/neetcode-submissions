class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>count=new HashMap<>();
        int res=0,l=0,max=0;
        for(int i=0;i<s.length();i++){
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
            max=Math.max(max,count.get(s.charAt(i)));
            while((i-l+1)-max>k){
                count.put(s.charAt(l),count.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}
