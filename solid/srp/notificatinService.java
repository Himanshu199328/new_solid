package solid.srp;

public class notificatinService {
    public void sendOTP(String medium){
        if(medium.equals("Email")){
            System.out.println("otp is sent on email");
        }
        if(medium.equals("phone")){
            System.out.println("otp is sent on phone");
        }
    }
}
