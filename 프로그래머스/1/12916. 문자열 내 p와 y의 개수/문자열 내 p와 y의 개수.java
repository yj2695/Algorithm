class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pc=0, py=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p') pc++;
            else if(s.charAt(i)=='y') py++;
        }
    
        return pc == py? true : false;
    }
}