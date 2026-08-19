class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> cltoop=new HashMap<>();
        cltoop.put(')','(');
        cltoop.put(']','[');
        cltoop.put('}','{');
        for(char c:s.toCharArray()){
            if(cltoop.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==cltoop.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else{
                    stack.push(c);
                }

        }
        return stack.isEmpty();
    }
}
