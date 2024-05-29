import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
  
        for(int i=0; i<k; i++) {
        	int m = sc.nextInt();
            int n = sc.nextInt();
            sum += m*n;
        }
        
        System.out.println(sum==total? "Yes" : "No");
	}
}