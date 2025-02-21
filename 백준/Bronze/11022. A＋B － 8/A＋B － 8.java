import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			answer[i] = a[i]+b[i];
		}
		
		for(int i=1; i<n+1; i++) {
			System.out.println("Case #" + i + ": " + a[i-1] +" + " + b[i-1] + " = " + answer[i-1]);
		}
    }
}