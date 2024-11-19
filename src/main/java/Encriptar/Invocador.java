package Encriptar;

public class Invocador {

	public static void main(String[] args) {
        String plainPassword = "nolase";  // Esta es la contraseña plana

        // Encriptar la contraseña
        String encryptedPassword = PasswordEncryptor.encryptPassword(plainPassword);
        System.out.println("Contraseña encriptada: " + encryptedPassword);

        // Desencriptar la contraseña
        String decryptedPassword = PasswordEncryptor.decryptPassword(encryptedPassword);
        System.out.println("Contraseña desencriptada: " + decryptedPassword);
    }
}
