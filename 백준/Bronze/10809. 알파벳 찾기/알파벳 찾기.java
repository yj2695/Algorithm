import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] answer = new int[26];
		Arrays.fill(answer, -1);
		
		for(int i=s.length()-1; i>=0; i--) {
			for(int j=97; j<123; j++) {
				if(s.charAt(i) == j) {
					answer[j-97] = i; 
				}
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
    }
}