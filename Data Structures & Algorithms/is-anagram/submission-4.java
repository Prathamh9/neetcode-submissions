class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>sstring=new HashMap<>();
        HashMap<Character,Integer>tstring=new HashMap<>();
        for(int i=0;i<s.length();i++){
            sstring.put(s.charAt(i),sstring.getOrDefault(s.charAt(i),0)+1);
            tstring.put(t.charAt(i),tstring.getOrDefault(t.charAt(i),0)+1);
        }
        return sstring.equals(tstring);
    }
}
