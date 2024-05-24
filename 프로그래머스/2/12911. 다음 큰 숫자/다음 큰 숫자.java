class Solution {
    public int solution(int n) {
		int answer = n+1;
		
		int ctbn = Integer.bitCount(n);
		
		while(true) {
			
			int ctba = Integer.bitCount(answer);

			if(ctbn==ctba) break;
			
			answer++;
		}
        return answer;
    }
}