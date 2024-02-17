package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navegadores.Navegadores;
import pages.FormPage;

public class FuncionalidadesDeInscrição {

	FormPage form = new FormPage();

	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
	    Navegadores.iniciarTeste();
	}

	@When("preencher todos os dados corretamente")
	public void preencher_todos_os_dados_corretamente() {
		form.preencherNome("user");
        form.preencherSobrenome("user");
        form.preencherCurrent("nome da rua");
        form.preencherEmail("user@example.com");
        form.preencherNumero("0123456789");
        form.preencherGenero();
        form.preencherHobbiesUm();
        form.preencherHobbiesDois();
        form.preencherHobbiesTres();
        form.preencherDataNascimento();
        form.preencherSubjectsUm();
        form.preencherSubjectsDois();
        form.preencherSubjectsTres();
        form.preencherSubjectsQuatro();
        form.preencherEstado();
        form.preencherCidade();

	}

	@When("clicar no botão submit")
	public void clicar_no_botão_submit() {
	    form.enviarForm();
	}

	@Then("inscrição realizada com sucesso")
	public void inscrição_realizada_com_sucesso() {
	    form.validarCadastro();

}

	@When("não preencher o campo nome")
	public void não_preencher_o_campo_nome() {
	    
	}

	@When("preencher os outros dados")
	public void preencher_os_outros_dados() {
		  form.preencherSobrenome("user");
	        form.preencherCurrent("nome da rua");
	        form.preencherEmail("user@example.com");
	        form.preencherNumero("0123456789");
	        form.preencherGenero();
	        form.preencherHobbiesUm();
	        form.preencherHobbiesDois();
	        form.preencherHobbiesTres();
	        form.preencherDataNascimento();
	        form.preencherSubjectsUm();
	        form.preencherSubjectsDois();
	        form.preencherSubjectsTres();
	        form.preencherSubjectsQuatro();
	        form.preencherEstado();
	        form.preencherCidade();
	}

	@Then("inscrição não realizada")
	public void inscrição_não_realizada() {
	    form.validarCadastro();
	}

	@When("não preencher o campo sobrenome")
	public void não_preencher_o_campo_sobrenome() {
	   
	}
	
	@When("preencher outros dados")
	public void preencher_outros_dados() {
		form.preencherNome("user");
        form.preencherCurrent("nome da rua");
        form.preencherEmail("user@example.com");
        form.preencherNumero("0123456789");
        form.preencherGenero();
        form.preencherHobbiesUm();
        form.preencherHobbiesDois();
        form.preencherHobbiesTres();
        form.preencherDataNascimento();
        form.preencherSubjectsUm();
        form.preencherSubjectsDois();
        form.preencherSubjectsTres();
        form.preencherSubjectsQuatro();
        form.preencherEstado();
        form.preencherCidade();
	
}
	}