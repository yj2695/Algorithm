class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long k = x;
        
        for(int i=0; i<n; i++){
            answer[i] = (long) x;
            x+=k;
        }
        
        return answer;  
    }
}