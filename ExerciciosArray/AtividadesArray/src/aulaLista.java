import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aulaLista {

	public static void main(String[] args) {
		List <String> list = new ArrayList<String>(); // declarar
		
		list.add("Vitor");
		list.add("Alex");
		list.add("Mario");
		list.add("Ana");
		list.add("Andre");
		list.add(2, "Cleber");
		System.out.println(list.size()); 
		for(String elemento : list) {
			System.out.println(elemento);
		};
		
		System.out.println("-------------");
		
		list.removeIf(elemento -> elemento.charAt(0) == 'C'); // assunto lambda predicado
		for(String elemento : list) {
			System.out.println(elemento);
		}; 
		
		
		System.out.println("-------------");
		
		System.out.println("Index do Vitor: " + list.indexOf("Vitor"));
		
		System.out.println("-------------");
		List <String> resultado = list.stream().filter(elemento -> elemento.charAt(0) == 'M').collect(Collectors.toList());
		for(String elemento : resultado) {
			System.out.println(elemento);
		}; 
		
		System.out.println("-------------");
		
		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
	}

}
