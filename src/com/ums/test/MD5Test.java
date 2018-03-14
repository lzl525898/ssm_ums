package com.ums.test;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;

public class MD5Test {

	@Test
	public void test() {
		String algorithmName = "MD5";
		Object source = "123456";
		Object salt = ByteSource.Util.bytes("zelei");
		int hashIterations = 10;
		Object result = new SimpleHash(algorithmName, source, salt, hashIterations);
		System.out.println(result);
	}

}
