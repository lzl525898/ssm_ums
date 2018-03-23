package com.ums.utils;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 */
public class DateUtil {
	public static final String DEFAULT_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 获得当前时间的时间戳
	 * 
	 * @return
	 */
	public static Timestamp getCurrentTimeStamp() {
		return new Timestamp(getNowDate().getTime());
	}

	public static Date getNowDate() {
		return new Date(System.currentTimeMillis());
	}

	/**
	 * 获取当前时间字符串
	 * 
	 * @return yyyy-MM-dd 格式
	 */
	public static String getNowDateShort() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(new java.util.Date());
	}

	public static String getNowDateShort2() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return format.format(new java.util.Date());
	}

	/**
	 * 获取当前时间字符串 带星期几
	 * 
	 * @return yyyy-MM-dd E格式
	 */
	public static String getNowDateShortWeek() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd E");
		return format.format(new java.util.Date());
	}

	/**
	 * 返回一个时间为8为的字符串的时间戳
	 * 
	 * @return
	 */
	public static String getEightTimeString() {
		String username = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		username = format.format(new java.util.Date()).substring(6, format.format(new java.util.Date()).length());
		return username;
	}

	/**
	 * 获取当前时间字符串
	 * 
	 * @return yyyy-MM-dd HH:mm:ss 格式
	 */
	public static String getNowDateLong() {
		SimpleDateFormat format = new SimpleDateFormat(DEFAULT_TIME_FORMAT);
		return format.format(new java.util.Date());
	}

	public static String getDateLong(java.util.Date date) {
		SimpleDateFormat format = new SimpleDateFormat(DEFAULT_TIME_FORMAT);
		return format.format(date);
	}

	public static Date toDate(String str) {
		return toDate(str, "yyyy-MM-dd");
	}

	public static Date toDate(String str, String mask) {
		if (isEmpty(str)) {
			return null;
		}
		SimpleDateFormat df = new SimpleDateFormat(mask);
		try {
			return new Date((df.parse(str)).getTime());
		} catch (Exception Ex) {
			return null;
		}
	}

	public static boolean isEmpty(String str) {
		if (null == str || "".equals(str)) {
			return true;
		}
		return false;
	}

	/**
	 * 替换Date.getDay();
	 * 
	 * @param date
	 * @return
	 */
	public static int getDayOfWeek(java.util.Date date) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		return cl.get(Calendar.DAY_OF_WEEK) - Calendar.SUNDAY;
	}

	/**
	 * 计算两个日期相隔的天数
	 * 
	 * @param formDate
	 * @param toDate
	 * @return
	 */
	public static int daysBetween(Date formDate, Date toDate) {
		Calendar aCalendar = Calendar.getInstance();
		aCalendar.setTime(formDate);
		int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
		aCalendar.setTime(toDate);
		int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
		return day2 - day1;
	}

	public static String parseDate(java.util.Date date) {
		return parseDate(date, "yyyy-MM-dd");
	}

	public static String parseDate(java.util.Date date, String mask) {
		SimpleDateFormat df = new SimpleDateFormat(mask);
		return df.format(date);
	}

	/**
	 * 去除日期的时间部分
	 * 
	 * @return
	 */
	public static Date getPureDate(Date inputDate) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(inputDate);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new java.sql.Date(calendar.getTimeInMillis());
	}

	/**
	 * 求得某一天的最后时间。即23时59分59秒999毫秒.
	 * 
	 * @param day
	 * @return
	 */
	public static Date getLastTimeInDay(Date day) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(day);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return new java.sql.Date(calendar.getTimeInMillis());
	}

	public static Date getNewDateByAddingSomeDay(Date startDate, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return new Date(calendar.getTimeInMillis());
	}

	public static Date getMaxDate(Date date1, Date date2) {
		if (date1 == null && date2 == null) {
			return null;
		}
		if (date1 == null) {
			return date2;
		}
		if (date2 == null) {
			return date1;
		}
		if (date1.after(date2)) {
			return date1;
		} else {
			return date2;
		}
	}

	public static Date getMinDate(Date date1, Date date2) {
		if (date1 == null && date2 == null) {
			return null;
		}
		if (date1 == null) {
			return date2;
		}
		if (date2 == null) {
			return date1;
		}
		if (date1.after(date2)) {
			return date2;
		} else {
			return date1;
		}
	}

	/**
	 * 获取本周一（周一为一周开始）
	 * 
	 * @return
	 */
	public static Date getCurrentMonday() {
		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return java.sql.Date.valueOf(df.format(c.getTime()));
	}

	/**
	 * 获取本周日（周一为一周开始）
	 * 
	 * @return
	 */
	public static Date getCurrentSunday() {
		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return java.sql.Date.valueOf(df.format(c.getTime()));
	}

	/**
	 * 获取最近的一个日期
	 * 
	 * @param dateList
	 * @return
	 */
	public static java.util.Date getLatestDate(List<java.util.Date> dateList) {
		if (dateList == null || dateList.isEmpty()) {
			return null;
		}
		return Collections.max(dateList, new Comparator<java.util.Date>() {
			public int compare(java.util.Date o1, java.util.Date o2) {
				return o1.compareTo(o2);
			}
		});
	}

	/**
	 * 将Timestamp format成所给"yyyy-MM-dd HH:mm:ss"格式的字符串。
	 * 
	 * @param timestamp
	 * @return
	 */
	public static String formatTimestamp(Timestamp timestamp) {
		return formatTimestamp(timestamp, DEFAULT_TIME_FORMAT);
	}

	/**
	 * 将Timestamp format成所给pattern的字符串。
	 * 
	 * @param timestamp
	 * @param pattern
	 * @return
	 */
	public static String formatTimestamp(Timestamp timestamp, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(timestamp);
	}

	/**
	 * 获取所给时间点所在月的第一天。
	 * 
	 * @return
	 */
	public static Date getFirstDayInMonth(long timeInMillis) {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date(timeInMillis));
		c.set(Calendar.DATE, 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return java.sql.Date.valueOf(df.format(c.getTime()));
	}

	/**
	 * 获取所给时间点所在月的最后一天。
	 * 
	 * @return
	 */
	public static Date getLastDayInMonth(long timeInMillis) {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date(timeInMillis));
		c.set(Calendar.DATE, 1);
		c.roll(Calendar.DATE, -1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return java.sql.Date.valueOf(df.format(c.getTime()));
	}

	/**
	 * 将Date类型转换成Timestamp类型
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp getTimestamp(Date date) {
		return new Timestamp(date.getTime());
	}

	public static long dateDiff(String startTime, String endTime, String format, int switchs) throws ParseException {
		long difference = 0;
		SimpleDateFormat sd = new SimpleDateFormat(format);
		long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
		long nh = 1000 * 60 * 60;// 一小时的毫秒数
		long nm = 1000 * 60;// 一分钟的毫秒数
		long ns = 1000;// 一秒钟的毫秒数long diff;
		// 获得两个时间的毫秒时间差异
		long diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
		long day = diff / nd;// 计算差多少天
		long hour = diff % nd / nh;// 计算差多少小时
		long min = diff % nd % nh / nm;// 计算差多少分钟
		long sec = diff % nd % nh % nm / ns;// 计算差多少秒//输出结果
		if (switchs == 0) {
			difference = day;
		} else if (switchs == 1) {
			difference = hour;
		} else if (switchs == 2) {
			difference = min;
		} else {
			difference = sec;
		}
		return difference;
	}

	public static Map<String, Object> getYMDHMS(long time) {
		Map<String, Object> map = new HashMap<String, Object>();
		SimpleDateFormat yformat = new SimpleDateFormat("yyyy");
		SimpleDateFormat Mformat = new SimpleDateFormat("MM");
		SimpleDateFormat dformat = new SimpleDateFormat("dd");
		SimpleDateFormat Hformat = new SimpleDateFormat("HH");
		SimpleDateFormat mformat = new SimpleDateFormat("mm");
		SimpleDateFormat sformat = new SimpleDateFormat("ss");
		map.put("year", yformat.format(time));
		map.put("mon", Mformat.format(time));
		map.put("day", dformat.format(time));
		map.put("hour", Hformat.format(time));
		map.put("mini", mformat.format(time));
		map.put("sec", sformat.format(time));
		return map;
	}

	/**
	 * 
	 * 秒数转时间
	 * 
	 * @param sec
	 * @return
	 */
	public static String secondToStr(long sec) {
		long s = sec;
		long m = 0;
		long h = 0;
		if (s >= 60) {
			m = s / 60;
			s = s % 60;
			if (m >= 60) {
				h = m / 60;
				m = m % 60;
			}
		}
		String time = s + "秒";
		if (m > 0) {
			time = m + "分" + time;
		}
		if (h > 0) {
			time = h + "时" + time;
		}
		return time;
	}

	public static void main(String[] args) {
		System.out.println(getEightTimeString());
	}
}
