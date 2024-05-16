class Solution {
    public int solution(int chicken) {
        
		int answer = 0;
		int coupon = 0;
        int coupon2 = 0;
		
		while(chicken!=0) {
			answer += chicken/10;
			coupon += chicken%10;
			chicken = chicken/10;
		}
        
        while(coupon!=0){
            answer += coupon/10;
            coupon2 += coupon%10;
            coupon = coupon/10;
        }
        
        return answer + coupon2/10;
    }
}