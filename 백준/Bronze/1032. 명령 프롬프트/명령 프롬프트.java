import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		
		for(int i=0; i<n; i++) {
			s[i] = sc.next();
		}
		
		String answer = s[0];
		for(int i=1; i<n; i++) {
			for(int j=0; j<s[i].length(); j++) {
				if(!s[i].substring(j,j+1).equals(answer.substring(j,j+1))) {
					answer = answer.substring(0,j) + "?" + answer.substring(j+1);
				}
			}
			
		}
		
		System.out.println(answer);
    }
}