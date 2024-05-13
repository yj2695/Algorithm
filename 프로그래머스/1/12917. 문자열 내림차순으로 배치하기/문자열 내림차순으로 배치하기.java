import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
    	String ls = s.replaceAll("[a-z]", "");
    	String ss = s.replaceAll("[A-Z]", "");
    	
    	
    	String[] arrs = ss.split("");
    	Arrays.sort(arrs, Comparator.reverseOrder());
    	String[] arrl = ls.split("");
    	Arrays.sort(arrl, Comparator.reverseOrder());
    	
    	
    	for(String k : arrs) {
    		answer+=k;
    	}
    	for(String l : arrl) {
    		answer+=l;
    	}
        
        
        return answer;
    }
}