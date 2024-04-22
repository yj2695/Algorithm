import java.util.*;
class Solution {
    public String[] solution(String myString) {

		myString = myString.replace("x", " ");
		String[] answer = myString.trim().split("[ ]+");
        Arrays.sort(answer);
        
        return answer;
    }
}