package solid.principles.srp;

public class UserManagerSingleResp
{
    public static void main(String[] args)
    {
        Authenticator authenticator = new Authenticator();
        EmailNotifier emailNotifier = new EmailNotifier();
        ProfileUpdater profileUpdater = new ProfileUpdater();
        authenticator.authenticate_user("1","123");
        emailNotifier.sendEmail("23","abcd");
        profileUpdater.updateUserProfile("1","2");
    }
}
