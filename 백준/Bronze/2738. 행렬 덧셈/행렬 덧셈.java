import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] A = new int[n][m];
		int[][] B = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				A[i][j] = sc.nextInt(); 
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				B[i][j] = sc.nextInt(); 
			}
		}
		
		int[][] answer = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				answer[i][j] = A[i][j] + B[i][j];
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
        
        
	}
}