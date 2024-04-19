class Solution {
    public int solution(String s) {
        int answer = 0;
		String[] k = s.split(" ");
        
		for(int i=0; i<k.length; i++) {
			if(k[i].equals("Z")) answer-=Integer.valueOf(k[i-1]);
			else answer += Integer.valueOf(k[i]);
		}
        
        return answer;
    }
}