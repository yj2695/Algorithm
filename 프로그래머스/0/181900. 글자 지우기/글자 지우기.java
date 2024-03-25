import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int j=0;
        Arrays.sort(indices);
        
		for(int i=0; i<my_string.length(); i++) {
			
			if(i==indices[j]) {
				if(j<indices.length-1) j++;
				continue;
			}
			
			answer += my_string.charAt(i);
			
		}        
        
        return answer;
    }
}