import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
		int len = 1;
		
		while(true) {
			if(arr.length<=len) break;
			len*=2;	
		}
        
        int[] answer = new int[len];
        answer = Arrays.copyOf(arr, len);
        
        return answer;
        
    }
}