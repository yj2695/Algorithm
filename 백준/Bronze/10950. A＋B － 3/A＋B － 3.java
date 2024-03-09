import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr_a = new int[n];
        int[] arr_b = new int[n];
        
        for(int i=0; i<n; i++) {
        	arr_a[i] = sc.nextInt();
        	arr_b[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++) {
        	System.out.println(arr_a[i] + arr_b[i]);
        }
	}
}