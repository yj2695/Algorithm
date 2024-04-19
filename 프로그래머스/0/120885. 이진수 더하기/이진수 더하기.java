class Solution {
    public String solution(String bin1, String bin2) {
        
        int k = Integer.parseUnsignedInt(bin1, 2) + Integer.parseUnsignedInt(bin2, 2);

        return Integer.toBinaryString(k);
    }
}