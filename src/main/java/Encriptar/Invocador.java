package Encriptar;

public class Invocador {

	public static void main(String[] args) {
        String plainPassword = "nolase";  // Esta es la contrase�a plana

        // Encriptar la contrase�a
        String encryptedPassword = PasswordEncryptor.encryptPassword(plainPassword);
        System.out.println("Contrase�a encriptada: " + encryptedPassword);

        // Desencriptar la contrase�a
        String decryptedPassword = PasswordEncryptor.decryptPassword(encryptedPassword);
        System.out.println("Contrase�a desencriptada: " + decryptedPassword);
    }
}
