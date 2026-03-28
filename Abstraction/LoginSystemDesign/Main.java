/**
 * Login System Design
 * Are Google Login,GitHub Login, Email login IS-A relationship?
 * No, they are not IS-A relationship.
 * Are they can-do relationship?
 * Yes, they are can-do relationship and should use interface 
 */
interface LoginProvider {
    void login();
}
//GoogleLogin doesn't use password
class GoogleLogin implements LoginProvider {
    private String token;
    public GoogleLogin(String token) {
        this.token = token;
    }
    @Override
    public void login(){
        System.out.println("Login successfully with Google Account");
    }
}
//GitHubLogin doesn't use password
class GitHubLogin implements LoginProvider {
    private String token;
    public GitHubLogin(String token) {
        this.token = token;
    }
    @Override
    public void login(){
        System.out.println("Login with GitHub");
    }
}
//email login require password and email
//if we add password and email to loginProvider interface, it will not be a good design
//because GoogleLogin and GitHubLogin don't use password and email
//keep interface simple and each class manage its own data
class EmailLogin implements LoginProvider {
    private String email;
    private String password;
    public EmailLogin(String email, String password){
        this.email = email;
        this.password = password;
    }
    @Override
    public void login(){
        System.out.println("Login with email" + email);
    }
}
public class Main {
   public static void main(String[] args) {
    GoogleLogin googleLogin = new GoogleLogin("google-token");
       GitHubLogin gitHubLogin = new GitHubLogin("github-token");
        EmailLogin emailLogin = new EmailLogin("email", "password");
        LoginProvider[] loginProviders = {googleLogin, gitHubLogin,emailLogin};
        for(LoginProvider provider: loginProviders){
            provider.login();
        }
   }
    }
