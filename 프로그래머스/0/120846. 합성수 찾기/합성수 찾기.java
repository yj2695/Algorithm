class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] nums = new int[n+1];
        
        for(int i=2; i<n+1; i++){
            
            if(nums[i]>=1) answer++;
            
            for(int j=1; i*j<=n; j++){
                nums[i*j]++;
            }
        }
        return answer;
    }
}