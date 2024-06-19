class Solution {
    public int[] solution(String s) {
		int[] answer = new int[2];
		String k = "";
		
		while(true) {
			
			if(s.equals("1")) break;
			
			k = s.replace("0", "");
			answer[1] += s.length() - k .length();
			
			s = Integer.toBinaryString(Integer.valueOf(k.length())) ;
			answer[0]+=1;
			
			
		}
        return answer;
    }
}