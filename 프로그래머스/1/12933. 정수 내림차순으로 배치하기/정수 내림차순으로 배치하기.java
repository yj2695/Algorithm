import java.util.*;
class Solution {
    public long solution(long n) {
        
        String s = String.valueOf(n);
        ArrayList<Integer> k = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++) {
            k.add(Integer.valueOf(s.substring(i, i+1)));
        }
        
        Collections.sort(k, Collections.reverseOrder());
        
        String ans = "";
        for(int i=0; i<k.size(); i++){
            ans += k.get(i);
        }
        
        return Long.parseLong(ans);
    }
}