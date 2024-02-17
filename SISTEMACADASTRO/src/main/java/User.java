
public class User {

	private String nome;
	private String sobrenome;
	private String senha;
	private String email;

	public String toString() {
		return "User{" + "nome='" + nome + '\'' + ", sobrenome='" + sobrenome + '\'' + ", senha='" + senha + '\''
				+ ", email='" + email + '\'' + '}';
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getSenha() {
		return senha;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
