package solid.principles.dip;

public class GmailClient extends EmailClient
{
    void messageSender(){
        System.out.println("I send messages to people");
    }
}
