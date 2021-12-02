package utilities;


import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.nio.file.Paths;
import java.util.Properties;

public class EmailPushMessage implements TestResultMessage {


    @Override
    public void pushTestResultMessage(String textMessage) throws Exception {

        String from = "frytestautomation@gmail.com";
        String pass = "Maltepe2362..";
        String to = "framazanyilmaz@gmail.com";
        String host = "smtp.gmail.com";


        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, pass);
                    }
                });

        MimeMessage message = new MimeMessage(session);

        message.setFrom(new InternetAddress(from));

        message.addRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));

        message.setSubject("İPaint App Test Result Hk.");

        message.setText(textMessage);

        Transport.send(message);


    }
}

