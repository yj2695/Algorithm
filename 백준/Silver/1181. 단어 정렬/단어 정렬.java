import java.util.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Map<Integer, Set<String>> map = new HashMap<Integer, Set<String>>();
		int max = 0;
		
		for(int i=0; i<n; i++) {
			String s = sc.next();
			if(s.length()>max) max = s.length();
			
			Set<String> set = map.get(s.length()) == null ? new HashSet<String>() : map.get(s.length());
			set.add(s);
			map.put(s.length(), set);
		}
		
		for(int i=1; i<max+1; i++) {
			if(map.get(i) == null) continue;
			List<String> list = new ArrayList<String>(map.get(i));
			Collections.sort(list);

			for(String s : list) {
				System.out.println(s);
			}
			
		}
    }
}