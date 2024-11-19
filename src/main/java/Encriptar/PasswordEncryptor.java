// Antes hacer
//Descargar el jar de https://github.com/jasypt/jasypt 
//Agregar al proyecto: jasypt-1.9.3.jar

package Encriptar;

import org.jasypt.util.text.BasicTextEncryptor;

public class PasswordEncryptor {
	
	private static final String ENCRYPTION_KEY = "miClave";

	public static String encryptPassword(String password) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(ENCRYPTION_KEY);
        return textEncryptor.encrypt(password);
    }
	
	 public static String decryptPassword(String encryptedPassword) {
	        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
	        textEncryptor.setPassword(ENCRYPTION_KEY);
	        return textEncryptor.decrypt(encryptedPassword);
	    }
	 

}
