package services;

import static services.Cipher.caesarCipher;

public class Encrypt {
    public static String encrypt(String text, int key) {
        return caesarCipher(text, key);
    }
}
