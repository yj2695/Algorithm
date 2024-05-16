class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
		int[] arr = new int[3];
		int l = 0;
		
		for(int r=1; r<=rank.length; r++) {
			for(int i=0; i<rank.length; i++) {
				
				if(arr[2]!=0) break;
				
				if(rank[i]==r && attendance[i]==true) {
					arr[l++] = i;
				}
			}
		}
	
		answer = 10000*arr[0] + 100*arr[1] + arr[2];
        
        return answer;
    }
}