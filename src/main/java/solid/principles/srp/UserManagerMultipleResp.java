package solid.principles.srp;

public class UserManagerMultipleResp
{
    public void authenticate_user(String user_id, String password){
        System.out.println("user is authenticated" + user_id + password);
    }

    public void updateUserProfile(String user_id, String new_user_id){
        System.out.println(user_id+"has been updated with"+new_user_id);
    }

    public void sendEmail(String user_mail, String content){
        System.out.println(user_mail+"has been sent"+content);
    }
}
