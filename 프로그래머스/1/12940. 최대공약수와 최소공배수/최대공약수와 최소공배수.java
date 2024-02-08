class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int k = Math.min(n, m);
        
        while(k>=1){
            if(n%k == 0 && m%k == 0) break;
            k--;
        }
        
        answer[0] = k;
        answer[1] = k * n/k * m/k;
        
        return answer;
    }
}