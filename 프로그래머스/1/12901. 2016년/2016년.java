class Solution {
    public String solution(int a, int b) {
		String[] w = {"THU", "FRI", "SAT","SUN", "MON", "TUE", "WED"};
		int[] m = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int k = 0;
		for(int i=0; i<a-1; i++) {
			k+= m[i];
		}
		k += b;
		String answer = w[k%=7];
        
        return answer;
    }
}