public class UserValidator {

    boolean validate(Userr user){
        return (user.getUsername()!=null)&&(!user.getUsername().isEmpty());

    }
}
