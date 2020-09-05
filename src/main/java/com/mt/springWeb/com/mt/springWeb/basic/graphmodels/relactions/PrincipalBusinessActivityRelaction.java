package com.mt.springWeb.com.mt.springWeb.basic.graphmodels.relactions;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.Company;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.PrincipalBusinessCatagory;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "PBC")
public class PrincipalBusinessActivityRelaction {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Company company;
    @EndNode
    PrincipalBusinessCatagory principalBusinessCatagory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public PrincipalBusinessCatagory getPrincipalBusinessCatagory() {
        return principalBusinessCatagory;
    }

    public void setPrincipalBusinessCatagory(PrincipalBusinessCatagory principalBusinessCatagory) {
        this.principalBusinessCatagory = principalBusinessCatagory;
    }
}
