import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int solution(int[] array) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i : array) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		int maxVal = 0;
		int answer = 0;
		int maxChk = 0;

		for(Entry<Integer, Integer> i : map.entrySet()) {
			if(i.getValue()> maxVal) {
				maxVal = i.getValue();
				answer = i.getKey();
				
			}
			else if(i.getValue()==maxVal) {
				maxChk=maxVal;
			}
		}
		
		if(maxChk==maxVal) {
			answer = -1;
		}
        return answer;
    }
}