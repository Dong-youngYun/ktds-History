package com.ktdsuniversity.edu.util;

public abstract class NumberUtil {
	//들어가는 메소드가 모두 static
	private NumberUtil() {} // 생성자 /객체화를 시킬수 없다
		
	public static byte toByte(String string) {
		try {
			return Byte.parseByte(string);
		}
		catch(NumberFormatException nfe) {
			return 0;
		}
	}
	
	public static byte toByte(String string, byte defaultValue) {
		try {
			return Byte.parseByte(string);
		}
		catch (NumberFormatException nfe) {
			return defaultValue;  //변환하다 실패하면 기본값으로 돌려줘
		}
	}
	
	public static short toShort(String string) {
		try {
			return Short.parseShort(string);
		}
		catch (NumberFormatException nfe) {
			return 0;
		}
	}
	
	public static short toShort(String string, short defaultValue) {
		try {
			return Short.parseShort(string);
		}
		catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}
	
	public static int toInt(String string) {
		try {
			return Integer.parseInt(string);
		}
		catch(NumberFormatException nfe) {
			return 0;
		}
	}
	
	public static int toInt(String string, int defaultValue) {
		try {
			return Integer.parseInt(string);
		}
		catch(NumberFormatException nfe) {
			return defaultValue;
		}
	}
	
	public static long toLong(String string) {
		try {
			return Long.parseLong(string);
		}
		catch(NumberFormatException nfe) {
			return 0;
		}
	}
	
	public static long toLong(String string, long defaultValue) {
		try {
			return Long.parseLong(string);
		}
		catch(NumberFormatException nfe) {
			return defaultValue;
		}
	}
	
	public static float toFloat(String string) {
		try {
			return Float.parseFloat(string);
		}
		catch(NumberFormatException nfe) {
			return 0.0f;
		}
		
	}
	
	public static float toFloat(String string, float defaultValue) {
		try {
			return Float.parseFloat(string);
		}
		catch(NumberFormatException nfe) {
			return defaultValue;
		}
	}
	
	public static double toDouble(String string) {
		try {
			return Double.parseDouble(string);
		}
		catch (NumberFormatException nfe) {
			return 0.0;
		}
	}
	
	public static double toDouble(String string, double defaultValue) {
		try {
			return Double.parseDouble(string);
		}
		catch(NumberFormatException nfe) {
			return defaultValue;
		}
	}

}
