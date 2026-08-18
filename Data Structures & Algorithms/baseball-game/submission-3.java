class Solution {
    public int calPoints(String[] operations) {
        int res=0;
        Stack<Integer>stta=new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int top=stta.pop();
                int newTop=top+stta.peek();
                stta.push(top);
                stta.push(newTop);
                res +=newTop;
            }
            else if(op.equals("D")) {
                stta.push(2*stta.peek());
                res +=stta.peek();
            }
            else if(op.equals("C")){
                res -=stta.pop();
            }
            else{
                stta.push(Integer.parseInt(op));
                res +=stta.peek();
            }
        }
        return res;
    }
}