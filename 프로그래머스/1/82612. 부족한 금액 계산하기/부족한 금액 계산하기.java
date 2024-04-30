class Solution {
    public long solution(int price, int money, int count) {

		long k = 0;
		
		for(int i=1; i<=count; i++) {
			k+=price*i;
		}
		
        return k-money>0? k-money : 0;
    }
}