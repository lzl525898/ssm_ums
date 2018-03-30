package com.ums.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class FontAwesomeUtil {
	private static Properties props;
	
	static {
		loadProps();
	}

	synchronized static private void loadProps() {
		props = new Properties();
		InputStream in = null;
		try {
			in = FontAwesomeUtil.class.getClassLoader().getResourceAsStream("fontawesome.properties");
			props.load(in);
		} catch (FileNotFoundException e) {
			System.out.println("fontawesome.properties文件未找到");
		} catch (IOException e) {
			System.out.println("fontawesome出现IOException");
		} finally {
			try {
				if (null != in) {
					in.close();
				}
			} catch (IOException e) {
				System.out.println("fontawesome.properties文件流关闭出现异常");
			}
		}
	}
	
	public static String getPropery(String key) {
		if (null == props) {
			loadProps();
		}
		return props.getProperty(key);
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
			map.put(key, value);
		}
		return map;
	}
}
