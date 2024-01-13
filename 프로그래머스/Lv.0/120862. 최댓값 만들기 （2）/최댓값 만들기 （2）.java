import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int s1 = numbers[0]*numbers[1];
        int s2 = numbers[numbers.length-1]*numbers[numbers.length-2];
        
        return s1>s2? s1 : s2;
    }
}