import java.math.*;
class Solution {
    public int solution(int balls, int share) {
        
		BigInteger n = BigInteger.valueOf(1); 
		BigInteger m = BigInteger.valueOf(1); 
		
		
		for(int i=1; i<=share; i++) {
			n = n.multiply(BigInteger.valueOf(balls));
			balls--;	
			m = m.multiply(BigInteger.valueOf(i));
        }		
		
		
        return n.divide(m).intValue();
    }
}