public class Account {
    private String name;
    private Customer customer;
    private Currency currency;
Account(String name,Customer customer,Currency currency){
    this.name=name;
    this.customer=customer;
    this.currency=currency;
}
    public String getName() {
        return name;
    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Account setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Account setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }
}
