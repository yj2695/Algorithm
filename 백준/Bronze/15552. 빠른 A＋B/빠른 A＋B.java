import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] k = new String[2];
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++) {
			k =  br.readLine().split(" ");
			answer[i] = Integer.parseInt(k[0]) + Integer.parseInt(k[1]);
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<n; i++) {
			bw.write(answer[i] + "\n");
		}
		bw.flush();        
    }
}