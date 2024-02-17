import java.util.ArrayList;
import java.util.List;

public class FunçõesDoSistema {

	List<User> users = new ArrayList<User>();

	public String cadastrar(User usuario) {
		users.add(usuario);
		return "Usuário " + usuario.getNome() + " " + usuario.getSobrenome() + " cadastrado com sucesso!";
	}

	public String removerUsuario(User usuario, String email) {

		if (usuario.getEmail().equals(email)) {
			users.remove(usuario);
			return "Usuário removido com sucesso!";
		}

		return "Usuário não encontrado em nosso sistema.";
	}

	public void alterarUsuario(User usuario, String email, String nomeAtualizado, String sobrenomeAtualizado,
			String senhaAtualizada, String emailAtualizado) {

		if (usuario.getEmail().equals(email)) {
			usuario.setNome(nomeAtualizado);
			usuario.setSobrenome(sobrenomeAtualizado);
			usuario.setEmail(emailAtualizado);
			usuario.setSenha(senhaAtualizada);
			
			System.out.println("Alteções realizadas com sucesso!");
		}
		
	}

	public List<User> listarUsuarios() {
		return new ArrayList<>(users);
	}

}
