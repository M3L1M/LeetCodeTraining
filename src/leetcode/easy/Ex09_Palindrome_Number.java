package leetcode.easy;

public class Ex09_Palindrome_Number {
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));
		
	}
	
	public static boolean isPalindrome(int x) {
		String isPalindrome=""+x;
		String palindrome="";
		for(int i=isPalindrome.trim().length()-1;i>=0;i--) {
			palindrome+=isPalindrome.charAt(i);
			
		}
		
		
		if(palindrome.equals(isPalindrome)) {
			return true;
		}else {
			return false;
		}
		
        
    }
}
