package com.jaspersoft.cipher;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import com.jaspersoft.jasperserver.api.common.crypto.CipherI;

public class myCipher implements CipherI{
	
	
	private SecretKeySpec secretKey;
	private byte[] key;
	String myKey="Mehul Katara";
	
	
	
	
	 public  void setKey(String myKey)
	    {
	        
		
		 MessageDigest sha = null;
	        try {
	            key = myKey.getBytes("UTF-8");
	            sha = MessageDigest.getInstance("SHA-1");
	            key = sha.digest(key);
	            key = Arrays.copyOf(key, 16);
	            secretKey = new SecretKeySpec(key, "RC4");
	            
	        }
	        catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	public String decrypt(String strToDecrypt) {
		
		try {
			String secret=myKey;
			setKey(secret);
			Cipher cipher = Cipher.getInstance("RC4");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			return new String(cipher.doFinal(Base64.getUrlDecoder().decode(strToDecrypt.getBytes("UTF-8"))));
			
		}
		catch(Exception e)
		{
			System.out.println("Error while decrypting !"  +e.toString());
			System.out.println("Error while descrypt GetMEssage()  : "  +e.getMessage());
			e.printStackTrace();
		} 
		return null;
	}
	public String encrypt(String strToEncrypt) {
		
		try {
			String secret=myKey;
			setKey(secret);
			Cipher cipher = Cipher.getInstance("RC4");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			
			return Base64.getUrlEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
		
			
		}
		catch(Exception e)
		{
			System.out.println("Error while encrypting"  +e.toString());
		}
		return null;
		
	}
	
	
	public static void main(String args[]) {
		
		String orginalString="u=mehulkatara";
			
		myCipher obj = new myCipher();
		String encryptString = obj.encrypt(orginalString);
		String decryptString = obj.decrypt(encryptString);
		
		System.out.println(orginalString);	
		System.out.println(encryptString);		
		System.out.println(decryptString);
	}
}
