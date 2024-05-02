class Solution {
    public String solution(String s) {
        String answer = "";
		String[] sa = s.split(" ",-1);

		for(int i=0; i<sa.length; i++) {
			for(int j=0; j<sa[i].length(); j++) {
				if(j%2==0) {
					answer+=sa[i].substring(j, j+1).toUpperCase();
				}
				else {
					answer+=sa[i].substring(j, j+1).toLowerCase();
				}
			}
			answer+=" ";
		}
		
		answer = answer.substring(0, answer.length()-1);
        
        return answer;
    }
}