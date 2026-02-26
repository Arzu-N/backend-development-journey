package Tuesday;

public class AzerSuDebt extends Debt {
    String contactCard;
    private double debt;
    public AzerSuDebt(String contactCard, double debt) {
        this.contactCard = contactCard;
        this.debt = debt;
    }
    public String getContactCard() {
        return contactCard;
    }
    public void setContactCard(String contactCard) {
        this.contactCard = contactCard;
    }
    public double getDebt() {
        return debt;
    }
    public void setDebt(double debt) {
        this.debt = debt;
    }
    public String toString() {
        return contactCard+" "+debt;
    }
}
