class Solution {
    public int[] solution(int[] arr) {
		int start = -1, end = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==2) {
				start = i; break;
			}
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]==2) {
				end = i; break;
			}
		}

		int[] answer = new int[end-start+1];
		int k = 0;
        
        if(start==-1 && end==-1) {
            answer[0] = -1;
            return answer;
        }
        
		for(int i=start; i<=end; i++) {
			answer[k++] = arr[i];
		}        
        
        return answer;
    }
}