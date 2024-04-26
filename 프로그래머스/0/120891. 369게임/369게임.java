class Solution {
    public int solution(int order) {
		int answer = 0;
		String s = String.valueOf(order);
		
		for(int i=0; i<s.length(); i++) {
			if(Integer.valueOf(s.substring(i,i+1))!=0 && Integer.valueOf(s.substring(i,i+1))%3==0) {
				answer++;
			}
		}   
        return answer;
    }
}