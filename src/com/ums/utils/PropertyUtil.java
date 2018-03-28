package com.ums.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

/**
 * Desc:properties文件获取工具类 
 */
public class PropertyUtil {
	private static Properties props;

	static {
		loadProps();
	}

	synchronized static private void loadProps() {
		props = new Properties();
		InputStream in = null;
		try {
			in = PropertyUtil.class.getClassLoader().getResourceAsStream("config.properties");
			// in = PropertyUtil.class.getResourceAsStream("/jdbc.properties");
			props.load(in);
		} catch (FileNotFoundException e) {
			System.out.println("config.properties文件未找到");
		} catch (IOException e) {
			System.out.println("出现IOException");
		} finally {
			try {
				if (null != in) {
					in.close();
				}
			} catch (IOException e) {
				System.out.println("config.properties文件流关闭出现异常");
			}
		}
		System.out.println("加载properties文件内容完成...........");
		System.out.println("properties文件内容：" + props);
	}

	public static String getPropery(String key) {
		if (null == props) {
			loadProps();
		}
		return props.getProperty(key);
	}

	public static String getProperty(String key, String defaultValue) {
		if (null == props) {
			loadProps();
		}
		return props.getProperty(key, defaultValue);
	}
	
	public static String getProperty(String key,HttpServletRequest request) {
		props = new Properties();
		InputStream in = null;
		String path = request.getSession().getServletContext().getRealPath("/");
		try {
			in = new FileInputStream(path + "WEB-INF/classes/config.properties");
			props.load(in);
		} catch (FileNotFoundException e) {
			System.out.println("config.properties文件未找到");
		} catch (IOException e) {
			System.out.println("出现IOException");
		} finally {
			try {
				if (null != in) {
					in.close();
				}
			} catch (IOException e) {
				System.out.println("config.properties文件流关闭出现异常");
			}
		}
		return props.getProperty(key);
	}

	/**
	 * 更新配置文件
	 * 
	 * @param props
	 *            配置文件
	 * @param key
	 * @return
	 */
	public static void updateProperties(String keyname, String keyvalue, HttpServletRequest request) {
		if (null == props) {
			loadProps();
		}
		try {
			props.setProperty(keyname, keyvalue);
			String path = request.getSession().getServletContext().getRealPath("/");
			FileOutputStream outputFile = new FileOutputStream(path + "WEB-INF/classes/config.properties", true);// true表示追加打开
			props.store(outputFile, "modify");
			outputFile.flush();
			outputFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeProperties(String keyname, String keyvalue, HttpServletRequest request) {
		if (null == props) {
			loadProps();
		}
		try {
//			 String path = "\\ssm-ums\\configs\\config.properties";
			String path = request.getSession().getServletContext().getRealPath("/");
			FileOutputStream outputFile = new FileOutputStream(path + "WEB-INF/classes/config.properties", true);// true表示追加打开
			 props.setProperty(keyname, keyvalue);
			// 以适合使用 load 方法加载到 Properties 表中的格式，
			// 将此 Properties 表中的属性列表（键和元素对）写入输出流
			props.store(outputFile, "Update '" + keyname + "' value");
			outputFile.flush();
			outputFile.close();
		} catch (IOException e) {
			System.err.println("属性文件更新错误");
		}

	}

	public static String getProperty(String keyName) {
		if (null == props) {
			loadProps();
		}
		String result = "";
		Iterator it = props.entrySet().iterator();
		Map<String, String> map = new HashMap<String, String>();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String key = entry.getKey().toString();
			String value = entry.getValue().toString();
			System.out.println(key + ":" + value);
			if(key.equals(keyName)){
				result = value;
				System.out.println("properties文件内容：" + key + ":" + value);
				break;
			}
		
		}
		
		return result;
	}
	
	public static Map<String, String> getProperties() {
		if (null == props) {
			loadProps();
		}
		Iterator it = props.entrySet().iterator();
		Map<String, String> map = new HashMap<String, String>();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String key = entry.getKey().toString();
			String value = entry.getValue().toString();
			System.out.println(key + ":" + value);
			map.put(key, value);
			System.out.println("properties文件内容：" + key + ":" + value);
		}
		
		return map;
	}

	// 测试代码
/*	public static void main(String[] args) {
		writeProperties("uuu", "327@qq.com", null);
		System.out.println(getPropery("uuu"));
		updateProperties("uuu", "nihao");
		System.out.println(getPropery("uuu"));
	}*/

}
