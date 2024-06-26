class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int a = 0;
        int b = 1;
        
        for(int i=1; i<n; i++){
            answer = a+b;
            a=b%1234567;
            b=answer%1234567;
        }
        
        return answer%1234567;
    }
}