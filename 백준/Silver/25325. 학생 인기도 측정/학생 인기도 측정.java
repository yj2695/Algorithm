import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			String s = sc.next();
			map.put(s, 0);
		}
		
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			String[] arr = s.split(" ");
			for(int j=0; j<arr.length; j++) {
				map.put(arr[j], map.get(arr[j]) + 1);
			}
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, (a, b) -> {
		    if (a.getValue() != b.getValue()) {
		        return b.getValue() - a.getValue();
		    }
		    return (a.getKey()).compareTo((b.getKey()));
		});
		
		for (Map.Entry<String, Integer> entry : list) {
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}
    }
}