public class Restoraun {
    Menu[]menu={new Menu("pizza",15),
            new Menu("cola",2),
            new Menu("burger",5)};
    void showMenu(){
        System.out.println("Menu:");
        for(int i=0;i<menu.length;i++){
            System.out.println(menu[i].getName()+" "+menu[i].getPrice());
        }
    }



}
