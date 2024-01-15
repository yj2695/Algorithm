import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n;i++){
            if(n%(i+1)==0){
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}