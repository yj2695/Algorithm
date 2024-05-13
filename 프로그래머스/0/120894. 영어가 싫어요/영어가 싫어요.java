class Solution {
    public long solution(String numbers) {
        long answer = 0;

    	String[] n = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	String[] m = {"0","1","2","3","4","5","6","7","8","9"};
    
    	for(int i=0; i<n.length; i++) {
    		numbers = numbers.replaceAll(n[i], m[i]);
    	}
    	
    	answer = Long.valueOf(numbers);
    
        return answer;
    }
}