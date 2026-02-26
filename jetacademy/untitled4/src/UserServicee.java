public class UserServicee {
    private UserValidator validator;
    UserServicee(UserValidator validator){
        this.validator = validator;
    }
    void registerUser(String username){
        Userr user=new Userr(username);
        if(validator.validate(user))
            System.out.println("User registered: "+username);
        else System.out.println("Invalid username!");

    }

}
