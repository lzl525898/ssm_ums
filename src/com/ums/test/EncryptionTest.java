package com.ums.test;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;

public class EncryptionTest {
	
	private final String MD5 = "MD5";
	
	private final String SHA1 = "SHA1";
	
	@Test
	public void test() {
		String algorithmName = SHA1;
		Object source = "123456";
		Object salt = ByteSource.Util.bytes("zelei");
		int hashIterations = 10;
		Object result = new SimpleHash(algorithmName, source, salt, hashIterations);
		System.out.println(result);
	}

}
