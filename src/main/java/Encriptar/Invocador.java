package Encriptar;

public class Invocador {

	public static void main(String[] args) {
        String plainPassword = "nolase";  // Esta es la contraseņa plana

        // Encriptar la contraseņa
        String encryptedPassword = PasswordEncryptor.encryptPassword(plainPassword);
        System.out.println("Contraseņa encriptada: " + encryptedPassword);

        // Desencriptar la contraseņa
        String decryptedPassword = PasswordEncryptor.decryptPassword(encryptedPassword);
        System.out.println("Contraseņa desencriptada: " + decryptedPassword);
    }
}
