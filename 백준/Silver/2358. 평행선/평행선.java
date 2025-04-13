import java.util.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Map<Integer, Integer> mapX = new HashMap<>();
		Map<Integer, Integer> mapY = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			mapX.put(x, mapX.get(x)!=null? mapX.get(x)+1 : 1 );
			mapY.put(y, mapY.get(y)!=null? mapY.get(y)+1 : 1 );
		}
		
		int ans = 0;
		
		for(int x : mapX.values()) {
			if(x>=2) ans++;
		}
		
		for(int y : mapY.values()) {
			if(y>=2) ans++;
		}
		
		System.out.println(ans); 
    }
}