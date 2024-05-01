class Solution {
    public String[] solution(String my_str, int n) {
		String[] answer = new String[(int) Math.ceil(my_str.length()/(double)n)];
		
		int k = 0;
		
		for(int i=0; i<my_str.length(); i++) {
			
			if(k!=answer.length-1) {
				answer[k] = my_str.substring(i, i+n);
			}
			else {
				answer[k] = my_str.substring(i);
			}
			
			i+=n-1;
			k++;
		}
        return answer;
    }
}