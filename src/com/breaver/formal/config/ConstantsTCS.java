/**
 * 
 */
package com.breaver.formal.config;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
//import java.util.Iterator;
import java.util.Properties;

/**
 * @author zzf
 * @date 2017��6��17�� ����2:25:35
 */
public class ConstantsTCS {
	private final Integer int_windowWidth;
	private final Integer int_windowHeight;
	private final String str_windowTitle;
	private final String v_defaultString = "�Ҳ���ֵ";
	private final Integer v_defaultInteger = 100;
	// ====================================
	private Properties properties = null;
	private InputStream inputStream = null;
	//��ҪĿ���ǳ��������ڼ�ֻ��ȡһ��----����
	private final static ConstantsTCS demoUnique = new ConstantsTCS();
	// private Iterator<String> iterator = null;
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * @return the demoUnique
	 */
	public static ConstantsTCS getDemoUnique() {
		return demoUnique;
	}

	public ConstantsTCS() {
		super();
		// TODO Auto-generated constructor stub
		String v_windowTtitle = v_defaultString;
		Integer v_windowWidth = v_defaultInteger;
		Integer v_windowHeight = v_defaultInteger;
		properties = new Properties();
		try {
			inputStream = new BufferedInputStream(new FileInputStream("src/constants.properties"));
			//�����������
			
			properties.load(new InputStreamReader(inputStream, "UTF-8"));
			// --------------------------��ֵ��--------��-------
			v_windowTtitle = properties.getProperty("window_title");
			v_windowHeight = Integer.parseInt(properties.getProperty("window_height"));
			v_windowWidth=Integer.parseInt(properties.getProperty("window_width"));
			// -------------------------��ֵ��--------��---------
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {// �����м����ͻ���������-----------------
			str_windowTitle = v_windowTtitle;
			int_windowHeight = v_windowHeight;
			int_windowWidth = v_windowWidth;
		}
		// ����������ܴ����ļ�----����������---��ֵ����
		// str_windowTitle = properties.getProperty("window_title");
		// str_windowTitle
	}
	
	public Integer getInt_windowWidth() {
		return int_windowWidth;
	}

	public Integer getInt_windowHeight() {
		return int_windowHeight;
	}

	public String getStr_windowTitle() {
		return str_windowTitle;
	}

}
