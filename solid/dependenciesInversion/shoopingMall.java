package solid.dependenciesInversion;

public class shoopingMall {
    private BankCard bankCArd;
    public shoopingMall(BankCard bankCArd){
        this.bankCArd=bankCArd;
    }
    public void purchaseSomething(int amount){
        bankCArd.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard=new debitCard();
        shoopingMall store=new shoopingMall(bankCard);
        store.purchaseSomething(5000);
    }
}
