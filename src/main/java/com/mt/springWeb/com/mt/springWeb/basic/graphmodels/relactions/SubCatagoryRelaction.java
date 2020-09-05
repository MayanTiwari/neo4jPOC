package com.mt.springWeb.com.mt.springWeb.basic.graphmodels.relactions;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.Company;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.SubCatagory;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "SUB_CATAGORY")
public class SubCatagoryRelaction {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Company company;
    @EndNode
    private SubCatagory subCatagory;

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

    public SubCatagory getSubCatagory() {
        return subCatagory;
    }

    public void setSubCatagory(SubCatagory subCatagory) {
        this.subCatagory = subCatagory;
    }
}
