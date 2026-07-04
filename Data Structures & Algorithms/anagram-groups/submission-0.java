class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mapn=new HashMap<>();
        for(String s:strs){
        int []freq=new int[26];
            for(char c:s.toCharArray()){
                freq[c -'a']++;
            }
            String key=Arrays.toString(freq);
            mapn.putIfAbsent(key,new ArrayList<>());
            mapn.get(key).add(s);
        }
        return new ArrayList<>(mapn.values());
          
    }
}
