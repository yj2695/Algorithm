class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        
        int[] answer = new int[sb.length()];
        for(int i=0; i<sb.length(); i++){
            answer[i] = Integer.valueOf(sb.substring(i, i+1));
        }
        
        return answer;
    }
}