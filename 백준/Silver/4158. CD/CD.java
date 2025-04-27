import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            if (n == 0 && m == 0) break;
            
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }
            
            int count = 0;
            for (int i = 0; i < m; i++) {
                int num = Integer.parseInt(br.readLine());
                if (set.contains(num)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}