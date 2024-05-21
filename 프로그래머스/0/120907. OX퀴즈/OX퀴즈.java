class Solution {
    public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		
		String[] q = new String[5];
		int x, y, z = 0;
		
		for(int i=0; i<quiz.length; i++) {
			
			q = quiz[i].split(" ");
			x = Integer.valueOf(q[0]);
			y = Integer.valueOf(q[2]);
			z = Integer.valueOf(q[4]);
			
			
			if(q[1].equals("+")) {
				answer[i] = x+y==z? "O" : "X";
			}
			else {
				answer[i] = x-y==z? "O" : "X";
			}
		}
        return answer;
    }
}