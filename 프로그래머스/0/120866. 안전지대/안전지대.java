class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
		int n = board.length;
		int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
		int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board[i][j] == 1) {
					for(int k=0; k<9; k++) {
						if(i+dx[k]<0 || j+dy[k]<0 || i+dx[k]>n-1 || j+dy[k]>n-1) continue;
                        if(board[i+dx[k]][j+dy[k]] == 0) board[i+dx[k]][j+dy[k]] = 2;
					}
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board[i][j] == 0) answer++;
			}
		}
        return answer;
    }
}