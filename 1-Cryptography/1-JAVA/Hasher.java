import java.security.MessageDigest;
import java.util.Scanner;

public class Hasher {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter secret to hash: ");
        String input = sc.nextLine();
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(input.getBytes());
        
        System.out.println("Your Secure Hash: ");
        for (byte b : hash) {
            System.out.format("%02x", b);
        }
    }
}
