package leetcode.easy;

public class Ex14_Longest_Commom_Prefix {
	public static void main(String[] args) {
		String[] test = {"flower","flight","flow"};
		System.out.println(longestCommonPrefix(test));
		
	}
	
	public static String longestCommonPrefix(String[] strs) {
		//Primeiramente confere se a string esta vazia
		//Se tiver, vai retornar uma String vazia e acaba por aqui
		//return "";
		if(strs.length == 0) {
			return "";
		}
		
		
		//Obtem o tamanho da palavra que esta na primeira posição
		//Ex: tam=6
		int tam=strs[0].length();
		System.out.println(tam);
		
		for(int i=1;i<strs.length;i++) {
			//O novo tamanho é o menor valor entre o antigo tamanho e a proxima palavra
			//Ex: tam=MenorEntre(6,4) -> tam=6
			tam=Math.min(tam, strs[i].length());
			for(int j=0;j<tam;j++) {
				char c=strs[0].charAt(j),d=strs[i].charAt(j);
				
				if(c != d) {
					tam=j;
					break;
				}
			}
		}
		
		return strs[0].substring(0,tam);
    }
}
