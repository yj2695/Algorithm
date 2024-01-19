class Solution {
    public int solution(String myString, String pat) {
        String temp = myString.replace('A', 'C');
		String temp2 = temp.replace('B', 'A');
		String s = temp2.replace('C', 'B');
        
        return s.contains(pat)? 1:0;
    }
}