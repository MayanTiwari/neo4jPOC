package com.mt.springWeb.com.mt.springWeb.basic.graphmodels;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class SubCatagory {
    @Id
    @GeneratedValue
    private Long id;

    private String subCatagory;

    public SubCatagory(String subCatagory) {
        this.subCatagory = subCatagory;
    }
    public SubCatagory(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubCatagory() {
        return subCatagory;
    }

    public void setSubCatagory(String subCatagory) {
        this.subCatagory = subCatagory;
    }
}
