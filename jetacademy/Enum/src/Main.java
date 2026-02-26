
public class Main {
    public static void main(String[] args) {
      //  System.out.println(Currency.AZN.getValue());
        Customer c1= new Customer("Arzu", "Nusrat", 23, 12345);
        Customer c2 = new Customer("Aylin", "Semed", 26, 12567);
        Account a11 = new Account("travel", c1, Currency.AZN);
        Account a12 = new Account("care", c1, Currency.DOLLAR);
        Account a21 = new Account("wedding", c2, Currency.EUR);
        Account a22 = new Account("eating", c2, Currency.DOLLAR);
        Account[]acc={a11,a12,a21,a22};
       /* for(int i=0;i<acc.length;i++){
            if(acc[i].getCustomer().getName().equals("Aylin")){
                System.out.println(acc[i].getCurrency().name());
            }
        }*/

      /*  for(int i=0;i<Currency.values().length;i++){
            int count=0;
            for(int j=0;j<acc.length;j++){
                if(Currency.values()[i]==acc[j].getCurrency()){
                     count++;
                }
            }
            if(count>0){
                System.out.println(Currency.values()[i]+" "+count);
            }
        }*/
        for(int i=0;i<acc.length;i++){
            if(acc[i].getCustomer().getName().equals("Arzu")){
                acc[i].getCustomer().setSurname("Nusratova");
            }
        }
        for(int i=0;i<acc.length;i++){
            System.out.println(acc[i].getCustomer().getSurname());
        }
    }
}