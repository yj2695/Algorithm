import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
		HashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i : arr) {
			if(set.size()==k) break;
			set.add(i);
		}
		
		int[] answer = new int[k];
		int x =0;
		
		for(int i : set) {
			answer[x++] = i;
		}
		if(set.size()<k) {
			for(int j=set.size(); j<k; j++) {
				System.out.println(j);
				answer[x++] = -1;
			}
		}
        return answer;
    }
}