
public class ContadorDeLetras {

	public static void main(String[] args) {
		
		String texto = "Eu sou a pessoa mais incrível que eu posso ser, e através do meu esforço vou conquistar o que já é MEU";
		char a = 'a';
		int quantidade = 0;
		
		for (int i=0; i<texto.length(); i++) {
			  char c = texto.charAt(i);
			if (c == a) {
				quantidade++;
			}
		}
		
		System.out.println("A letra 'a' aparece " + quantidade +  " vezes na mensagem.");
	}

		

	}


