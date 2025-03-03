import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		double max = arr[n-1];
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			sum+= arr[i]/max*100;
		}
		
		System.out.println(sum/n);
	}
}