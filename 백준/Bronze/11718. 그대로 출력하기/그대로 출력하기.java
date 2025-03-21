import java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			arr.add(s);
		}
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}   
    }
}