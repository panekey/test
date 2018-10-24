package com.panekey.sBMDemo.pojo;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @ClassName: Message.java
 * @Description:  ������Ϣ����
 * @version: 1.0.0
 * @author panekey
 * @date: 2018��09��14�� ����14:19:43
 */
public class Message extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	/**
	 * ��ʼ��һ���´����� Message ����Ĭ�ϳɹ���
	 */
	public Message() {
		put("code", 0);
		put("msg", "�����ɹ�");
	}
	
	public static Message error(){
		return error(1, "����ʧ��");
	}
	
	/**
	 * ���ش�����Ϣ
	 * 
	 * @param msg
	 *            ����
	 * @return ������Ϣ
	 */
	public static Message error(String msg) {
		return error(1, msg);
	}

	/**
	 * ���ش�����Ϣ
	 * 
	 * @param code
	 *            ������
	 * @param msg
	 *            ����
	 * @return ������Ϣ
	 */
	public static Message error(int code, String msg) {
		Message json = new Message();
		json.put("code", code);
		json.put("msg", msg);
		return json;
	}

	/**
	 * ���سɹ���Ϣ
	 * 
	 * @param msg
	 *            ����
	 * @return �ɹ���Ϣ
	 */
	public static Message ok(String msg) {
		Message json = new Message();
		json.put("msg", msg);
		return json;
	}

	/**
	 * ���سɹ���Ϣ
	 * 
	 * @param map
	 *            ����
	 * @return �ɹ���Ϣ
	 */
	public static Message ok(Map<String, Object> map) {
		Message json = new Message();
		json.putAll(map);
		return json;
	}

	/**
	 * ���سɹ���Ϣ
	 * 
	 * @return �ɹ���Ϣ
	 */
	public static Message ok() {
		return new Message();
	}

	/**
	 * ���سɹ���Ϣ
	 * 
	 * @param key
	 *            ��ֵ
	 * @param value
	 *            ����
	 * @return �ɹ���Ϣ
	 */
	@Override
	public Message put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}

