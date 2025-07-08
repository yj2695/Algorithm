import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double[] inc = new double[6];

        inc[0] = dots[1][0] - dots[0][0] == 0 ? 0 : (double) (dots[1][1] - dots[0][1]) /(dots[1][0] - dots[0][0]);
        inc[1] = dots[3][0] - dots[2][0] == 0 ? 0 : (double) (dots[3][1] - dots[2][1]) /(dots[3][0] - dots[2][0]);

        inc[2] = dots[2][0] - dots[0][0] == 0 ? 0 : (double) (dots[2][1] - dots[0][1]) /(dots[2][0] - dots[0][0]);
        inc[3] = dots[3][0] - dots[1][0] == 0 ? 0 : (double) (dots[3][1] - dots[1][1]) /(dots[3][0] - dots[1][0]);

        inc[4] = dots[3][0] - dots[0][0] == 0 ? 0 : (double) (dots[3][1] - dots[0][1]) /(dots[3][0] - dots[0][0]);
        inc[5] = dots[2][0] - dots[1][0] == 0 ? 0 : (double) (dots[2][1] - dots[1][1]) /(dots[2][0] - dots[1][0]);

        for(int i = 0; i < dots.length; i+=2){
            if(inc[i] == inc[i+1]){answer++;}
        }
        return answer > 0 ? 1:0;
    }
}