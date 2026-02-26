public class UserService {
   private UserLogger logger;
   UserService(UserLogger logger){
       this.logger = logger;
   }
   void createUser(String name){
       User user = new User(name);
       logger.log("User created "+user.getName());
   }
   void deleteUser(String name){
       logger.log("User deleted "+name);
   }

}
