package solid.ocp;

public class whatsAppNotification implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        System.out.println("whatsApp OTP");
    }
}
