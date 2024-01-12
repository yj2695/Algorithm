class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
		int count = 0;
        for(boolean i : finished){
            count+= i==false? 1 : 0;
        }
		String[] answer = new String[count];
		
		int k =0;
		for(int i=0; i<todo_list.length; i++) {
			if(finished[i]==false) answer[k++] = todo_list[i];
		}
        return answer;
    }
}