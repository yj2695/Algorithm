import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrA = new ArrayList<Integer>();
        ArrayList<Integer> arrB = new ArrayList<Integer>();
        
        while(sc.hasNextInt()) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	arrA.add(a);
        	arrB.add(b);
        }
        sc.close();
        
        for(int i=0; i<arrA.size(); i++) {
        	System.out.println(arrA.get(i) + arrB.get(i));
        }
    }
}