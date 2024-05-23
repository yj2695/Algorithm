class Solution {
    public String[] solution(String[] picture, int k) {
        
		String[] rp = new String[picture.length];
	
		for(int i=0; i<rp.length; i++) {
			rp[i] = "";
			for(int j=0; j<picture[i].length(); j++) {
				rp[i] += picture[i].substring(j,j+1).repeat(k);
				
			}
		}
		
		
		String[] answer = new String[picture.length*k];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = rp[i/k];	
		}
        return answer;
    }
}