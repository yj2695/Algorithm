import java.util.TreeSet;
class Solution {
    public int solution(int[][] dots) {
		TreeSet<Integer> x = new TreeSet<Integer>();
		TreeSet<Integer> y = new TreeSet<Integer>();
		
		for(int i=0; i<dots.length; i++) {
			x.add(dots[i][0]);
			y.add(dots[i][1]);
		}
		int n1 = x.last() - x.first();
		int n2 = y.last() - y.first();

        return n1*n2;
    }
}