class Solution {
    public int[] solution(String myString) {
        
		String[] k = myString.split("x");
		int[] answer = {};
		
		if(myString.charAt(myString.length()-1)=='x') {
			answer = new int[k.length+1];
		}
		else {
			answer = new int[k.length];
		}

		for(int i=0; i<k.length; i++) {
			answer[i] = k[i].length();
		}
        
        return answer;
    }
}