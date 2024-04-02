class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
		StringBuilder tmp = new StringBuilder(my_string.substring(s,e+1));
        
		answer += my_string.substring(0,s) + tmp.reverse() + my_string.substring(e+1, my_string.length()); 		
        return answer;
    }
}