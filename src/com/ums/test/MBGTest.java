package com.ums.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc-servlet.xml"})
public class MBGTest {
	private final String MYBATIS_GENERATOR = "mybatis-generator.xml";
	@Test
	public void test() throws Exception {
		System.out.println("Start Test...");
		String configPath = Test.class.getResource("/").getPath()+MYBATIS_GENERATOR;
		System.out.println(configPath);
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File(configPath);
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);
		System.out.println("End Test...");
	}
}
