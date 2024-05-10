import java.util.Stack;
class Solution {
    boolean solution(String s) {
		Stack<String> k = new Stack<String>();
		
        if(s.substring(0,1).equals(")")) return false;   
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.substring(i,i+1).equals("(")) {
				k.push(s.substring(i,i+1));				
			}
			else if(s.substring(i,i+1).equals(")") && k.isEmpty()) {
				return false;
			}
			else k.pop();
		}
		
		if(k.isEmpty()) return true;
		else return false;
    }
}