class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		
		answer[1] = denom1*denom2;
		answer[0] = numer1 * (answer[1]/denom1) + numer2 * (answer[1]/denom2);
		
		int k = answer[1];
		
		while(true) {	
			if(answer[1]%k==0 && answer[0]%k==0) break;
			k--;
		}
	
		answer[1] = answer[1]/k;
		answer[0] = answer[0]/k;
        
        return answer;
    }
}