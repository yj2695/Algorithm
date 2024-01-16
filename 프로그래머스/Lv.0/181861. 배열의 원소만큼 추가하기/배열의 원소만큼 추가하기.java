import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> listX = new ArrayList<>();
        
        for(int i : arr){
            for(int j=0; j<i; j++){
                listX.add(i);
            }
        }
        
        return listX.stream().mapToInt(i->i).toArray();
    }
}