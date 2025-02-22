import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrA = new ArrayList<Integer>();
        ArrayList<Integer> arrB = new ArrayList<Integer>();
        
        while(true) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	if(a == 0 && b == 0) break;
        	else {
        		arrA.add(a);
        		arrB.add(b);
        	}
        }
        
        for(int i=0; i<arrA.size(); i++) {
        	System.out.println(arrA.get(i) + arrB.get(i));
        }
    }
}