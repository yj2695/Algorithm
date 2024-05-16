class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
		String tmp = A;
		int chk = 0;
		
		while(answer<A.length()) {
			
			tmp = tmp.substring(tmp.length()-1) + tmp.substring(0,tmp.length()-1);
			answer++;
			
			if(tmp.equals(B)) {
				chk++;
				break;
			}			
		}
        
		if(A.equals(B)) answer=0;
		if(!A.equals(B) && chk==0) {
			answer = -1;
		}
        
        return answer;
    }
}