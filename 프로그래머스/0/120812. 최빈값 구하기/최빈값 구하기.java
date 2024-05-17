import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int solution(int[] array) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0; i<array.length; i++) {
			if(map.getOrDefault(array[i], -1)==-1) {
				map.put(array[i], 1);
			}
			else {
				map.put(array[i], map.get(array[i])+1);
			}
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