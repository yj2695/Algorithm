package section10_DP;

import java.util.Scanner;

public class P03 { // 10-3 최대부분증가수열
	
	static int[] dy;
	
	public int solution(int[] arr) {
		int answer = 0;
		dy = new int[arr.length];
		dy[0] = 1;
		for(int i=1; i<arr.length; i++) {
			int max = 0;
			for(int j=i-1; j>=0; j--) {
				if(arr[j]<arr[i] && dy[j]>max) max = dy[j];
			}
			
			dy[i] = max + 1;
			answer = Math.max(answer, dy[i]);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		P03 T = new P03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(arr));
	}
}
