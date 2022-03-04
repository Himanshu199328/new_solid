package solid.InterfaceSegeregation;

public class Paytm implements UPI_Payments,cashbackManager{
    @Override
    public void payMoney() {
        System.out.println("money is paid");
    }

    @Override
    public void getScratchCard() {
        System.out.println("scratchcard is given");

    }

    @Override
    public void getCashBackAsCreditBAlance() {
        System.out.println("cashback recived");

    }
}
