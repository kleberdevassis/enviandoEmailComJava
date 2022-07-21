package br.com.emailproject.model;

public class Email {

	private String destinatario;
	private String assungo;
	private String texto;

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getAssungo() {
		return assungo;
	}

	public void setAssungo(String assungo) {
		this.assungo = assungo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
