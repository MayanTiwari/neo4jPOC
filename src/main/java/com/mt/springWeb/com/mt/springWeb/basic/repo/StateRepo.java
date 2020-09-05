package com.mt.springWeb.com.mt.springWeb.basic.repo;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.State;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface StateRepo extends Neo4jRepository<State,Long> {

    State getStateByName(String name);
}
