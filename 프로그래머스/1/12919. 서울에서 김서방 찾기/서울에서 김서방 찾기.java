class Solution {
    public String solution(String[] seoul) {
		int n = 0;
		
		for(String s : seoul) {
			if(s.equals("Kim")) break;
			n++;
		}        
        
        return "김서방은 " + n + "에 있다";
    }
}