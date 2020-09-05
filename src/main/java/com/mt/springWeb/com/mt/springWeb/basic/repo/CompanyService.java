package com.mt.springWeb.com.mt.springWeb.basic.repo;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.Company;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    Neo4JStateDataRepository neo4JStateDataRepository ;
    @Autowired
    StateRepo stateRepo;

    public void save(Company company){
        this.neo4JStateDataRepository.save(company);
    }

    public void saveState(State state){
        stateRepo.save(state);
    }

    public State getStateByName(String name){
        return stateRepo.getStateByName(name);
    }
}
