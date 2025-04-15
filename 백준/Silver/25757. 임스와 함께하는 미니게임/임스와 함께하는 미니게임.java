import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String game = sc.next();
		
		Set<String> set = new HashSet<String>();
		for(int i=0; i<n; i++) {
			set.add(sc.next());
		}
		
		System.out.println(set.size()/(game.equals("Y") ? 1 : game.equals("F")? 2 : 3 ));
    }
}