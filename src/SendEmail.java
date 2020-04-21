import java.io.File;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

import com.email.durgesh.Email;

public class SendEmail {
public static void main(String[] args) {
	try {
		Email email = new Email("sagarsen0697@gmail.com","Hanuman@97");
		email.setFrom("sagarsen0697@gmail.com","TechSoft INDIA");
		email.setSubject("This email is for testing..");
		email.setContent("<h1>This is content</h1>","text/html");
		File file=new File("src/file/test.txt");
		MimeBodyPart partMessage=new MimeBodyPart();
		partMessage.setFileName(file.getName());
		DataSource s=new FileDataSource(file);
		partMessage.setDataHandler(new DataHandler(s));
		MimeMultipart part = new MimeMultipart();
		part.addBodyPart(partMessage);
		email.addAttatchment(part);
		email.addRecipient("sagarsen088@gmail.com");
		email.send();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
