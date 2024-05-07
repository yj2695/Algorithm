class Solution {
    public int solution(int[] numbers) {
		String s = "";
		for(int k : numbers) {
			s += k+"";
		}
		int answer = 0;
		for(int i=0; i<=9; i++) {
			if(s.contains(i+"")) continue;
			else answer+=i;
		}
		
        return answer;
    }
}