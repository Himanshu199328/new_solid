package solid.InterfaceSegeregation;

public class PhonePay implements UPI_Payments{

    @Override
    public void payMoney() {
        System.out.println("money is paid");

    }

    @Override
    public void getScratchCard() {
        System.out.println("scratchcard recieved");

    }
}
