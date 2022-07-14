package enviando.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class AppTest {

	private String userName = "kleberdevassis@gmail.com";
	private String senha = "ukrvxffjaneefxnk";

	@org.junit.Test // junit serve para testes verificações e tambem como metodo main
	public void testEmail() {

		try {
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");/* autorização */
			properties.put("mail.smtp.starttls", "true");/* autenticação */
			properties.put("mail.smtp.host", "smtp.gmail.com");/* Servidor gmail Google */
			properties.put("mail.smtp.port", "465");/* Porta do servidor */
			properties.put("mail.smtp.socketFactory.port", "465");/* Expecifica a porta a ser conectada pelo socket */
			properties.put("mail.smtp.socketFactory.class",
					"javax.net.ssl.SSLSocketFactory");/* Classe socket de conexão ao SMTP */

			Session session = Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {

					return new PasswordAuthentication(userName, senha);
				}

			});

			Address[] toUser = InternetAddress.parse("kleberdevassis@gmail.com , passouporaqui@gmail.com");

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName));/* quem está enviando */
			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("Chegou e-mail enviado com java");/* Assunto do e-mail */
			message.setText(
					"Ola programador, vc acaba de receber um e_mail enviado com Java do curso Formação de Java com Alex");

			Transport.send(message);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
