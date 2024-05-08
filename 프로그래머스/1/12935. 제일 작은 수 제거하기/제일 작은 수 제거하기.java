import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
		int[] arr2 = arr.clone();
		Arrays.sort(arr2);
        
		if(arr.length==1) {
            int[] answer = {-1};
			return answer;
		}
		
		int[] answer = new int[arr.length-1];
		
		int k =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == arr2[0]) continue;
			else answer[k] = arr[i];
			k++;
		}        

        return answer;
    }
}