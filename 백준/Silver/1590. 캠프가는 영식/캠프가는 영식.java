import java.util.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arriveT = sc.nextInt();
        
        int[][] busArr = new int[n][3];
        int[] waitT = new int[n];
        
		for(int i=0; i<n; i++) {
			busArr[i][0] = sc.nextInt();
			busArr[i][1] = sc.nextInt();
			busArr[i][2] = sc.nextInt();
		}
        
		for(int i=0; i<n; i++) {
			int k = 1;
			boolean chkN = true;
			
			while(busArr[i][0] < arriveT) {
				busArr[i][0] += busArr[i][1];
				k++;
				if(k>busArr[i][2]) {
					chkN = false; break;
				}
				if(busArr[i][0] >= arriveT) break;
			}
			waitT[i] = chkN == false? -1 : busArr[i][0] - arriveT;
		}
        Arrays.sort(waitT);
		int answer = -1;
		for(int i : waitT) {
			if(i != -1) {
				answer = i; break;
			}
		}
		System.out.println(answer);
    }
}