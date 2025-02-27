import java.util.*;
public class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] basket = new int[n+1];
        int start, end, num = 0;
        
        for(int i=0; i<m; i++) {
        	start = sc.nextInt();
        	end = sc.nextInt();
        	num = sc.nextInt();
        	for(int j=start; j<=end; j++) {
        		basket[j] = num;
        	}
        }
        
        for(int k=1; k<n+1; k++) {
        	System.out.print(basket[k]+ " ");
        }
	}
}