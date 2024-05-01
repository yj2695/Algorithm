import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        
        Arrays.sort(sides);
        int answer = 0;
        
        // 가장 긴 변 포함
		answer += sides[1] - (sides[1]-sides[0]);
		
		// 나머지 한 변이 가장 긴 변인 경우
		answer += (sides[1]+sides[0]) - sides[1] -1;        
        
        return answer;
    }
}