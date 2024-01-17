import java.util.*;
class Solution {
    public int solution(String before, String after) {
        
        char[] bc = before.toCharArray();
        char[] ac = after.toCharArray();
        
        Arrays.sort(bc);
        Arrays.sort(ac);
        
        return  Arrays.toString(bc).equals(Arrays.toString(ac))?1:0;
    }
}