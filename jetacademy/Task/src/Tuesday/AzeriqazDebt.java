package Tuesday;

public class AzeriqazDebt extends Debt {
    private String username;
    private int debt;
    AzeriqazDebt(String username, int debt) {
        this.username = username;
        this.debt = debt;
    }

    public String getUsername() {
        return username;
    }

    public AzeriqazDebt setUsername(String username) {
        this.username = username;
        return this;
    }
    public int getDebt() {
        return debt;
    }

    public AzeriqazDebt setDebt(int debt) {
        this.debt = debt;
        return this;
    }
    public String toString(){
        return username+" "+debt;
    }
}
