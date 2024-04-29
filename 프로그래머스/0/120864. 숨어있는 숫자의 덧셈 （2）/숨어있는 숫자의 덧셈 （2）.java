class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
		String s = my_string.replaceAll("[A-Za-z]", " ").trim();
        if(s.equals("")) return 0;
        
		String[] s2 = s.split("[ ]+");

		for(int i=0; i<s2.length; i++) {
			answer+=Integer.valueOf(s2[i]);
		}
        
        return answer;
    }
}