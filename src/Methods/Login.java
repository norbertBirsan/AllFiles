package Methods;

public class Login {
    public static void main(String[] args) {

        if(logInMethod("james123", "password")){
            System.out.println("logged in");
        }else{
            System.out.println("invalid credentials");
        }
    }
    public static boolean logInMethod(String username, String password){
        String validUsername= "james123";
        String validPassword="password";

        if(validUsername.equals(username)&&validPassword.equals(password)){
            return true;

        }
        return false;
    }

}
