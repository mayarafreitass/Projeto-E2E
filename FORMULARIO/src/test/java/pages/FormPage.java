package pages;

import elementos.Elementos;
import metodos.MetodosDeTestes;

public class FormPage {

	MetodosDeTestes metodo = new MetodosDeTestes();

	public void validarCadastro() {

		MetodosDeTestes.validarAlert(
				"Thanks for submitting the form\r\n"
				+ "Label	Values\r\n"
				+ "Student Name	User User\r\n"
				+ "Student Email	user@example.com\r\n"
				+ "Gender	Female\r\n"
				+ "Mobile	0123456789\r\n"
				+ "Date of Birth	10 July,2004\r\n"
				+ "Subjects	Maths, Accounting, Arts, Social Studies\r\n"
				+ "Hobbies	Sports, Reading, Music\r\n"
				+ "Picture	\r\n"
				+ "Address	Nome da rua\r\n"
				+ "State and City	NCR Delhi\r\n"
				+ "	");
	}

	public void preencherNome(String nome) {
		MetodosDeTestes.escrever(Elementos.nome, "User");
	}

	public void preencherSobrenome(String sobrenome) {
		MetodosDeTestes.escrever(Elementos.sobrenome, "User");
	}

	public void preencherEmail(String Email) {
		MetodosDeTestes.escrever(Elementos.email, "user@example.com");
	}

	public void preencherGenero() {
		MetodosDeTestes.clicar(Elementos.generoOpcao);
	}

	public void preencherNumero(String numero) {
		MetodosDeTestes.escrever(Elementos.numero, "0123456789");
	}

	public void preencherDataNascimento() {
		MetodosDeTestes.clicar(Elementos.data);
		MetodosDeTestes.clicar(Elementos.mes);
		MetodosDeTestes.clicar(Elementos.ano);
		MetodosDeTestes.clicar(Elementos.dia);
	}

	public void preencherHobbiesUm() {

		MetodosDeTestes.clicar(Elementos.hobbiesUm);
	}

	public void preencherHobbiesDois() {
		MetodosDeTestes.clicar(Elementos.hobbiesDois);
	}

	public void preencherHobbiesTres() {
		MetodosDeTestes.clicar(Elementos.hobbiesTres);
	}

	public void preencherSubjectsUm() {
		MetodosDeTestes.clicar(Elementos.subjects);
		MetodosDeTestes.escrever(Elementos.subjects, "Maths");
		MetodosDeTestes.enter();
	}

	public void preencherSubjectsDois() {
		MetodosDeTestes.clicar(Elementos.subjects);
		MetodosDeTestes.escrever(Elementos.subjects, "Accounting");
		MetodosDeTestes.enter();
	}

	public void preencherSubjectsTres() {
		MetodosDeTestes.clicar(Elementos.subjects);
		MetodosDeTestes.escrever(Elementos.subjects, "Arts");
		MetodosDeTestes.enter();
	}

	public void preencherSubjectsQuatro() {
		MetodosDeTestes.clicar(Elementos.subjects);
		MetodosDeTestes.escrever(Elementos.subjects, "Social Studies");
		MetodosDeTestes.enter();
	}

	public void preencherCurrent(String Current) {
		MetodosDeTestes.escrever(Elementos.Current, "Nome da rua");
	}

	public void preencherEstado() {
		MetodosDeTestes.scrollAteOFinal();
		MetodosDeTestes.clicar(Elementos.states);
		MetodosDeTestes.enter();
		
	}

	public void preencherCidade() {
		MetodosDeTestes.scrollAteOFinal();
		MetodosDeTestes.clicar(Elementos.cities);
		MetodosDeTestes.enter();

	}

	

	public void enviarForm() {
		MetodosDeTestes.scrollAteOFinal();
		MetodosDeTestes.clicar(Elementos.button);

	}
}
