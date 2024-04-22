import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        my_string = my_string.trim();
		String s = "";
		
		for(int i=0; i<my_string.length(); i++) {
            
			if(my_string.charAt(i)==' ' && s.endsWith(",")) {
				continue;
			}
			else if(my_string.charAt(i)==' ') {
				s+=",";
			}
			else {
				s += my_string.charAt(i);
			}
		}
		
		String[] answer = s.split(",");
        
        return answer;
        
    }
}