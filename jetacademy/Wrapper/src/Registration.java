public class Registration {
    String name="Arzu";
    String password="arzu12";
    void validate(String name,String password){
        if(name.equals(this.name)&&password.equals(this.password)){
            System.out.println("success");
        }
        else{
            System.out.println("reenter correct name and password");
        }
    }
}
