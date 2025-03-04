/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.service;


import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;


/**
 *
 * @author gustavo
 */

public class EmailService { 
    
    public void enviarEmail(String mensagem, String emailRemetente){
         
      
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Autenticação
        String username = "creambanknotifica@gmail.com"; // reaproveitei um email de outro projeto meu
        String password = "swlz dizq boce jerj";

        // Obter a sessão do correio
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailRemetente));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailRemetente));
            message.setSubject("Nova senha de acesso para o Saam System.");
            message.setText(mensagem);

            // Enviar mensagem
            Transport.send(message);

            System.out.println("E-mail enviado com sucesso!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
     
     

    
}
