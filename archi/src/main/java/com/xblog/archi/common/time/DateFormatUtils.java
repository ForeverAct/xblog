package com.xblog.archi.common.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 日期格式公用功能类
 * 
 * @author wangyue
 * @version 1.0 2011-12-05
 *
 */
public class DateFormatUtils {
	private static final Locale defaultLocale = Locale.CHINA;
	private static final TimeZone defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");//TimeZone.getTimeZone("GMT+08:00")
	
	public static final String DATE_FORMAT = "yyyyMMdd";
	public static final String DATE_HL_FORMAT = "yyyy-MM-dd";
	public static final String DATE_TIME_FORMAT = "yyyyMMddHHmmss";
	public static final String DATE_TIME_STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_TIME_MIL_FORMAT = "yyyyMMddHHmmssSSS";
	public static final String DATE_TIME_MIL_STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss SSS";
	public static final String DATE_TIME_MIL_SQLSERVER_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
	public static final String DATE_TIME_ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	public static final String DATE_ISO_FORMAT = "yyyy-MM-dd'T'00:00:00'Z'";
	public static final String TIME_FORMAT = "HHmmss";
	public static final String TIME_STANDARD_FORMAT = "HH:mm:ss";
	public static final String TIME_MIL_FORMAT = "HHmmssSSS";
	public static final String TIME_MIL_STANDARD_FORMAT = "HH:mm:ss SSS";
	public static final String TIME_MIL_STANDARD_FORMAT2 = "HH:mm:ss.SSS";
	
	public static String DEFAULT_DATE_FORMAT() {
		return format(new Date(), DATE_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_FORMAT(Date date) {
		return format(date, DATE_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_HL_FORMAT() {
		return format(new Date(), DATE_HL_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_HL_FORMAT(Date date) {
		return format(date, DATE_HL_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_HL_FORMAT(String date) {
		return formatString(date, DATE_HL_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_FORMAT() {
		return format(new Date(), DATE_TIME_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_FORMAT(Date date) {
		return format(date, DATE_TIME_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_STANDARD_FORMAT() {
		return format(new Date(), DATE_TIME_STANDARD_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_STANDARD_FORMAT(Date date) {
		return format(date, DATE_TIME_STANDARD_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_STANDARD_FORMAT(String date) {
		return format(date, DATE_TIME_STANDARD_FORMAT);
	}
	
	public static String DEFAULT_DATE_TIME_MIL_FORMAT() {
		return format(new Date(), DATE_TIME_MIL_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_MIL_FORMAT(Date date) {
		return format(date, DATE_TIME_MIL_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_MIL_STANDARD_FORMAT() {
		return format(new Date(), DATE_TIME_MIL_STANDARD_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_MIL_STANDARD_FORMAT(Date date) {
		return format(date, DATE_TIME_MIL_STANDARD_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_MIL_STANDARD_FORMAT(String date) {
		return format(date, DATE_TIME_MIL_STANDARD_FORMAT);
	}
	
	
	public static String DEFAULT_DATE_TIME_MIL_SQLSERVER_FORMAT() {
		return format(new Date(), DATE_TIME_MIL_SQLSERVER_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_MIL_SQLSERVER_FORMAT(Date date) {
		return format(date, DATE_TIME_MIL_SQLSERVER_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_DATE_TIME_MIL_SQLSERVER_FORMAT(String date) {
		return format(date, DATE_TIME_MIL_SQLSERVER_FORMAT);
	}
	
	public static String DEFAULT_DATE_TIME_ISO_FORMAT() {
		return format(new Date(), DATE_TIME_ISO_FORMAT, defaultTimeZone, defaultLocale);
	}
	public static String DEFAULT_DATE_TIME_ISO_FORMAT(Date date) {
		return format(date, DATE_TIME_ISO_FORMAT, defaultTimeZone, defaultLocale);
	}
	public static String DEFAULT_DATE_TIME_ISO_FORMAT(String date) {
		return format(date, DATE_TIME_ISO_FORMAT);
	}
	
	public static String DEFAULT_DATE_ISO_FORMAT() {
		return format(new Date(), DATE_ISO_FORMAT, defaultTimeZone, defaultLocale);
	}
	public static String DEFAULT_DATE_ISO_FORMAT(Date date) {
		return format(date, DATE_ISO_FORMAT, defaultTimeZone, defaultLocale);
	}
	public static String DEFAULT_DATE_ISO_FORMAT(String date) {
		return format(date, DATE_ISO_FORMAT);
	}
	
	public static String DEFAULT_TIME_FORMAT() {
		return format(new Date(), TIME_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_FORMAT(Date date) {
		return format(date, TIME_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_STANDARD_FORMAT() {
		return format(new Date(), TIME_STANDARD_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_STANDARD_FORMAT(Date date) {
		return format(date, TIME_STANDARD_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_STANDARD_FORMAT(String date) {
		return formatString(date, TIME_STANDARD_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_MIL_FORMAT() {
		return format(new Date(), TIME_MIL_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_MIL_FORMAT(Date date) {
		return format(date, TIME_MIL_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_MIL_STANDARD_FORMAT() {
		return format(new Date(), TIME_MIL_STANDARD_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_MIL_STANDARD_FORMAT(Date date) {
		return format(date, TIME_MIL_STANDARD_FORMAT, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_MIL_STANDARD_FORMAT_TWO() {
		return format(new Date(), TIME_MIL_STANDARD_FORMAT2, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_MIL_STANDARD_FORMAT_TWO(Date date) {
		return format(date, TIME_MIL_STANDARD_FORMAT2, defaultTimeZone, defaultLocale);
	}
	
	public static String DEFAULT_TIME_MIL_STANDARD_FORMAT_TWO(String date) {
		return formatString(date, TIME_MIL_STANDARD_FORMAT2, defaultTimeZone, defaultLocale);
	}
	
	public static String format(String pattern) {
		return format(new Date(), pattern, defaultTimeZone, defaultLocale);
	}
	
	public static String format(Date date, String pattern) {
		return format(date, pattern, defaultTimeZone, defaultLocale);
	}
	
	public static String format(Calendar calendar, String pattern) {
		return format(calendar, pattern, defaultTimeZone, defaultLocale);
	}
	
	public static String format(long millis, String pattern) {
		return format(new Date(millis), pattern, defaultTimeZone, defaultLocale);
	}
	
	public static String format(String date, String pattern) {
		return formatString(date, pattern, defaultTimeZone, defaultLocale);
	}
	
	public static String format(String pattern, TimeZone timeZone) {
		return format(new Date(), pattern, timeZone, defaultLocale);
	}
	
	public static String format(Date date, String pattern, TimeZone timeZone) {
		return format(date, pattern, timeZone, defaultLocale);
	}
	
	public static String format(Calendar calendar, String pattern, TimeZone timeZone) {
		return format(calendar, pattern, timeZone, defaultLocale);
	}
	
	public static String format(long millis, String pattern, TimeZone timeZone) {
		return format(new Date(millis), pattern, timeZone, defaultLocale);
	}
	
	public static String format(String pattern, Locale locale) {
		return format(new Date(), pattern, defaultTimeZone, locale);
	}
	
	public static String format(Date date, String pattern, Locale locale) {
		return format(date, pattern, defaultTimeZone, locale);
	}
	
	public static String format(Calendar calendar, String pattern, Locale locale) {
		return format(calendar, pattern, defaultTimeZone, locale);
	}
	
	public static String format(long millis, String pattern, Locale locale) {
		return format(new Date(millis), pattern, defaultTimeZone, locale);
	}
	
	public static String format(String pattern, TimeZone timeZone, Locale locale) {
		return format(new Date(), pattern, defaultTimeZone, locale);
	}
	
	public static String format(long millis, String pattern, TimeZone timeZone, Locale locale)
    {
        return format(new Date(millis), pattern, timeZone, locale);
    }

    public static String format(Date date, String pattern, TimeZone timeZone, Locale locale)
    {
    	SimpleDateFormat df = new SimpleDateFormat(pattern, locale);
    	df.setTimeZone(timeZone);
        return df.format(date);
    }
    
    public static String format(Calendar calendar, String pattern, TimeZone timeZone, Locale locale) {
    	SimpleDateFormat df = new SimpleDateFormat(pattern, locale);
    	df.setTimeZone(timeZone);
        return df.format(calendar);
    }
    
    public static Date formatToDate(String dateSource, String pattern) {
    	return format(dateSource, pattern, defaultTimeZone, defaultLocale);
    }
    
    public static Date format(String dateSource, String pattern, TimeZone timeZone, Locale locale) {
    	SimpleDateFormat df = new SimpleDateFormat(pattern, locale);
    	df.setTimeZone(timeZone);
        try {
			return df.parse(dateSource);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
    }
    
    public static String formatString(String dateSource, String pattern, TimeZone timeZone, Locale locale) {
    	SimpleDateFormat df = new SimpleDateFormat(pattern, locale);
    	df.setTimeZone(timeZone);
    	try {
			return df.format(df.parse(dateSource));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
    }
    
    /**
     * 格式化为solr搜索的日期格式
     * @param dateSource
     * @return
     */
    public static String formatSolrDate(String dateSource) {
    	if(null != dateSource && !"".equals(dateSource)) {
	    	// 年月日
	    	String ymd = DEFAULT_DATE_HL_FORMAT(dateSource);
	    	// 时分秒.毫秒
	    	String hmss = DEFAULT_TIME_MIL_STANDARD_FORMAT_TWO(dateSource.substring(ymd.length() + 1, dateSource.length()));
	    	return ymd + "T" + hmss + "Z";
    	}
    	return null;
    }
    
    /**
     * 格式化为ISO搜索的日期格式
     * @param dateSource
     * @return
     */
    public static String formatToISODate(String dateSource, String sourcePattern) {
    	SimpleDateFormat df = new SimpleDateFormat(sourcePattern, defaultLocale);
    	df.setTimeZone(defaultTimeZone);
    	try {
			return DEFAULT_DATE_TIME_ISO_FORMAT(df.parse(dateSource));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
    }
}
