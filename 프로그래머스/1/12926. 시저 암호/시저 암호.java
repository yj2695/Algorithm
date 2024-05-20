class Solution {
    public String solution(String s, int n) {
        String answer = "";
		for(int i=0; i<s.length(); i++) {

			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				answer+= (char)s.charAt(i)+n>'Z'? (char)(s.charAt(i)-26+n) : ((char)(s.charAt(i)+n));
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				answer+= (char)s.charAt(i)+n > 'z'? (char)(s.charAt(i)-26+n) : ((char)(s.charAt(i)+n));
			}
			else {
				answer+=" ";
			}

		}  
        return answer;
    }
}