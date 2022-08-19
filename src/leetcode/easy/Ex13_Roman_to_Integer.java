package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Ex13_Roman_to_Integer {
	public static void main(String[] args) {
		//System.out.println( romanToInt("II"));
		//System.out.println( romanToInt("I"));
		romanToInt("MCMXCIV");
		;
		
		System.out.println(test("MCMXCIV"));
	}
	
	
	public static int romanToInt(String s) {
		//Salva os caracteres e os valores que cada um corresponde
		
		Map<Character, Integer> roman=new HashMap<Character, Integer>();
		roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        
        //Inicia o result em 0
		int result=0;
		
		//Separa cada caractere e coloca em um array de char
        char[] input = s.toCharArray();
        //Salva quantos caracteres tem no input
        //EX: 'IV' -> 2|'V' -> 1|'VI' -> 2
        int len = input.length;
        //O tamanho do i � a quantidade de caracteres -1,
        //pois as posi��es no input come�am em 0 
        //O for vai rodar enquanto o i for menor ou igual a 0
        //Ele vai diminuir no i--
        for(int i=len-1;i>=0;i--){
        	//No result, vai salvar o resultado, pegando pela posi��o
        	result += roman.get(input[i]);
        	
        	//Se o i for diferente de 0 E o caractere da posi��o i-1 
        	//for maior que o da posi��o i, entra no la�o
        	//EX: IV = I=1 e V=5-> ja que o da posi��o 0 � menor que o da posi��o 1,
        	//			entrara no la�o
        	
        	System.out.println(result+" - "+i);
            if(i!=0 && roman.get(input[i-1]) < roman.get(input[i])){
            	
                result -= roman.get(input[i-1]);
                System.out.println("IF:"+roman.get(input[i-1]) +" - "+ roman.get(input[i]));
                System.out.println("IF:"+result+" - "+i);
                i--;
            }
            System.out.println("I: "+i);
            System.out.println("--------");
            
            
        }
        return result;   
	}
	
	public static int test(String s) {
		Map<Character, Integer> roman=new HashMap<Character, Integer>();
		roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
		int result=0;
		char[] ch=s.toCharArray();
		int qtd=ch.length;
		
		for(int i=qtd-1;i>=0;i--) {
			result+=roman.get(ch[i]);
			
			if(i!=0 && roman.get(ch[i-1]) < roman.get(ch[i])){
				result-=roman.get(ch[i-1]);
				i--;
			}
		}
		
		
		
		
		return result;
	}
	
	
	
	
}
