import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int move : moves){
            
            for(int i=0; i<board.length; i++){
                if(board[i][move-1]!=0){
                    int tmp = board[i][move-1];
                    board[i][move-1] = 0;
                    
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        
        
        return answer;
    }
}