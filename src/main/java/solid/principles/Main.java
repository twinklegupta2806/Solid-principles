package solid.principles;

import solid.principles.dip.EmailService;
import solid.principles.dip.GmailClient;
import solid.principles.srp.UserManagerMultipleResp;
import solid.principles.srp.UserManagerSingleResp;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        UserManagerMultipleResp userManagerMultipleResp = new UserManagerMultipleResp();
        userManagerMultipleResp.authenticate_user("1","123");
        userManagerMultipleResp.updateUserProfile("1", "2");
        userManagerMultipleResp.sendEmail("myself", "hello everyone");

        UserManagerSingleResp.main(new String[]{"1", "2"});

        GmailClient gmailClient=new GmailClient();
        EmailService emailService = new EmailService(gmailClient);
        emailService.send();
    }
}