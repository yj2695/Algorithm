import java.util.*;
public class Main {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int answer = 0;
		
		for(int i=0; i<s.length(); i++) {
			switch(s.substring(i,i+1)) {
			case "A","B","C" : answer+=3; break; 
			case "D","E","F" : answer+=4; break; 
			case "G","H","I" : answer+=5; break; 
			case "J","K","L" : answer+=6; break; 
			case "M","N","O" : answer+=7; break; 
			case "P","Q","R","S" : answer+=8; break; 
			case "T","U","V" : answer+=9; break;
			case "W","X","Y","Z" : answer+=10; break; 
			}
		}
		
		System.out.println(answer);
    }
}