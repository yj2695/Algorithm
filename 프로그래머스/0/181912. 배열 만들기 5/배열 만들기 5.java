import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(String str : intStrs) {
			if(Integer.parseInt(str.substring(s, s+l))>k) {
				list.add(Integer.parseInt(str.substring(s, s+l)));
			}
		}

        return list.stream().mapToInt(i -> i).toArray();
    }
}