class Solution {
    public int[] solution(int[] num_list, int n) {
        int k = (int) Math.ceil((double)num_list.length/n);		
		int[] answer = new int[k];

		for(int i = 0 ; i<answer.length; i++){
            answer[i] = num_list[n*i];
        }
        return answer;
    }
}