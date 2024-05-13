class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
    	int start = 0;
    	int end = num_list.length-1;
    	double slice = 1;
    	
    	switch(n) {
    	
    	case 1 : end = slicer[1]; break;
    	case 2 : start = slicer[0]; break;
    	case 3 : start = slicer[0]; end = slicer[1]; break;
    	case 4 : start = slicer[0]; end = slicer[1]; slice = slicer[2]; break;
    	
    	}
    	
    	
    	int[] answer = new int[(int)Math.ceil((end-start+1)/slice)];
    	int k=0;
    	
    	for(int i=start; i<=end; i+=slice) {
    		
    		answer[k++] = num_list[i];
    		
    	}

        return answer;
    }
}