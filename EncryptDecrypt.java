public class EncryptDecrypt
{
    private String key;
    public EncryptDecrypt () {
        key = "";
    }
    public EncryptDecrypt (String k) {
        setKey(k);
    }
    public void setKey (String k) {
        key = k;
    }
    public String decrypt (String encryptedMessage) {
        String message = "";
        int keyIndex = 0;
        char kChar;
        char eChar;
        char newChar;

        for (int z = 0; z < encryptedMessage.length(); z++) {
            eChar = encryptedMessage.charAt(z);
            kChar = key.charAt(z);

            if (eChar >= 65 && eChar <= 90 || eChar >= 97 && eChar <=122) {
                int y = 0;
                while ((!(kChar >= 65 && kChar <= 90 || kChar >= 97 && kChar <=122)) || y == 0) {
                    kChar = key.charAt(keyIndex);
                    keyIndex++;
                    y = 1;
            }
                kChar = lowercase(kChar);
                eChar = lowercase(eChar);

                int shift = (kChar - 96);
                if (eChar - shift < 97) {
                    newChar = (char)(eChar - shift + 26);
                }
                else {
                    newChar = (char) (eChar - shift);
                }

                if (encryptedMessage.charAt(z) >= 65 && encryptedMessage.charAt(z) <= 90) {
                    newChar = uppercase(newChar);
                }

                message += newChar;
            }
            else {
                message += eChar;
            }
        }

        return (message);
    }
    public String encrypt (String decryptedMessage) {
        String message = "";
        int keyIndex = 0;
        char kChar;
        char dChar;
        char newChar;

        for (int z = 0; z < decryptedMessage.length(); z++) {
            dChar = decryptedMessage.charAt(z);
            kChar = key.charAt(z);

            if (dChar >= 65 && dChar <= 90 || dChar >= 97 && dChar <=122) {
                int y = 0;
                while ((!(kChar >= 65 && kChar <= 90 || kChar >= 97 && kChar <=122)) || y == 0) {
                    kChar = key.charAt(keyIndex);
                    keyIndex++;
                    y = 1;
                }
                kChar = lowercase(kChar);
                dChar = lowercase(dChar);

                int shift = (kChar - 96);
                if (dChar + shift > 122) {
                    newChar = (char)(dChar + shift - 26);
                }
                else {
                    newChar = (char) (dChar + shift);
                }


                if (decryptedMessage.charAt(z) >= 65 && decryptedMessage.charAt(z) <= 90) {
                    newChar = uppercase(newChar);
                }

                message += newChar;
            }
            else {
                message += dChar;
            }
        }

        return (message);
    }
    private char lowercase (char letter1) {
        if (letter1 >= 65 && letter1 <= 90)
            letter1 = (char)(letter1 + 32);
        return letter1;
    }
    private char uppercase (char letter2) {
        if (letter2 >= 97 && letter2 <= 122)
            letter2 = (char)(letter2 - 32);
        return letter2;
    }

}




