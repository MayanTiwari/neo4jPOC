package com.mt.springWeb.com.mt.springWeb.basic.graphmodels;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class PrincipalBusinessCatagory {
    @Id
    @GeneratedValue
    private Long id;

    private String principalBusinessCatagory;

    public PrincipalBusinessCatagory(String principalBusinessCatagory) {
        this.principalBusinessCatagory = principalBusinessCatagory;
    }
    public PrincipalBusinessCatagory(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrincipalBusinessCatagory() {
        return principalBusinessCatagory;
    }

    public void setPrincipalBusinessCatagory(String principalBusinessCatagory) {
        this.principalBusinessCatagory = principalBusinessCatagory;
    }
}
