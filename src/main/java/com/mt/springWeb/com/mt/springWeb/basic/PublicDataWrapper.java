package com.mt.springWeb.com.mt.springWeb.basic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class PublicDataWrapper {
    @JsonIgnore
    private double created;
    @JsonIgnore
    private double updated;
    @JsonIgnore
    private String title;
    @JsonIgnore
    private String source;
    @JsonIgnore
    private String org_type;
    @JsonIgnore
    private List<String> org;
    @JsonIgnore
    private List<String> sector;
    @JsonIgnore
    private String visualizable;
    @JsonIgnore
    private String index_name;

    @JsonIgnore
    private String active;
    @JsonIgnore
    private int count;
    @JsonIgnore int limit;
    @JsonIgnore int offset;
    @JsonIgnore String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @JsonIgnore
    private int total;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @JsonIgnore
    private String message;
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }



    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<StateData> getRecords() {
        return records;
    }

    public void setRecords(List<StateData> records) {
        this.records = records;
    }

    @JsonIgnore
    private String desc;


    private List<StateData> records;

    public double getCreated() {
        return created;
    }

    public void setCreated(double created) {
        this.created = created;
    }

    public double getUpdated() {
        return updated;
    }

    public void setUpdated(double updated) {
        this.updated = updated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOrg_type() {
        return org_type;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
    }

    public List<String> getOrg() {
        return org;
    }

    public void setOrg(List<String> org) {
        this.org = org;
    }

    public List<String> getSector() {
        return sector;
    }

    public void setSector(List<String> sector) {
        this.sector = sector;
    }

    public String getVisualizable() {
        return visualizable;
    }

    public void setVisualizable(String visualizable) {
        this.visualizable = visualizable;
    }

    public String getIndex_name() {
        return index_name;
    }

    public void setIndex_name(String index_name) {
        this.index_name = index_name;
    }

    public String getCatalog_uuid() {
        return catalog_uuid;
    }

    public void setCatalog_uuid(String catalog_uuid) {
        this.catalog_uuid = catalog_uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Field> getField() {
        return field;
    }

    public void setField(List<Field> field) {
        this.field = field;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    @JsonIgnore
    private String catalog_uuid;
    @JsonIgnore
    private String status;
    @JsonIgnore
    private List<Field> field;
    @JsonIgnore
    private String created_date;
    @JsonIgnore
    private String updated_date;


}
