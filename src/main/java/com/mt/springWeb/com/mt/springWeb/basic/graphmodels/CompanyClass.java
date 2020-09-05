package com.mt.springWeb.com.mt.springWeb.basic.graphmodels;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class CompanyClass {
    @Id
    @GeneratedValue
    private Long id;

    private String className;

    public CompanyClass(String className) {
        this.className = className;
    }
    public CompanyClass(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
