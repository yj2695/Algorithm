class Solution {
    public int solution(int n) {
		int i=1;
		int answer = 1;
		
		while(i<n) {
			answer++;		
			i*=answer;
		}
		
		if(i!=n) answer-=1;

        return answer;
    }
}