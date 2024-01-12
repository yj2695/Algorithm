class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        int count = 0;
        for(int i : num_list){
            if(i<0) {answer = count; break;}
            count++;
        }
        return answer;
    }
}