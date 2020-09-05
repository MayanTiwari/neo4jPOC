package com.mt.springWeb.com.mt.springWeb.basic.graphmodels.relactions;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.Company;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.CompanyCatagory;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.CompanyClass;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "CRELATION")
public class CompanyCatagoryRelation {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Company company;
    @EndNode
    private CompanyCatagory companyCatagory;

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

    public CompanyCatagory getCompanyCatagory() {
        return companyCatagory;
    }

    public void setCompanyCatagory(CompanyCatagory companyCatagory) {
        this.companyCatagory = companyCatagory;
    }
}
