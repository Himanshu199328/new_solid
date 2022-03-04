package solid.ocp;

public class emailNotification implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        System.out.println("emailOTP");

    }
}
