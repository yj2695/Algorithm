class Solution {
    public int solution(int a, int b) {
        
        int k = gcd(a, b);
        
        b = b/k;
        
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        
        return b == 1 ? 1 : 2;
    }
    
    int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}