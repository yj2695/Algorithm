class Solution {
    public String solution(String s) {

		String[] sa = s.split(" ",-1);
		String answer = "";
		
		for(int i=0; i<sa.length; i++) {
			
			if(sa[i].length()==0) {
				answer+="";
			}
			else {
				// answer+= sa[i].charAt(0)>='a'? sa[i].substring(0,1).toUpperCase() : sa[i].substring(0,1);
				// answer+= sa[i].substring(1).toLowerCase();
                answer += sa[i].substring(0,1).toUpperCase() + sa[i].substring(1).toLowerCase();
			}
			
			answer+=" ";
		}
		
        return answer.substring(0,answer.length()-1);
    }
}