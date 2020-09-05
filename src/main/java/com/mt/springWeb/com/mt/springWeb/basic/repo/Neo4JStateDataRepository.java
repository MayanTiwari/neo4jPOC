package com.mt.springWeb.com.mt.springWeb.basic.repo;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.Company;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface Neo4JStateDataRepository extends Neo4jRepository<Company,Long> {

}
