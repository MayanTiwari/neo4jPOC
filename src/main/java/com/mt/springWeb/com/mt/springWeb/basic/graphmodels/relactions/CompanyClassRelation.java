package com.mt.springWeb.com.mt.springWeb.basic.graphmodels.relactions;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.Company;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.CompanyClass;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "CCLASS")
public class CompanyClassRelation {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Company company;
    @EndNode
    private CompanyClass companyClass;

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

    public CompanyClass getCompanyClass() {
        return companyClass;
    }

    public void setCompanyClass(CompanyClass companyClass) {
        this.companyClass = companyClass;
    }
}
