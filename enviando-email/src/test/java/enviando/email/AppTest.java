package enviando.email;

public class AppTest {

	@org.junit.Test // junit serve para testes verificações e tambem como metodo main
	public void testEmail() throws Exception {
		
		StringBuilder stringBuilderTextoEmail  = new StringBuilder();
		
		stringBuilderTextoEmail.append("ola, <br/><br/>");
		stringBuilderTextoEmail.append("Voce esta recebendo o acesso ao curso de Java.<br/><br/>");
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo.<br/><br/>");
		stringBuilderTextoEmail.append("<b>Login:</b> alex@jsjsjsj.com<br/>");
		stringBuilderTextoEmail.append("<b>Senha:</b>kjlelsdlshe<br/><br/>");
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"http://projetojavaweb.com/certificado-aluno/login\" style=\"color:#2525a7; padding: 14px 25px; text-align:center; text-decoration: none; display:inline-block; border-radius:30px; font-size:20px; font-family:courier; border : 3px solid green;background-color:#99DA39;\">Acessar Portal do Aluno</a><br/><br/>");

		stringBuilderTextoEmail.append("<span style=\"font-size:8px\">Ass.: kleberdevJavaAssis</span>");
		
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("kleberdevassis@gmail.com", "kleberdevassis",
				"testandoEmailComJava", stringBuilderTextoEmail.toString());

		enviaEmail.enviarEmailAnexo(true);
		

		

	}

}
