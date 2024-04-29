import java.util.*;
class Solution {
    public String solution(String s) {
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		
		
		for(int i=0; i<s.length(); i++) {
			
			String k = s.substring(i, i+1);
			
			if(!arr.contains(k)) {
				if(arr2.contains(k)) continue;
				arr.add(k);
			}
			else if(arr.contains(k) && !arr2.contains(k)) {
				arr.remove(k);
				arr2.add(k);
			}
		}
		
		Collections.sort(arr);
		
		String answer = "";
		for(String k : arr) {
			answer+=k;
		}

        return answer;
    }
}