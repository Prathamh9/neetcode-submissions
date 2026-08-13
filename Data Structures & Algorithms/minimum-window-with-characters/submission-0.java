class Solution {
    public String minWindow(String s, String t) {
      if(t.isEmpty()) return "";
      HashMap<Character,Integer>countT=new HashMap<>(); 
      HashMap<Character,Integer>countS=new HashMap<>();  
        for(char c:t.toCharArray()){
            countT.put(c,countT.getOrDefault(c,0)+1);
        }

        int have=0,nedd=countT.size();
        int l=0;
        int []res={-1,-1};
        int resLen=Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            countS.put(c,countS.getOrDefault(c,0)+1);
            if(countT.containsKey(c)&& countS.get(c).equals(countT.get(c))){
                have ++;
            }
            while(have==nedd){
                if((r-l+1)<resLen){
                    resLen=r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                char leftChar=s.charAt(l);
                countS.put(leftChar,countS.get(leftChar)-1);
                if(countT.containsKey(leftChar) && countS.get(leftChar)<countT.get(leftChar)) {
                    have --;
                }
                l++;
            }
        }
        return resLen ==Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
    }
}
