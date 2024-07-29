package solid.principles.srp;

public class Authenticator
{
    public void authenticate_user(String user_id, String password){
        System.out.println("user is authenticated" + user_id + password);
    }
}
