import java.util.*;
public class Main {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		StringBuilder a = new StringBuilder(sc.next());
		StringBuilder b = new StringBuilder(sc.next());
		
		int ai = Integer.valueOf(a.reverse().toString());
		int bi = Integer.valueOf(b.reverse().toString());
		
		System.out.println(ai>bi? ai:bi);        
    }
}