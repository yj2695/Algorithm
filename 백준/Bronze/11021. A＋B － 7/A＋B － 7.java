import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			answer[i] = a+b;
		}
		
		for(int i=1; i<n+1; i++) {
			System.out.println("Case #" + i + ": "+ answer[i-1]);
		}
    }
}