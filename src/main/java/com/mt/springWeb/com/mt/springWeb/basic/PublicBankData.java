package com.mt.springWeb.com.mt.springWeb.basic;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class PublicBankData {

    private double created;
    private double updated;
    private String title;
    private String source;
    private String org_type;
    private List<String> org;
    private List<String> sector;
    private String visualizable;
    private String index_name;
    private String catalog_uuid;
    private String status;
    private List<Field> field;
    private String created_date;
    private String updated_date;

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    private String active;
    private String message;
    private int total;
    private int count;
    private String limit;
    private String offset;
    @JsonIgnore
    private List<PublicSectorBanks> records;
    private String version;


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

    public List<PublicSectorBanks> getRecords() {
        return records;
    }

    public void setRecords(List<PublicSectorBanks> records) {
        this.records = records;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
