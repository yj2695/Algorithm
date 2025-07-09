class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;

        int x = 0;
        int y = 0;
        int num = 1;

        while (num <= n*n) {
            answer[x][y] = num++;

            int nx = x + directions[dir][0];
            int ny = y + directions[dir][1];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + directions[dir][0];
                ny = y + directions[dir][1];
            }

            x = nx;
            y = ny;
        }
        
        return answer;
    }
}