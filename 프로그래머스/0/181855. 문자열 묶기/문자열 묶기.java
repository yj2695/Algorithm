import java.util.*;
class Solution {
    public int solution(String[] strArr) {
		int maxLen = 0;
		
		for(String str : strArr) {
			maxLen = str.length() > maxLen ? str.length() : maxLen; 
		}
		
		int[] k = new int[maxLen];
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<maxLen; j++) {
				if(strArr[i].length() == j+1) k[j]++;				
			}
		}
		
		Arrays.sort(k);
        
        return k[maxLen-1];
    }
}