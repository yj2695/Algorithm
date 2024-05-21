class Solution {
    public int solution(int[] arr) {
		int count = 0;
		int answer = 0;
		
		while(true) {
			
			count = 0;
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i]>=50 && arr[i]%2==0) {
					arr[i] = arr[i]/2;
					count++;
				}
				else if(arr[i]<50 && arr[i]%2==1) {
					arr[i] = arr[i]*2+1;
					count++;
				}
			}
			answer++;
			
			if(count==0) break;
		}     
        
        
        return answer-1;
    }
}