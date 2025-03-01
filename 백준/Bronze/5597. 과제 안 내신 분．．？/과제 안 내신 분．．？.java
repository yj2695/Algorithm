import java.util.*;
public class Main{
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<30; i++) {
			arr.add(i+1);
		}
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<28; i++) {
			int k = sc.nextInt();
			if(arr.contains(k)) {
				arr.set(k-1, 0);
			}
		}
		
		for(int i=0; i<30; i++) {
			if(arr.get(i) != 0) {
				System.out.println(arr.get(i));
			}
		}
	}
}