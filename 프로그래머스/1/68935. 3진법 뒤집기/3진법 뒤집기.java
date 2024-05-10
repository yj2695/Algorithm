class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 3진법으로 바꾸기
        String tn = Integer.toString(n, 3);
		
        // 3진법 반전
		StringBuilder tnb = new StringBuilder(tn);
		tnb = tnb.reverse();
		String k = tnb.toString();
       
        // 10진법 표현하기
		int l = 0;
		
		for(int i=k.length()-1; i>=0; i--) {
			answer += Integer.valueOf(k.charAt(i)-48) * Math.pow(3, l);
			l++;
		}
        
        
        return answer;
    }
}