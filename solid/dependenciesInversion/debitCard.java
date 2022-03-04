package solid.dependenciesInversion;

public class debitCard implements BankCard{

    @Override
    public void doTransaction(int amount) {
        System.out.println("payment using credit card");

    }
}
