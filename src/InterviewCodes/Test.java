package InterviewCodes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
	
		 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        isAnagram("School MASTER", "The ClassROOM");
 
        isAnagram("DORMITORY", "Dirty Room");
 
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("Toss", "Shot");
 
        isAnagram("joy", "enjoy");
 

	}
	
	
	public static void isAnagram(String s1,String s2) {
		
		String copyOfs1= s1.replaceAll("\\s", "");
		String copyOfs2=s2.replaceAll("\\s","");
		
		boolean status = true;
		
		if (copyOfs1.length() != copyOfs2.length()) {
			status=false;
		} else {
			char[] Arrays1=copyOfs1.toLowerCase().toCharArray();
			char[] Arrays2=copyOfs2.toLowerCase().toCharArray();
			
			Arrays.sort(Arrays1);
			Arrays.sort(Arrays2);
			
			status=Arrays.equals(Arrays1,Arrays2);
		
					
		}
		
		if (status) {System.out.println(s1 +"and"+s2 + "  anagram" );
		
	}else {
		System.out.println("not anagram");
	}

	}}
