package org.leeframe.tool.orm.creator;

/**
 * @ClassName：DataTypeConverter
 * @Description：类型转换接口
 * @author boyue.lee liboyue23@sina.com
 * @date：2015-1-27 下午3:11:43
 * @version
 */
public interface DataTypeConvertor {
	
	/**
	 * DB转换java类型 convertDBDataTypeToJavaDataType
	 * 
	 * @author boyue.lee liboyue23@sina.com
	 * @version $Id: DataTypeConverter.java, v 0.1 2015-1-27 下午3:11:56 Exp $
	 * @param dbType
	 * @param javaType
	 * @param flag
	 * @return
	 */
	public String convertDBDataTypeToJavaDataType(String dbDataType,
			String dbDataScale, boolean flag);
}
