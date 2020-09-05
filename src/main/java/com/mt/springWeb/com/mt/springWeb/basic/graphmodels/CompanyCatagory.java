package com.mt.springWeb.com.mt.springWeb.basic.graphmodels;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class CompanyCatagory {
    @Id
    @GeneratedValue
    private Long id;

    public CompanyCatagory(String category) {
        this.category = category;
    }
    public CompanyCatagory(){}

    private String category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
