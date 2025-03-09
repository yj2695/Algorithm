import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.trim().split(" ");
        
        if(arr.length == 1 && arr[0] == "") {
        	System.out.println(0);
        } else {
        	System.out.println(arr.length);        	
        }
    }
}