package InterviewCodes;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			
			s=s+str.charAt(i);
			
			
			
		}
		if (str.equalsIgnoreCase(s)) {
			System.out.println("ok");
		}else {
			System.out.println("not ok");
		}
	}

}
