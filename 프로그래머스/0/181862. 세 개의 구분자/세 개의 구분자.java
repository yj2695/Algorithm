class Solution {
    public String[] solution(String myStr) {
        
		myStr = myStr.replaceAll("[a-c]", " ").trim();
		myStr = myStr.replaceAll("[ ]+", " ");
        
		if(myStr.equals("")) {
			myStr = "EMPTY";
		}
		
		String[] answer = myStr.split(" ");
        
        return answer;
    }
}