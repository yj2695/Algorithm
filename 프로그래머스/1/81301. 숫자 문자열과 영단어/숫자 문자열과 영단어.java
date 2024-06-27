class Solution {
    public int solution(String s) {
		String[] k = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        
 		for(int i=0; i<k.length; i++) {
			if(s.contains(k[i])) {
				s = s.replace(k[i], num[i]);
			}			
		}       
        return Integer.valueOf(s);
    }
}