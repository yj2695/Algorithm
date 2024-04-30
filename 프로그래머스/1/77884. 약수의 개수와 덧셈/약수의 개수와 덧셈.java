class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
		for(int i= left; i<=right; i++) {
			
			int k = 1;
			int count = 1;
			
			while(k!=i) {
				if(i%k==0) count++;
				k++;
			}
			
			if(count%2==0) answer+=i;
			else answer-=i;

		}        
        return answer;
    }
}