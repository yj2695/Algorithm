import java.util.*;
public class Main{
	public static void main(String args[]){
		Set<Integer> s = new HashSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			s.add(sc.nextInt()%42);
		}
		
		System.out.println(s.size());
	}
}