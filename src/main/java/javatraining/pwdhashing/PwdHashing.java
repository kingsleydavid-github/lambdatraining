package javatraining.pwdhashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PwdHashing {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		SecureRandom rand = new SecureRandom();
		byte[] salt = new byte[16];
		rand.nextBytes(salt);
		
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.update(salt);
		
		byte[] encryptedPwd = md.digest("Leonaj@ne@28".getBytes());
		
		System.out.println(encryptedPwd);
	}
	
}
