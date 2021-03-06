package com.ejlchina.okhttps;

import java.util.Set;

/**
 * 映射结构的只读数据集
 *
 * @since 2.0.0
 * Mapper 接口，类似于 json
 * 但为什么不取名为 json 呢，因它不止是 json，它还可以是 xml、yml、protobuf 等任何一种格式的数据
 * @author 15735
 */
public interface Mapper extends DataSet {

	/**
	 * @param key 键名
	 * @return 子 JsonObj
	 */
	Mapper getMapper(String key);
	
	/**
	 * @param key 键名
	 * @return 子 JsonArr
	 */
	Array getArray(String key);
	
	/**
	 * @param key 键名
	 * @return boolean 值
	 */
	boolean getBool(String key);

	/**
	 * @param key 键名
	 * @return int 值
	 */
	int getInt(String key);
	
	/**
	 * @param key 键名
	 * @return long 值
	 */
	long getLong(String key);
	
	/**
	 * @param key 键名
	 * @return float 值
	 */
	float getFloat(String key);
	
	/**
	 * @param key 键名
	 * @return double 值
	 */
	double getDouble(String key);
	
	/**
	 * @param key 键名
	 * @return String 值
	 */
	String getString(String key);

	/**
	 * @param key 键名
	 * @return 是否有该键
	 */
	boolean has(String key);
	
	/**
	 * @return JSON 的键集合
	 */
	Set<String> keySet();

}
