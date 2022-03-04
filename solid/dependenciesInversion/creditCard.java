package solid.dependenciesInversion;

public class creditCard implements BankCard{
    @Override
    public void doTransaction(int amount) {
        System.out.println("payment using debit card");

    }
}
