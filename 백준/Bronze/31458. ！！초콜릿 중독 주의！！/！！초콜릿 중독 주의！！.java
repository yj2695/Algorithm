import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] s = new String[n];
		for(int i=0; i<n; i++) {
			s[i] = sc.next();
		}
		
		int[] ans = new int[n];
		for(int i=0; i<n; i++) {
			ans[i] = s[i].charAt(s[i].length()-1) == '0'? 0 : 1;
		}
		
		for(int i=0; i<n; i++) {
			int k=0; 
			while(s[i].charAt(k) == '!') {
				ans[i] = ans[i]^1;
				k++;
			}
			System.out.println(ans[i]);
		}
    }
}