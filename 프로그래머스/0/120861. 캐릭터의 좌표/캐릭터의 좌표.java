class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        int bw = board[0]/2;
        int bh = board[1]/2;
        
        for(int i=0; i<keyinput.length; i++) {
        	
        	switch(keyinput[i]) {
        	
        	case "up" : answer[1] = answer[1]<bh? answer[1]+1 : answer[1]; break;
        	case "down" : answer[1] = answer[1]>-bh? answer[1]-1 : answer[1]; break;
        	case "left" : answer[0] = answer[0]>-bw? answer[0]-1 : answer[0]; break;
        	case "right" : answer[0] = answer[0]<bw? answer[0]+1 : answer[0]; break;
        	}

        }
        return answer;
    }
}