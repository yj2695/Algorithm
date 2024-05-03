class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String k = String.valueOf(Math.sqrt(n));
        if(k.substring(k.length()-2,k.length()).equals(".0")) {
			answer = (long)Math.pow(Math.sqrt(n)+1, 2);
		}
        else answer = -1;
        return answer;
    }
}