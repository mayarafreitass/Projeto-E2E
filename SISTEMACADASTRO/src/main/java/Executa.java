public class Executa {

	public static void main(String[] args) {
		User userUm = new User();
		userUm.setNome("User");
		userUm.setSobrenome("Um");
		userUm.setEmail("userum@exemplo.com");
		userUm.setSenha("012345");

		User userDois = new User();
		userDois.setNome("User");
		userDois.setSobrenome("Dois");
		userDois.setEmail("userdois@exemplo.com");
		userDois.setSenha("012345");

		User userTres = new User();

		userTres.setNome("User");
		userTres.setSobrenome("Tres");
		userTres.setEmail("usertres@exemplo.com");
		userTres.setSenha("012345");

		FunçõesDoSistema sistema = new FunçõesDoSistema();

		String cadastroUm = sistema.cadastrar(userUm);
		System.out.println(cadastroUm);

		String cadastroDois = sistema.cadastrar(userDois);
		System.out.println(cadastroDois);

		String cadastroTres = sistema.cadastrar(userTres);
		System.out.println(cadastroTres);

		String remover = sistema.removerUsuario(userDois, "userdois@exemplo.com");
		System.out.println(remover);

		sistema.alterarUsuario(userTres, "usertres@exemplo.com", "Usuario", "Quatro", "0123", "userquatro@exemplo.com");

		System.out.println("Usuários cadastrados " + sistema.listarUsuarios());

	}

}
