package com.myb.framework.security;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class DESUtils {
	

	public static String encrypt(String inStr, String secretKey) {
		SecretKey deskey = new SecretKeySpec(secretKey.getBytes(), "DESede");
		Cipher cipher;
		String outStr = null;
		try {
			cipher = Cipher.getInstance("DESede");
			cipher.init(Cipher.ENCRYPT_MODE, deskey);
			outStr = byte2hex(cipher.doFinal(inStr.getBytes()));
		} catch (Exception e) {
			outStr = "default";
			e.printStackTrace();
		}
		return outStr;
	}
	

	public static String decrypt(String inStr, String secretKey) {
		SecretKey deskey = new SecretKeySpec(secretKey.getBytes(), "DESede");
		Cipher cipher;
		String outStr = null;
		try {
			cipher = Cipher.getInstance("DESede");
			cipher.init(Cipher.DECRYPT_MODE, deskey);
			outStr = new String(cipher.doFinal(hex2byte(inStr)));
		} catch (Exception e) {
			outStr = "default";
			e.printStackTrace();
		}
		return outStr;
	}

	public static String byte2hex(byte[] digest) {
		StringBuffer hs = new StringBuffer();
		String stmp = "";
		for (int n = 0; n < digest.length; n++) {
			stmp = Integer.toHexString(digest[n] & 0XFF);
			if (stmp.length() == 1) {
				hs.append("0" + stmp);
			} else {
				hs.append(stmp);
			}
		}
		return hs.toString().toUpperCase();
	}
	

	public static byte[] hex2byte(String hexStr){
		if (hexStr == null)
			return null;
		hexStr = hexStr.trim();
		int len = hexStr.length();
		if (len == 0 || len % 2 == 1)
			return null;
		byte[] digest = new byte[len / 2];
		try {
			for (int i = 0; i < hexStr.length(); i += 2) {
				digest[i / 2] = (byte) Integer.decode("0x" + hexStr.substring(i, i + 2)).intValue();
			}
			return digest;
		} catch (Exception e) {
			return null;
		}
	}
	
	
}
