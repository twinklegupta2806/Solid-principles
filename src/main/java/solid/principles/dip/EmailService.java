package solid.principles.dip;

public class EmailService
{
    EmailClient emailClient;
    public EmailService(EmailClient emailClient){
        this.emailClient=emailClient;
    }
    public void send(){
        emailClient.messageSender();
    }
}
