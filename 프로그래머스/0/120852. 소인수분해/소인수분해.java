import java.util.*;
class Solution {
    public Integer[] solution(int n) {
        
		HashSet<Integer> s = new HashSet<Integer>();

		for(int i=2; i<=n; i++) {
			while(n%i==0) {
				n = n/i;
				s.add(i);
			}
			
			if(n==1) break;
		}
        
        Integer[] answer = s.toArray(new Integer[0]);
		Arrays.sort(answer);
        
        return answer;
    }
}