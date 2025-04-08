import java.util.*;

public class Main{
    public static void main(String[] args){
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
        
		for(int i=0; i<n; i++) {
			Stack<String> st = new Stack<String>();
			st.push(arr[i].charAt(0)+"");
			
			for(int j=1; j<arr[i].length(); j++) {
				if(!st.isEmpty()&&(arr[i].charAt(j)+"").equals(st.peek())) {
					st.pop();
				} else {
					st.push(arr[i].charAt(j)+"");
				}
			}
			if(st.isEmpty()) ans++;
		}
		System.out.println(ans);
    }
}