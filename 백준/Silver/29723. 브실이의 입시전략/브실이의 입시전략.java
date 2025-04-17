import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		Map<String, Integer> takeSub = new HashMap<String, Integer>();
		
		for(int i=0; i<n; i++) {
			String sub = sc.next();
			int pt = sc.nextInt();
			takeSub.put(sub, pt);
		}
		
		int ans = 0;
		
		for(int i=0; i<k; i++) {
			String inSub = sc.next();
			ans+=takeSub.get(inSub);
			takeSub.remove(inSub);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(takeSub.values());
		Collections.sort(list);
		
		int min = ans;
		int max = ans;
		
		for(int i=0; i<m-k; i++) {
			min += list.get(i);
			max += list.get(list.size()-1-i);
		}
		
		System.out.println(min + " " + max);
    }
}