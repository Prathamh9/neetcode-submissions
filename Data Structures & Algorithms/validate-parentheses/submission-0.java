class Solution {
    public boolean isValid(String s) {
       Stack<Character>sta=new Stack<>();
       Map<Character,Character>mapp=new HashMap<>(); 
       mapp.put(')','(');
       mapp.put(']','[');
       mapp.put('}','{');
       for(char c:s.toCharArray()){
        if(mapp.containsKey(c)){
            if(!sta.isEmpty() && sta.peek()==mapp.get(c)){
                sta.pop();
            }
            else{
                return false;
            }
        }
        else{
            sta.push(c);
        }
       }
       return sta.isEmpty();
    }
}
