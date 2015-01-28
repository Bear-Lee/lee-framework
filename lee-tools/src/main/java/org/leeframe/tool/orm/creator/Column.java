package org.leeframe.tool.orm.creator;

public class Column {
	private String columnName;// 字段名
	private String fieldName;// 属性名
	private String isPk;// 主键
	private String dataType;// 属性类型
	private String jdbcDataType;// 字段类型
	private String comment;// 注释
	private String fieldNameFirstCharUpcase;//

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getIsPk() {
		return isPk;
	}

	public void setIsPk(String isPk) {
		this.isPk = isPk;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getJdbcDataType() {
		return jdbcDataType;
	}

	public void setJdbcDataType(String jdbcDataType) {
		this.jdbcDataType = jdbcDataType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getFieldNameFirstCharUpcase() {
		return fieldNameFirstCharUpcase;
	}

	public void setFieldNameFirstCharUpcase(String fieldNameFirstCharUpcase) {
		this.fieldNameFirstCharUpcase = fieldNameFirstCharUpcase;
	}

}
