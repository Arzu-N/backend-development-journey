//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Print{}
class Doc implements Print{
    private String text;
    Doc(String text){
      this.text=text;
    }
    public String getText(){
        return text;
    }
}
public class Printer {
   public void print(Object obj){
       if(obj instanceof Print)
           System.out.println(((Doc)obj).getText());
       else
           System.out.println("cap edilmir");
   }

    public  static void main(String[] args) {
        Doc d = new Doc("Salam");
       new Printer().print(d);
        new Printer().print("jjk");    }
    }
