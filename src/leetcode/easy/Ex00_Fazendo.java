package leetcode.easy;



public class Ex00_Fazendo {
	public static void main(String[] args) {
		String[] test = {"flower","flight","flow"};
		//String[] test= {"dog","racecar","car"};
		//String[] test= {};
		System.out.println(longestCommonPrefix(test));
		
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		if(strs.length == 0) {
			return "";
		}
		
		int tam=strs[0].length();
		for(int i=1;i<strs.length;i++) {
			tam=Math.min(tam, strs[i].length());
			for(int j=0;j<tam;j++) {
				char c=strs[0].charAt(j),d=strs[i].charAt(j);
				System.out.println("2 - "+strs[0].charAt(j)+" - "+strs[i].charAt(j));
				if(c != d) {
					tam=j;
					break;
				}
			}
		}
		
		return strs[0].substring(0,tam);
    }
	
	
	
	
}