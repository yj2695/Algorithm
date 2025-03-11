import java.util.*;
public class Main {
    public static void main(String args[]){
		int[] k = {1, 1, 2, 2, 2, 8};
        Scanner sc = new Scanner(System.in);
        int[] s = new int[6];
        
        for(int i=0; i<6; i++) {
        	s[i] = sc.nextInt();
        }
        
        for(int i=0; i<6; i++) {
        	System.out.print((k[i] - s[i]) + " ");
        }
    }
}