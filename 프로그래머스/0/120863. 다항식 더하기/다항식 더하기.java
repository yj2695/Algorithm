class Solution {
    public String solution(String polynomial) {
        String answer = "";
		String[] k = polynomial.split(" ");

		int n = 0;
		int m = 0;
		
		for(String s : k) {
			
			if(s.contains("x")) {
				n+= s.substring(0,s.length()-1).equals("")? 1 : Integer.valueOf(s.substring(0,s.length()-1));
			}
			else if(!s.contains("+") && !s.contains("x")) {
				m+= Integer.valueOf(s);
			}
			
		}
		
		
		if(n==0 && m!=0) {
			answer = m +"";
		}
		else if(n!=0 && m==0) {
			answer = n+"x";
		}
		else {
			answer = n+"x" + " + " + m;
		}
        
 		if(n==1) {
			answer = answer.substring(1);
		}       
        
        return answer;
    }
}