package org.leeframe.tool.orm.creator;

import java.util.ArrayList;
import java.util.List;

public class OrmTemplate {
	private String tableName;
	private String objectName;
	private String className;
	private String packageNamePo;
	private String packageNameDao;
	private String baseDaoName;
	private String baseDaoImplName;
	private String basePoName;
	private String pkColumnNames;
	private String pkParams;
	private Integer pkCount;
	private String pkFieldNames;
	private String pkIbatisDataType;
	private String comment;
	private List columns;
	private List columnNotPKs;
	private List columnPKs;

	public OrmTemplate() {
		columns = new ArrayList();
		columnNotPKs = new ArrayList();
		columnPKs = new ArrayList();
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPackageNamePo() {
		return packageNamePo;
	}

	public void setPackageNamePo(String packageNamePo) {
		this.packageNamePo = packageNamePo;
	}

	public String getPackageNameDao() {
		return packageNameDao;
	}

	public void setPackageNameDao(String packageNameDao) {
		this.packageNameDao = packageNameDao;
	}

	public String getBaseDaoName() {
		return baseDaoName;
	}

	public void setBaseDaoName(String baseDaoName) {
		this.baseDaoName = baseDaoName;
	}

	public String getBaseDaoImplName() {
		return baseDaoImplName;
	}

	public void setBaseDaoImplName(String baseDaoImplName) {
		this.baseDaoImplName = baseDaoImplName;
	}

	public String getBasePoName() {
		return basePoName;
	}

	public void setBasePoName(String basePoName) {
		this.basePoName = basePoName;
	}

	public String getPkColumnNames() {
		return pkColumnNames;
	}

	public void setPkColumnNames(String pkColumnNames) {
		this.pkColumnNames = pkColumnNames;
	}

	public String getPkParams() {
		return pkParams;
	}

	public void setPkParams(String pkParams) {
		this.pkParams = pkParams;
	}

	public Integer getPkCount() {
		return pkCount;
	}

	public void setPkCount(Integer pkCount) {
		this.pkCount = pkCount;
	}

	public String getPkFieldNames() {
		return pkFieldNames;
	}

	public void setPkFieldNames(String pkFieldNames) {
		this.pkFieldNames = pkFieldNames;
	}

	public String getPkIbatisDataType() {
		return pkIbatisDataType;
	}

	public void setPkIbatisDataType(String pkIbatisDataType) {
		this.pkIbatisDataType = pkIbatisDataType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List getColumns() {
		return columns;
	}

	public void setColumns(List columns) {
		this.columns = columns;
	}

	public List getColumnNotPks() {
		return columnNotPKs;
	}

	public void setColumnNotPks(List columnNotPks) {
		this.columnNotPKs = columnNotPks;
	}

	public List getColumnPks() {
		return columnPKs;
	}

	public void setColumnPks(List columnPks) {
		this.columnPKs = columnPks;
	}

}
