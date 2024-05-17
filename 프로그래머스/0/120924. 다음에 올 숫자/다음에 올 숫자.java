class Solution {
    public int solution(int[] common) {
		int k=0;
		boolean chk= false;
		
		// 등차, 등비 구분하기
		if(common[1]-common[0] == common[2]-common[1]) { // 같으면 등차
			k = common[1] - common[0];
		}
		else { // 등비
			chk = true;
			k = common[1]/common[0];
			
		}
		
		
		int answer = 0; 
		if(!chk) {
			answer = common[common.length-1] + k;
		}
		else {
			answer = common[common.length-1] * k;
		}
        return answer;
    }
}