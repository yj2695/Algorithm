import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int time = sc.nextInt();
		
		hour += time/60;
		minute += time%60;

		if(minute>59) {
			hour+=1;
			minute= minute - 60;
		}
		if(hour>23) {
			hour = hour - 24;
		}
		System.out.println(hour + " " +  minute);
	}
}