package Codes;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class JavaSendMail {
    
    static Random random = new Random();
    
    public static boolean stop = false;
            
    public static int verifyCode;
	
	public static void sendMail(String recepient){
            
            verifyCode = random.nextInt(999999);

            System.out.println("Preparing to send mail..");

            Properties properties = new Properties();

            properties.put("mail.smtp.auth","true");
            properties.put("mail.smtp.starttls.enable","true");
            properties.put("mail.smtp.host","smtp.gmail.com");
            properties.put("mail.smtp.port","587");


            String username = "dpc999xxx@gmail.com";
            String password = "sige obve giuw rphz";

            Session session = Session.getInstance(properties,new Authenticator(){
                    @Override
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                            return new javax.mail.PasswordAuthentication(username,password);
                    }
            });

            Message message = prepareMessage(session,username,recepient);
            try {
                    Transport.send(message);
                    stop = false;
            }
            catch(Exception e) {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Please check your Internet Connection / check your email address","Email Verification",JOptionPane.ERROR_MESSAGE);
                    stop = true;
            }
            System.out.println("Email send success");
		
		
	}
	
	private static Message prepareMessage(Session session, String username, String recepient) {
		
		Message message = new MimeMessage(session);
		
		try {
			message.setFrom(new InternetAddress(username));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setSubject("Verification Code");
			message.setText("Your Verification Code is \n " + verifyCode);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return message;
	}


	public static void main(String[] args) {
		
		
		
	}

}
