import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		
		while(sc.hasNextLine()) {
			arr.add(sc.nextLine());
		}
		
		int[][] ans = new int[arr.size()][4];
		for(int i=0; i<arr.size(); i++) {
			for(int j=0; j<arr.get(i).length(); j++) {
				if(arr.get(i).charAt(j) == ' ') {
					ans[i][3]++;
				} else if(arr.get(i).charAt(j) < 65) {
					ans[i][2]++;
				} else if(arr.get(i).charAt(j) < 97) {
					ans[i][1]++;
				} else {
					ans[i][0]++;
				}
			}
		}
		
		for(int i=0; i<arr.size(); i++) {
			for(int j=0; j<4; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
    }
}