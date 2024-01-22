class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int a1=intervals[0][0], a2=intervals[0][1];
        int b1=intervals[1][0], b2=intervals[1][1];

        int[] answer = new int[(a2-a1+1)+(b2-b1+1)];
        int k=0;
        
        for(int i=a1; i<=a2; i++){
            answer[k++] = arr[i];
        }
        for(int j=b1; j<=b2; j++){
            answer[k++] = arr[j];
        }
        
        return answer;
    }
}