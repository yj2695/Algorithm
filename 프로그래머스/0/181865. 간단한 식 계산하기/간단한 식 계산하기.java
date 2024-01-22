class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] s = binomial.split(" ");
        
        int n1 = Integer.parseInt(s[0]);
        int n2 = Integer.parseInt(s[2]);
        
        switch(s[1]){
		case "+" : answer = n1 + n2; break;
		case "-" : answer = n1 - n2; break;
		case "*" : answer = n1 * n2; break;
        }
        
        return answer;
    }
}