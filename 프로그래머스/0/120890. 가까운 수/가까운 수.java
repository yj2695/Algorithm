class Solution {
    public int solution(int[] array, int n) {

    	int k = Math.abs(array[0]-n);
    	int answer = array[0];
    	
    	for(int i=1; i<array.length; i++) {
    		
    		if(Math.abs(array[i]-n)<k) {
    			k = Math.abs(array[i]-n);
    			answer = array[i];
    		}
    		else if(Math.abs(array[i]-n)==k) {
    			answer = answer > array[i]? array[i] : answer; 
    		}
    		
    	}
        
        return answer;
    }
}