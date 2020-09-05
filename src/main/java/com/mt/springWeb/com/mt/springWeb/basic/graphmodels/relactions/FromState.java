package com.mt.springWeb.com.mt.springWeb.basic.graphmodels.relactions;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.Company;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.State;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "FROM_STATE")
public class FromState {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Company company;
    @EndNode
    private State state;

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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
