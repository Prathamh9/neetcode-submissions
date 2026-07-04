class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>>res=new HashMap<>();
        for(String s:strs){
            char []ttt=s.toCharArray();
            Arrays.sort(ttt);
            String key=new String(ttt);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
