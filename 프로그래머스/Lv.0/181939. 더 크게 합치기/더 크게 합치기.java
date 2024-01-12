class Solution {
    public int solution(int a, int b) {
        int a_b = Integer.parseInt(a+""+b);
        int b_a = Integer.parseInt(b+""+a);
        
        return a_b>=b_a? a_b:b_a;
    }
}