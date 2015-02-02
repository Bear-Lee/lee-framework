package org.leeframe.tool.orm.creator;

/**
 * @ClassName：DefaultDataTypeConvertor
 * @Description：
 * @author boyue.lee liboyue23@sina.com
 * @date：2015-1-27 下午3:13:54
 * @version
 */
public class DefaultDataTypeConvertor implements DataTypeConvertor {

	public String convertDBDataTypeToJavaDataType(String dbDataType,
			String dbDataScale, boolean isPk) {
		String javaDataType = null;
		dbDataType = dbDataType.toLowerCase();
		int length = dbDataType.length();
		// 判断日期类型
		if (length >= 4 && "date".equals(dbDataType.substring(0, 4))
				|| length >= 9
				&& "timestamp".equals(dbDataType.substring(0, 9))) {
			javaDataType = "Date";
		} else if ("number".equals(dbDataType)) {
			if ("0".equals(dbDataScale)) {
				if (isPk) {
					javaDataType = "Long";
				} else {
					javaDataType = "Integer";
				}
			} else {
				javaDataType = "Double";
			}
		} else {
			javaDataType = "String";
		}
		return javaDataType;
	}

}
