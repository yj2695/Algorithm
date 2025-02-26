import java.util.*;
public class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = 0;
        int max = arr[0];
        int k= 0;
        
        for(int i=1; i<10; i++) {
        	arr[i] = sc.nextInt();
        	if(arr[i]>max) {
        		max=arr[i];
        		k=i;
        	}
        }
        
       System.out.println(max + "\n" + k);
	}
}