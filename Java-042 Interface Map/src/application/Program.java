
/*
 * É uma coloção de pares chave/valor
 * Não admite repetições do objeto chave ou seja, objetos repetidos dentro dele são sobrescritos
 * Os elementos são indexados pelo objeto chave (Não possuem posição)
 * Acesso, inserção e remoção de elementos são rápidos.
 */

package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	
	public static void main(String[] args) {
		
		//Estrutura pra armazenar cookies
		Map<String, String>cookies = new TreeMap<>();
		
		//Inserir elemento no nosso map Chave e Valor  
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		//Inserir elemento no nosso map
		cookies.remove("email");
		//
		cookies.put("phone", "99711133");
		
		//Verifica se contem a chave
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		//pega valor da chave
		System.out.println("Phone number: " + cookies.get("phone"));
		
		//quando nao existe retorna null
		System.out.println("Email: " + cookies.get("email"));
		
		//Tamanho do Map
		System.out.println("Size: " + cookies.size());
		
		
		
		
		System.out.println("ALL COOKIES: ");
		// para cada String key : percorra keySet (pega a chaves do map) 
		for(String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
