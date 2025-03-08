import java.util.*;
public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n];
        String[] s = new String[n];
        
        for(int i=0; i<n; i++) {
        	count[i] = sc.nextInt();
        	s[i] = sc.next();
        }
        
        for(int i=0; i<n; i++) {
        	String[] arr = s[i].split("");
        	for(int k=0; k<arr.length; k++) {
        		for(int j=0; j<count[i]; j++) {
        			System.out.print(arr[k]);
        		}
        	}
        	System.out.println();
        }
    }
}