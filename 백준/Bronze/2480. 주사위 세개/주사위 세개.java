import java.util.*;
public class Main{
	public static void main(String args[]){
		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Integer[] arr = {a, b, c};
		Arrays.sort(arr, Collections.reverseOrder());
		
		if(arr[0]==arr[1] && arr[1]==arr[2]) {
			answer = 10000 + arr[0]*1000;
		} else if(arr[0]==arr[1] && arr[1]!=arr[2]) {
			answer = 1000 + arr[0]*100;
		} else if(arr[0]!=arr[1] && arr[1]==arr[2]) {
			answer = 1000 + arr[1]*100;
		} else {
			answer = arr[0]*100;
		}
		
		System.out.println(answer);
	}
}