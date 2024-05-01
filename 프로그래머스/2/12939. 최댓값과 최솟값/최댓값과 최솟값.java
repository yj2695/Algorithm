import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        
		String[] k = s.split(" ");
		int[] n = new int[k.length];
        
		for(int i=0; i<n.length; i++) {
			n[i] = Integer.valueOf(k[i]);
		}
		Arrays.sort(n);
		
		answer += n[0] + " " +  n[n.length-1];        
        
        return answer;
    }
}