package com.ums.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ums.bean.User;
import com.ums.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc-servlet.xml"})
public class MBGTest {
	private final String MYBATIS_GENERATOR = "mybatis-generator.xml";
	
	@Autowired
	SqlSession sqlSession;
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void test() {
		List<User> userList = userMapper.selectByExample(null);
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("查询user完成...");
	}
	public void mbgTest() throws Exception {
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
