import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
		int[] order = Arrays.copyOf(emergency, emergency.length);
		Arrays.sort(order);
        
		int[] answer = new int[emergency.length];
		int k = emergency.length;
		
		for(int i=0; i<order.length; i++) {
			
			for(int j=0; j<emergency.length; j++) {
				
				if(order[i] == emergency[j]) {
					answer[j] = k;
					k--;
				}
			}
		}        
        
        return answer;
    }
}