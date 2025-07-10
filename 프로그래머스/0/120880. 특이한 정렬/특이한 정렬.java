import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] numlistObj = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(numlistObj, (a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);

            if (distA == distB) {
                return b - a;
            } else {
                return distA - distB;
            }
        });
        
        int[] answer = Arrays.stream(numlistObj).mapToInt(i -> i).toArray();
        
        return answer;
    }
}