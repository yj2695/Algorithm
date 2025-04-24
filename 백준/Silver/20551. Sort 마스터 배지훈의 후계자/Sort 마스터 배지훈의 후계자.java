import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arrA = new int[n];
		int[] arrD = new int[m];
		
		for(int i=0; i<n; i++) {
			arrA[i] = sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			arrD[i] = sc.nextInt();
		}
		
		Arrays.sort(arrA);
		
		int[] ans = new int[m];
		for(int i=0; i<m; i++) {
			int target = arrD[i];
			
			int left = 0;
			int right = n-1;
			ans[i] = -1;
			
			while(left <= right) {
				int mid = left + (right - left)/2;

		        if (arrA[mid] >= target) {
		            if (arrA[mid] == target) ans[i] = mid;
		            right = mid - 1;
		        } else {
		            left = mid + 1;
		        }
			}
		}
		
    	for(int i : ans) {
    		System.out.println(i);
    	}
    }
}