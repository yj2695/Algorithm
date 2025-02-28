import java.util.*;
public class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] basket = new int[n+1];
        for(int i=1; i<n+1; i++) {
        	basket[i] = i;
        }
        
        for(int i=0; i<m; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	int tmp = basket[a];
        	basket[a] = basket[b];
        	basket[b] = tmp;
        }
        
        for(int k=1; k<n+1; k++) {
        	System.out.print(basket[k]+ " ");
        }
	}
}