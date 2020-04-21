import com.email.durgesh.Email;
//Send Email in java using gmail id.
public class EmailSender {
public static void main(String[] args) {
	try {
		Email email = new Email("sagarsen0697@gmail.com","******");
		email.setFrom("sagarsen0697@gmail.com","TechSoft INDIA");
		email.setSubject("This email is for testing..");
		email.setContent("<h1>This is content</h1>","text/html");
		email.addRecipient("sagarsen088@gmail.com");
		email.send();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
