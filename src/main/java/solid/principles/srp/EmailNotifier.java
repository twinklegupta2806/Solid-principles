package solid.principles.srp;

public class EmailNotifier
{
    public void sendEmail(String user_mail, String content){
        System.out.println(user_mail+"has been sent"+content);
    }
}
