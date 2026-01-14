import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EspionageRunner {
    public static void main(String[] args) throws FileNotFoundException {
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
        Scanner scanner = new Scanner(System.in);
        System.out.print("key:");
        String key = readFile(scanner.nextLine());
        encryptDecrypt.setKey(key);
        System.out.print("encrypt or decrypt:");
        String response = scanner.nextLine();
        if (response.equals("encrypt")) {
            System.out.print("File to encrypt:");
            String message = readFile(scanner.nextLine());
            String encryptMessage = encryptDecrypt.encrypt(message);
            System.out.println("Encrypted message: \n" + encryptMessage);
        }
        else if (response.equals("decrypt")) {
            System.out.print("File to decrypt:");
            String encryptedMessage = readFile(scanner.nextLine());
            String decryptedMessage = encryptDecrypt.decrypt(encryptedMessage);
            System.out.println("Decrypted message: \n" + decryptedMessage);
        }
    }
    private static String readFile(String fileName) throws FileNotFoundException {
         StringBuilder builder = new StringBuilder();
        Scanner fileScanner = new Scanner(new File(fileName));
        while (fileScanner.hasNextLine()) {
            builder.append(fileScanner.nextLine());
       }
       return builder.toString();
    }
}

