import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
        double[] total = new double[score.length];
        
		for(int i=0; i<score.length; i++) {
			total[i] = (score[i][0] + score[i][1])/2.0;
		}
		
		double[] sortAns = Arrays.copyOf(total, total.length);
		Arrays.sort(sortAns);
		
		for(int i=0; i<score.length; i++) {
			for(int j=score.length-1; j>=0; j--) {
				if(total[i] == sortAns[j]) {
					answer[i] = score.length-j;
					break;
				}
			}	
		}
        return answer;
    }
}