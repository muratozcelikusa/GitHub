package InterviewCodes;

import java.util.Scanner;


public class Test3 {

	
	
	public static void findDublicate(String s) {
		
		int count=1;
		String str ="";
		
		for (int i=0 ; i<str.length(); i++) {
			
			if (!str.contains(String.valueOf(s.charAt(i)))) {
				
				for (int j=0;j<str.length();j++) {
					if(i!=j && s.charAt(i)==s.charAt(j)) {
						count++;
					}
					
				}
				
			}
		
		System.out.println(str.charAt(1)+"="+count);
		count=1;
		str+=s.charAt(i);
		
			
		}
		
		
		
	}
	public static void main(String[] args) {
		findDublicate("gfdshkdskgks");
	}
}

