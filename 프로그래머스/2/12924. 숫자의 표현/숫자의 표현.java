class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int x=1; x*(x-1)/2 < n; x++ ){
            if((2*n - x*(x-1)) % (2*x) == 0){
                answer++;
            }
        }
        
        return answer;
    }
}