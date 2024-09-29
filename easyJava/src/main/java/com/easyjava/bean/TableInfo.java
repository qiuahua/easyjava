package com.easyjava.bean;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.easyjava.bean.FieldInfo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TableInfo {
    /**
     * 表名
     */
    private String tableName;
    /**
     * bean名称
     */
    private String beanName;
    /**
     * 参数名称
     */
    private String beanParamName;
    /**
     * 评论
     */
    private String comment;
    /**
     * 字段信息
     */
    private List<FieldInfo> fieldList;
    /**
     * 唯一索引集合
     */
    private Map<String,List<FieldInfo>> keyIndexMap = new LinkedHashMap<>();
    /**
     * 是否有日期
     */
    private Boolean haveDate;
    /**
     * 是否有时间
     */
    private Boolean haveDateTime;
    /**
     * 是否有这个类型
     */
    private Boolean haveBigDecimal;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanParamName() {
        return beanParamName;
    }

    public void setBeanParamName(String beanParamName) {
        this.beanParamName = beanParamName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<FieldInfo> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<FieldInfo> fieldList) {
        this.fieldList = fieldList;
    }

    public Boolean getHaveBigDecimal() {
        return haveBigDecimal;
    }

    public void setHaveBigDecimal(Boolean haveBigDecimal) {
        this.haveBigDecimal = haveBigDecimal;
    }

    public Boolean getHaveDate() {
        return haveDate;
    }

    public void setHaveDate(Boolean haveDate) {
        this.haveDate = haveDate;
    }

    public Boolean getHaveDateTime() {
        return haveDateTime;
    }

    public void setHaveDateTime(Boolean haveDateTime) {
        this.haveDateTime = haveDateTime;
    }

    public Map<String, List<FieldInfo>> getKeyIndexMap() {
        return keyIndexMap;
    }

    public void setKeyIndexMap(Map<String, List<FieldInfo>> keyIndexMap) {
        this.keyIndexMap = keyIndexMap;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    @Override
    public String toString() {
        return "TableInfo{" +
                "beanName='" + beanName + '\'' +
                ", tableName='" + tableName + '\'' +
                ", beanParamName='" + beanParamName + '\'' +
                ", comment='" + comment + '\'' +
                ", fieldList=" + fieldList +
                ", keyIndexMap=" + keyIndexMap +
                ", haveDate=" + haveDate +
                ", haveDateTime=" + haveDateTime +
                ", haveBigDecimal=" + haveBigDecimal +
                '}';
    }
}
