class Solution {
    public int[] solution(int num, int total) {
		int[] answer = new int[num];
		
		if(num%2==1) {
			
			for(int i=0; i<answer.length; i++) {
				answer[i] = (total/num) + (i-num/2);
			}
			
		}
		else {
			
			for(int i=0; i<answer.length; i++) {
				answer[i] = (total/num) + (i-num/2)+1;
			}
			
        }
        return answer;
    }
}