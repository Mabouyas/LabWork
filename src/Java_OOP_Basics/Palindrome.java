package Java_OOP_Basics;

public class Palindrome {
	
		public static boolean isPalindrome(String check) {
			
			String check1 = check.replaceFirst(" ","");
			String reversed = "";
			int index =  check1.length()-1;
			
			while(index >=  0){
				reversed  += check1.charAt(index);
				index--;
			}
			boolean palindrome = reversed.equalsIgnoreCase(check1);
			
			return palindrome;
		}
		
	}

