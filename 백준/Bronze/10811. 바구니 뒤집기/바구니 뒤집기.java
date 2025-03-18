import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] basket = new int[n];
		for(int i=0; i<n; i++) {
			basket[i] = i+1;
		}
		
		int m = sc.nextInt();
		
		for(int k=0; k<m; k++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			int tmp = 0;
			
			if(i != j) {
				for(int s=0; s<=(i+j)/2-i; s++) {
					tmp = basket[i+s];
					basket[i+s] = basket[j-s];
					basket[j-s] = tmp;
				}				
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(basket[i] + " ");
		}
    }
}