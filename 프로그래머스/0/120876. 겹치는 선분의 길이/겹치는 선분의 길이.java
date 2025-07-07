class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] count = new int[201];
        int offset = 100;

        for(int i=0; i<lines.length; i++) {
            int start = lines[i][0];
            int end = lines[i][1];

            for(int j=start; j<end; j++) {
                count[j + offset]++;
            }
        }
        
        for (int i=0; i<count.length; i++) {
            if (count[i] >=2) {
                answer++;
            }
        }
        
        return answer;
    }
}