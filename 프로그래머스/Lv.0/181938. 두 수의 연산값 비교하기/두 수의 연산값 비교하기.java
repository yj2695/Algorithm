class Solution {
    public int solution(int a, int b) {
        
        int a_b = Integer.parseInt(a+""+b);
        
        return a_b>=2*a*b? a_b:2*a*b;
    }
}