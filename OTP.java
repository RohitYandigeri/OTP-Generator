import java.util.Random;

public class OTP {
    static char[]OTP(int len){
        System.out.println("Generating OTP: ");
        System.out.println("Your OTP is: ");
        String number = "1234567890";
        Random rndm_method = new Random();
        char[] otp = new char[len];
        for( int i = 0; i < len; i++){
            otp[i] = number.charAt(rndm_method.nextInt(number.length()));
        }
        return otp;

    }

    public static void main(String[] args) {
        int length = 4;
        System.out.println(OTP(length));
    }
}