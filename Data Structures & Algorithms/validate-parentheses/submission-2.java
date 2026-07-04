class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack=new Stack<>();
        HashMap<Character,Character> res=new HashMap<>();
        res.put(')','(');
        res.put('}','{');
        res.put(']','[');
        for(char c:s.toCharArray()){
            if(res.containsKey(c)){
                if(!stack.isEmpty()&&stack.peek()==res.get(c)){
                    stack.pop();
                }
                 else return false;
            }
            else{
                stack.push(c);
            }
           
        }
        return stack.isEmpty();
    }
}
