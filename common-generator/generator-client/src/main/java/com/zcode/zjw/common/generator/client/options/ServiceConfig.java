package com.zcode.zjw.common.generator.client.options;

import com.zcode.zjw.common.generator.client.common.Constant;
import com.zcode.zjw.common.generator.client.models.TableAttributeKeyValue;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

/**
 * Service属性的配置文件
 * 
 * @author zhangjiwei
 *
 */
public class ServiceConfig {
	/** 设置的tableItem */
	private List<TableAttributeKeyValue> tableItem = new ArrayList<>();
	/** 生成模板的名字 */
	private String templateName = Constant.TEMPLATE_NAME_SERVICE;
	/** 是否覆盖原文件 */
	private boolean overrideFile = true;

	/**
	 * 初始化
	 */
	public ServiceConfig() {
		super();
	}

	/**
	 * 通过 ObservableList<TableAttributeKeyValue>初始化
	 * 
	 * @param tableItem
	 */
	public ServiceConfig(ObservableList<TableAttributeKeyValue> item) {
		super();
		if (item != null && !item.isEmpty()) {
			tableItem.addAll(item);
		}
	}

	/**
	 * 通过 ObservableList<TableAttributeKeyValue>初始化
	 * 
	 * @param tableItem
	 */
	public ServiceConfig(ObservableList<TableAttributeKeyValue> item, String templateName, boolean overrideFile) {
		super();
		if (item != null && !item.isEmpty()) {
			tableItem.addAll(item);
		}
		this.templateName = templateName;
		this.overrideFile = overrideFile;
	}

	/**
	 * 初始化默认数据
	 */
	public ServiceConfig initDefaultValue() {
		tableItem.add(new TableAttributeKeyValue("select", "find", "查询所有数据"));
		tableItem.add(new TableAttributeKeyValue("selectById", "findOne", "通过id查询数据"));
		tableItem.add(new TableAttributeKeyValue("insertNotNull", "saveNotNull", "插入不为空的数据"));
		tableItem.add(new TableAttributeKeyValue("updateNotNull", "updateNotNullById", "更新不为空的数据"));
		tableItem.add(new TableAttributeKeyValue("updateNotNullByAssist", "updateNotNullByAssist", "Assist更新不为空的数据"));
		tableItem.add(new TableAttributeKeyValue("deleteById", "deleteById", "通过id删除数据"));
		tableItem.add(new TableAttributeKeyValue("deleteByAssist", "deleteByAssist", "通过Assist删除数据"));
		return this;
	}

	/**
	 * 设置属性集合
	 * 
	 * @return
	 */
	public List<TableAttributeKeyValue> getTableItem() {
		return tableItem;
	}

	/**
	 * 获取属性集合
	 * 
	 * @param tableItem
	 */
	public void setTableItem(List<TableAttributeKeyValue> tableItem) {
		this.tableItem = tableItem;
	}

	/**
	 * 获得模板的名称
	 * 
	 * @return
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * 设置模板的名称
	 * 
	 * @param templateName
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	/**
	 * 获取是否覆盖原文件
	 * 
	 * @return
	 */
	public boolean isOverrideFile() {
		return overrideFile;
	}

	/**
	 * 设置是否覆盖原文件
	 * 
	 * @param overrideFile
	 */
	public void setOverrideFile(boolean overrideFile) {
		this.overrideFile = overrideFile;
	}

	@Override
	public String toString() {
		return "ServiceConfig [tableItem=" + tableItem + ", templateName=" + templateName + ", overrideFile=" + overrideFile + "]";
	}

}
